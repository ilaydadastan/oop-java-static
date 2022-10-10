public class Student {
    private String firstName;
    private String lastName;
    private int stdNo;
    private String field;
    public static String code="###";

    public Student(String firstName, String lastName, int ogrNo, String bolum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.stdNo = ogrNo;
        this.field = bolum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStdNo() {
        return stdNo;
    }

    public void setStdNo(int stdNo) {
        this.stdNo = stdNo;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public static void registerStudent(){
        System.out.println("Welcome to university...");
    }
    public static String getCode(){
        return code;
    }

    public String getStudentAll(){
        return firstName + " " + lastName + " " +  "\nno: " + stdNo +"\n" + field;
    }
}
