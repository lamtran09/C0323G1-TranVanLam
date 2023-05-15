package ss5_access_modifier_static.bai_tap.lop_chi_ghi_trong_java;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        student.setName("Hello");
        student.setClasses("C03");
        System.out.println(student);
    }
}
