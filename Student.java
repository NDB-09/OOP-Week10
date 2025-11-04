public class Student extends Person {
    public String id;

    /**
     * Constructor.
     */
    public Student() {
        super();
        this.id = "";
    }

    public Student(String fullName, String email, String id) {
        super(fullName, email);
        this.id = id;
    }

    /**
     * Id.
     */
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Student: " + fullName + " (" + id + ", " + email + ")";
    }
}