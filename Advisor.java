public class Advisor extends Person {
    /**
     * Constructor.
     */
    public Advisor() {
        super();
    }

    public Advisor(String fullName, String email) {
        super(fullName, email);
    }

    @Override
    public String toString() {
        return "Advisor: " + fullName + " (" + email + ")";
    }
}