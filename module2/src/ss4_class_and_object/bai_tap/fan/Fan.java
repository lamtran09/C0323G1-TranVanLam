package ss4_class_and_object.bai_tap.fan;

import java.util.Scanner;

public class Fan {
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    int speed;
    boolean on;
    double radius;
    String color;
    String name;
    int year;


    public Fan(int speed, boolean on,double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public Fan(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
            this.speed = FAST;
            this.speed = MEDIUM;
            this.speed = SLOW;
    }

        public void setOn ( boolean on){
            this.on = on;
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
        public void say(){
            Scanner scanner = new Scanner(System.in);
            String say ;
            System.out.print(this.name+" say: ");
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
