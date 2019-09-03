package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        double a, b, c;
        System.out.println("Resolution de ax²+bx+c");
        System.out.println("Saisir a");
        a = sc.nextDouble();
        System.out.println("Saisir b");
        b = sc.nextDouble();
        System.out.println("Saisir c");
        c = sc.nextDouble();

        double dt, x1, x2;
        dt = (b * b) - (4 * a * c);
        if (dt < 0) {
            System.out.println("l'équation n'a pas de solution");
        }
        if (dt == 0) {
            x1 = (-b) / (2 * a);
            System.out.println("l'équation a une solution:" + x1);
        }
        if (dt > 0) {
            x1 = (-b - Math.sqrt(dt)) / (2 * a);
            x2 = (-b + Math.sqrt(dt)) / (2 * a);
            System.out.println("l'équation a deux solution :");
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }
    }

}
