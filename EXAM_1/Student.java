public class Student {
    // Properties
    // surname
    String surname;

    // Properties
    // firstname
    String firstname;

    // middleInitial
    char middleInitial;

    // dateOfBirth
    String dateOfBirth;

    //studentNumber
    int studentNumber;

    //studentEmailAddress
    String studentEmailAddress;

    //iAmAwesome
    boolean iAmAwesome; 

    public void sayMyStudentNumber() {
        System.out.println("Student Number:"+studentNumber);
    }
    public void sayMyEmailAddress() {
        System.out.println("Email Address:"+studentEmailAddress);
    }
    public void iAmAwesome() {
        System.out.println("i Am Awesome= "+ iAmAwesome +"\n");
    }


}
