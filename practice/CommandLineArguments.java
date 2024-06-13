public class CommandLineArguments {
    public static void main(String args[]) {
        System.out.println(" Java program to take input as a command line argument.");
        System.out.println("********************************************************************");
        System.out.println("Test case: \r\n" +"Input:  \r\n" + "Java Sample Lakshay  Kumar GEHU B.Tech 4th \r\n" + "Output: \r\n" + "Name:    Lakshay Kumar   \r\n" + "Course:  B.Tech    \r\n" + "UniversityRollNo: GEHU \r\n" + "Semester: 4th ");
        if (args.length < 4) {
            System.out.println("Usage: java CommandLineArguments <name> <course>        <roll_number> <semester>");
            return;
        }

        String fullName = args[0];
        String[] namePart = fullName.split(" ");
        String name = namePart[0];
        String surname = namePart[1];
        String course = args[1];
        String uniRoll = args[2];
        String semester = args[3];

        System.out.println("\n");
        System.out.println("Name : " + name + " " + surname + " \t\tUniversity Roll No. : " + uniRoll);
        System.out.println("Course : " + course + "\t\t\tSemester : " + semester);
        System.out.println("\n");
        System.out.println("********************************************************************");
        System.out.println("Implemented by : Priyanshu Thapliyal \tBtech CSE\tA2\t 46");
        System.out.println("********************************************************************");
        System.out.println("\n");
    }
}

