package problema1.application;

import problema1.application.entites.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        //Fazer um programa para ler as medidas dos lados de dois triangulos X e Y (suponha medidas válidas) em seguida,
        //mostrar o valor das areas dos doid triangulos e dizer qual dos dois triangulos possui a maior area.
        //formula: area = raiz quadrada de p(p-a) * (p-b) * (p-c) onde p = a+b+c sobre 2;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*double xA, xB, xC, yA, yB, yC;*/
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        /*double p = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt(p * (  p - x.a) * (p - x.b) * (p - x.c));*/

        double areaX = x.area();

        /*p = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt(p * (  p - y.a) * (p - y.b) * (p - y.c));*/
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
