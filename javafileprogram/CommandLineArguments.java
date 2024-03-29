public class CommandLineArguments {
    public static void main(String args[]) {
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

