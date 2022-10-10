public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("ilayda", "dastan", 123, "Computer Engineering");
        Student student2 = new Student("ahmet can", "kepenek", 123, "Industry Engineering");
        Student student3 = new Student("ilayda", "nur", 123, "Software Engineering");

        System.out.println(student1.getField());
        System.out.println(student2.getStdNo());
        System.out.println(student3.getStudentAll());

        Student.registerStudent();
        System.out.println(Student.getCode());


    }
}