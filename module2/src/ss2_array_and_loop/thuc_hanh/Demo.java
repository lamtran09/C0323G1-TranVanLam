package ss2_array_and_loop.thuc_hanh;

public class Demo {
    public static void main(String[] args) {
        int dem = 0;
        int so = 2;
        while (dem <= 20) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(so); i++) {
                if (so % i == 0) {
                    check = false;

                    break;
                }
            }
            if (check) {
                System.out.println(so);
                dem++;
            }
            so++;
        }
    }
}
