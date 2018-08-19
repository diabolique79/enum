import java.util.Locale;
import java.util.Scanner;

public class Rectangle  extends Shape{

    private double sideA;
    private double sideB;
    private double area;

    @Override
    public double areaCalculation() {

        area = sideA*sideB;
        return area;
    }

    @Override
    public void setInformation() {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Wprowadź długość pierwszego boku prostokąta: ");
        sideA = scanner.nextDouble();
        System.out.println("Wprowadź długość drugiego boku prostokąta: ");
        sideB = scanner.nextDouble();

    }

    @Override
    public void viewArea() {

        System.out.printf("Pole prostokąta o wymiarach boków: %.2f oraz %.2f wynosi %.2f.", sideA, sideB, area);

    }
}
