package Problema7;

import java.awt.*;
import java.util.ArrayList;

public class Problema7 {
    public static void main(String[] args) {
        Cannonball bolaDeCanhao = new Cannonball(0, 0);
        double alpha = 45;
        double v = 50;
        double deltaSec = 0.1;

        ArrayList<Point> locais = bolaDeCanhao.shoot(alpha, v, deltaSec);

        System.out.println("Posições da bala de canhão:");
        for (Point ponto : locais) {
            System.out.println("(" + ponto.x + ", " + ponto.y + ")");
        }
    }
}
