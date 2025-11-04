public class KLTN<T extends Student, V> implements Comparable<KLTN<T, V>> {
    private T student;
    private V advisor;
    private String topicName;

    /**
     * Constructor.
     */
    public KLTN(T student, V advisor, String topicName) {
        this.student = student;
        this.advisor = advisor;
        this.topicName = topicName;
    }

    /**
     * topicName.
     */
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicName() {
        return this.topicName;
    }

    @Override
    public int compareTo(KLTN<T, V> other) {
        return this.student.getFullName().compareToIgnoreCase(other.student.getFullName());
    }

    @Override
    public String toString() {
        return "KLTN: " + student + "\n  " + topicName + "\n  " + advisor + "\n";
    }
} 