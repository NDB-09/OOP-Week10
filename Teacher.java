public class Teacher extends Person {
    public String title;
    public String id;

    /**
     * Constructor.
     */
    public Teacher() {
        super();
        this.id = "";
        this.title = "";
    }

    public Teacher(String fullName, String email, String id, String title) {
        super(fullName, email);
        this.id = id;
        this.title = title;
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

    /**
     * tittle.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return "Teacher: " + fullName + " (" + id + ", " + email + ", " + title + ")";
    }
}