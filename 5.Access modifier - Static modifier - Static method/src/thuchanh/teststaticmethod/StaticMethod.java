package thuchanh.teststaticmethod;

public class StaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student st1 = new Student(111, "Tiến bịp");
        Student st2 = new Student(111, "Nam bedee");
        Student st3 = new Student(111, "Cháu Hùng");

        st1.display();
        st2.display();
        st3.display();
    }
}
