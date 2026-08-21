public class Encapsulation {
    private String studentName;
    private int marks;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
ks
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks!");
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public int getMarks() {
        return marks;
    }

    public static void main(String[] args) {

        Encapsulation student = new Encapsulation();

        student.setStudentName("Sneha");
        student.setMarks(85);

        System.out.println("Student: " + student.getStudentName());
        System.out.println("Marks: " + student.getMarks());
    }
}
