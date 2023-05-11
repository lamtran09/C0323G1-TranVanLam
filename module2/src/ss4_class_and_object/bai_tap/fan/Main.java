package ss4_class_and_object.bai_tap.fan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Danh sách quạt");
        Fan fan = new Fan(1, false,5, "Blue");
        Fan fan1 = new Fan(fan.FAST, true,10,"Yellow");
        System.out.println("Quạt thứ 1: "+fan1);
        Fan fan2 = new Fan(fan.SLOW,false,5,"Blue");
        System.out.println("Quạt thứ 2: "+fan2);
        Fan lam = new Fan("Lâm",22);
        Fan tan = new Fan("Tân",23);
        System.out.println("Có một khách hàng đi vào và nói ");
        lam.say();
        System.out.println("Người bán quạt chào khách hàng");
        tan.say();
        System.out.println("Giao dịch mua quạt");
        lam.say();
        tan.say();
        System.out.println("Warning!!!Giao dịch thành công !!!");
    }
}
