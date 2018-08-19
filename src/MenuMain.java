import java.util.Scanner;

public class MenuMain {

    public static void main(String[] args) {

        System.out.println("Program, który oblicza pola poszczególnych figur. Do wyboru znajdują się: ");
        Menu[] shapes = Menu.values();

        for (Menu shape : shapes) {

            System.out.println(shape);

        }
        boolean isTrue = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź poprawną nazwę figury: ");
        String userInput = scanner.nextLine();
        userInput = userInput.toUpperCase();

        while (!isTrue) {
            try {

                Menu menu = Menu.valueOf(userInput);
                Shape shape1 = menu.getShape();
                shape1.setInformation();
                shape1.areaCalculation();
                shape1.viewArea();
                isTrue = true;


            } catch (IllegalArgumentException e) {

                System.out.println("Wprowadziłeś błędną nazwę. Wprowadź ponownie nazwe figury:");
                userInput = scanner.nextLine();
                userInput = userInput.toUpperCase();
                isTrue = false;

            }


        }
    }
}


