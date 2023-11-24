 package Assignment_05;
class Student {
    String studentName;

    void displayDetails() {
        System.out.println("Student's Name: " + studentName);
    }
}

class School_01 extends Student {
    String schoolName;

    void displayDetails() {
        super.displayDetails(); // Calling the parent class function
        System.out.println("School Name: " + schoolName);
    }

    public static void main(String[] args) {
        School_01 school = new School_01();
        school.schoolName = "NCCM";
        school.studentName = "Alex";
        System.out.println(school.studentName + " studies in " + school.schoolName);

        school.displayDetails();
    }
}
