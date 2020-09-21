// I (Maxim Vancompernolle) worked on the homework assignment alone, using only course materials.
public class StudentDriver {
    public static void main(String[] args) {
        Student student1 = new Student("Maxim", 1, 2, 3.5, 50.0, 15.0);
        Student student2 = new Student("Maxim", 2, 1, 3.5, 50.0, 15.0);
        System.out.println(student1);
        System.out.println(student1.equals(student2));
    }
}