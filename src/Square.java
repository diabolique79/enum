import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Square extends Shape {

    private double sideA;
    private double area;

    @Override
    public void setInformation() {

        boolean ok = false;
        while (!ok) {
            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.US);
            System.out.println("Wprowadź długość boku kwadratu: ");
            try {
                sideA = scanner.nextDouble();
                ok=true;
            } catch (InputMismatchException f) {
                System.out.println("Wprowadziłeś błędną liczbę, wprowadź ją ponownie: ");
                sideA = scanner.nextDouble();
                ok = false;
            }
        }

    }

    @Override
    public double areaCalculation() {

        area = Math.pow(sideA, 2);
        return area;
    }

    @Override
    public void viewArea() {

        System.out.printf("Pole kwadratu o boku %.2f wynosi: %.2f", sideA, area);
    }
}
