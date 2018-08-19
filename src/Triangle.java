

import java.util.Locale;
import java.util.Scanner;

public class Triangle extends Shape {

    private double hight;
    private double base;
    private double area;

    @Override
    public double areaCalculation() {

        area = (base * hight) / 2;
        return area;
    }

    @Override
    public void setInformation() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Wprowadź długość podstawy trójkąta: ");
        base = scanner.nextDouble();
        System.out.println("Wprowadź wysokość trójkąta: ");
        hight = scanner.nextDouble();
    }

    @Override
    public void viewArea() {

        System.out.printf("Pole trójkąta o wymiarach podstawy: %.2f oraz wysokości %.2f wynosi %.2f.", base, hight, area);
    }
}


