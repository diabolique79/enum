import java.util.Locale;
import java.util.Scanner;

public class Circle extends Shape {

    private double area;
    private double radius;

    @Override
    public void setInformation() {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Wprowadź długość promienia koła: ");
        radius = scanner.nextDouble();

    }

    @Override
    public double areaCalculation() {

        area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public void viewArea() {

        System.out.printf("Pole koła o promieniu %.2f wynosi: %.2f", radius, area);
    }


}
