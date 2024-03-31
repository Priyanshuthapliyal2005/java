class Student {
    String name;
    static String school;

    public static void changeSchool(String s) {
        school = s; // Assign the value directly to the static variable
    }
}

public class statickeyin {
    public static void main(String args[]) {
        Student.school = "DPS"; // Access static variable directly
        Student s1 = new Student();
        s1.name = "Rahul";
        Student s2 = new Student();
        s2.name = "Rohit";
        System.out.println(s1.name + " studies in " + Student.school);
        Student.changeSchool("St. Mary's"); // Access static method directly
        System.out.println(s2.name + " studies in " + Student.school);
    }
}
