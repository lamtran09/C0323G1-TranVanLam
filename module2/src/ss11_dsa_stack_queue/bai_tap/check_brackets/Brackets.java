package ss11_dsa_stack_queue.bai_tap.check_brackets;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.println("Nhập vào biểu thức cần kiểm tra dấu ngoặc: ");
        string = scanner.nextLine();
        Stack<Character> bStack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                bStack.push(string.charAt(i));
            } else if (string.charAt(i)==')') {
                if(bStack.isEmpty()){
                    flag = false;
                    break;
                }if(bStack.pop()==string.charAt(i)){
                    flag = true;
                    break;
                }
            }
        }if(bStack.isEmpty()&&flag==true){
            System.out.println("Oke");
        }else {
            System.out.println("Biểu thức bị sai rồi!!!");
        }

    }
}