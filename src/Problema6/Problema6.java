package Problema6;

import java.util.Scanner;

public class Problema6 {
    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D();
        Ponto2D ponto2 = new Ponto2D(3, 4);
        Ponto2D ponto3 = new Ponto2D(-2, 5);
        Ponto2D ponto4 = new Ponto2D(-4, -3);
        Ponto2D ponto5 = new Ponto2D(0, 0);

        System.out.println("Valores de x, y e quadrante:");
        System.out.println("Ponto1: " + ponto1.getX() + ", " + ponto1.getY() + ", " + ponto1.getQuadrante());
        System.out.println("Ponto2: " + ponto2.getX() + ", " + ponto2.getY() + ", " + ponto2.getQuadrante());
        System.out.println("Ponto3: " + ponto3.getX() + ", " + ponto3.getY() + ", " + ponto3.getQuadrante());
        System.out.println("Ponto4: " + ponto4.getX() + ", " + ponto4.getY() + ", " + ponto4.getQuadrante());
        System.out.println("Ponto5: " + ponto5.getX() + ", " + ponto5.getY() + ", " + ponto5.getQuadrante());

        ponto5.setX(7);
        ponto5.setY(-2);

        System.out.println("\nDepois de mover o Ponto5 de quadrante:");
        System.out.println("Ponto5: " + ponto5.getX() + ", " + ponto5.getY() + ", " + ponto5.getQuadrante());
    }
}
