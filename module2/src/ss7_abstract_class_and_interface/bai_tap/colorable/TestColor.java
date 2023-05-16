package ss7_abstract_class_and_interface.bai_tap.colorable;

public class TestColor {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(3,"Red",true);
        shape[1] = new Square("Black",true,9);
        shape[2] = new Circle(4,"Blue",true);
        for (Shape a: shape){
            if(a instanceof Colorable){
                 ((Colorable) a).howToColor();
            }else {
                System.out.println(a.toString());
            }
        }
    }
}
