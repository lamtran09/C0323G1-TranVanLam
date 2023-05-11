package ss4_class_and_object.bai_tap.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println(" Nhập giá trị a");
        a= scanner.nextDouble();
        System.out.println(" Nhập giá trị b");
        b= scanner.nextDouble();
        System.out.println(" Nhập giá trị c");
        c= scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant()>=0){
            System.out.println(" Phương trình có 2 nghiệm phân biệt");
            System.out.println(quadraticEquation.getRoot1()+" và "+ quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant()==0) {
            System.out.println("Phương trình có ngiệm kép");
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
