package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRectangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Digite os valores de base e altura do retângulo");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        rectangle.area();
        rectangle.diagonal();
        rectangle.perimeter();
        System.out.println(rectangle);

        sc.close();

    }
}