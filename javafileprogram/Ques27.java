import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private double salary;
    private Date dateOfJoining;

    public Employee(int id, String name, double salary, Date dateOfJoining) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }

    public int getId() {
        return id;
}

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dateOfJoining=" + dateOfJoining + "]";
    }

    private void writeObject(ObjectOutputStream outputStream) throws IOException {
        outputStream.defaultWriteObject();
        outputStream.writeObject(dateOfJoining);
    }

    private void readObject(ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
        inputStream.defaultReadObject();
        dateOfJoining = (Date) inputStream.readObject();
    }
}

public class Ques27 {

    private static final String FILE_NAME = "employees.dat";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        createFileAndAddEmployees(scanner);

        System.out.print("Do you want to add more employees to the file? (yes/no): ");
        String answer = scanner.next();

        if (answer.equalsIgnoreCase("yes")) {
            addMoreEmployeesToFile(scanner);
        }

        System.out.println("Employees in the file:");

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            Employee employee;
            while ((employee = (Employee) inputStream.readObject()) != null) {
                System.out.println(employee);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        scanner.close();
    }

    private static void createFileAndAddEmployees(Scanner scanner) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            System.out.print("Enter number of employees: ");
            int numEmployees = scanner.nextInt();

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            for (int i = 0; i < numEmployees; i++) {
                System.out.print("Enter employee ID: ");
                int id = scanner.nextInt();
                System.out.print("Enter employee name: ");
                String name = scanner.next();
                System.out.print("Enter employee salary: ");
                double salary = scanner.nextDouble();
                System.out.print("Enter employee date of joining (yyyy-mm-dd): ");
                String dateString = scanner.next();

                Date dateOfJoining = dateFormat.parse(dateString);

                Employee employee = new Employee(id, name, salary, dateOfJoining);
                outputStream.writeObject(employee);
            }
        } catch (IOException | ParseException e) {
            System.err.println("Error creating file: " + e.getMessage());
        }
    }

    private static void addMoreEmployeesToFile(Scanner scanner) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME, true))) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            System.out.print("Enter employee ID: ");
            int id = scanner.nextInt();
            System.out.print("Enter employee name: ");
            String name = scanner.next();
            System.out.print("Enter employee salary: ");
            double salary = scanner.nextDouble();System.out.print("Enter employee date of joining (yyyy-mm-dd): ");
            String dateString = scanner.next();

            Date dateOfJoining = dateFormat.parse(dateString);

            Employee employee = new Employee(id, name, salary, dateOfJoining);
            outputStream.writeObject(employee);

            System.out.println("Employee added to the file.");
        } catch (IOException | ParseException e) {
            System.err.println("Error adding employee to file: " + e.getMessage());
        }
    }
}

