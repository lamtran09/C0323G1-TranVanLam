package demo;


import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate d1 = LocalDate.of(2017, 5, 1);
        LocalDate d2 = LocalDate.of(2023, 5, 18);

        Period days = Period.between(d1, d2);
        System.out.println( days.getYears() );
    }
}
