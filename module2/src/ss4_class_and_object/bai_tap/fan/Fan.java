package ss4_class_and_object.bai_tap.fan;

import java.util.Scanner;

public class Fan {
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    String name;
    int year;


    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "Blue";
    }

    public Fan(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        switch (speed) {
            case 1:
                this.speed = SLOW;
                System.out.println("Slow");
                break;
            case 2:
                this.speed = MEDIUM;
                System.out.println("Medium");
                break;
            case 3:
                this.speed = FAST;
                System.out.println("Fast");
                break;
            default:
                System.out.println("!!!");;
        }
    }

    public Fan( int speed, boolean on, String color,double radius ){
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }

        public void setOn ( boolean on){
            this.on = on;
        }

        public boolean isOn () {
            return on;
        }

        public double getRadius () {
            return radius;
        }

        public void setRadius ( double radius){
            this.radius = radius;
        }

        public String getColor () {
            return color;
        }


        public void setColor (String color){
            this.color = color;
        }

        public void say () {
            Scanner scanner = new Scanner(System.in);
            String say;
            System.out.print(this.name + " say: ");
            say = scanner.nextLine();
            System.out.println(say);
        }

        @Override
        public String toString () {
            return "Fan{" +
                    "speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
