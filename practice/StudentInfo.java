public class StudentInfo {
    private String name;
    private int age;
    private String grade;

    public StudentInfo(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.printf("%-20s %-10s %-5s\n", name, age, grade);
    }

    public static void main(String[] args) {
        StudentInfo[] students = new StudentInfo[3];
        
        students[0] = new StudentInfo("John", 18, "A");
        students[1] = new StudentInfo("Emily", 17, "B");
        students[2] = new StudentInfo("Michael", 16, "C");

        System.out.printf("%-20s %-10s %-5s\n", "Name", "Age", "Grade");
        for (StudentInfo student : students) {
            student.displayInfo();
        }
        System.out.println("\n");
        System.out.println("********************************************************************");
        System.out.println("Implemented by : Priyanshu Thapliyal \tBtech CSE\tA2\t 46");
        System.out.println("********************************************************************");
        System.out.println("\n");
    }
}
