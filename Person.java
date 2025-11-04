public abstract class Person {
    protected String fullName;
    protected String email;

    /**
     * Constructor.
     */
    public Person() {
        this.fullName = "";
        this.email = "";
    }

    public Person(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    /**
     * fullName.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return this.fullName;
    }

    /**
     * email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    /**
     * toString.
     */
    public abstract String toString();
}