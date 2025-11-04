public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Nguyen Van A", "a@gmail.com", "S001");
        Student s2 = new Student("Le Thi B", "b@gmail.com", "S002");
        Teacher t1 = new Teacher("Pham Tien Dung", "dung@uni.edu", "T01", "Dr.");
        Advisor a1 = new Advisor("Doan Quoc Khanh", "khanh@company.com");

        ListKLTN<KLTN<Student, Person>> list = new ListKLTN<>();
        list.add(new KLTN<>(s1, t1, "AI-based System"));
        list.add(new KLTN<>(s2, a1, "Blockchain Analysis"));

        System.out.println("=== Danh sách khóa luận (sắp xếp theo tên sinh viên) ===");
        list.print();
    }
}
