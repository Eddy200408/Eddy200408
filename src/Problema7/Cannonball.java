package Problema7;

import java.awt.*;
import java.util.ArrayList;

public class Cannonball {
    private int x;
    private int y;
    private double VelocidadeX;
    private double VelocidadeY;

    public Cannonball(int x, int y) {
        this.x = x;
        this.y = 0;
        this.VelocidadeX = 0;
        this.VelocidadeY = 0;
    }

    public void move(double deltaSec) {
        double distanciaX = this.VelocidadeX * deltaSec;
        double distanciaY = this.VelocidadeY * deltaSec;

        this.x += distanciaX;
        this.y += distanciaY;

        this.VelocidadeY += -9.81 * deltaSec;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point getLocation() {
        return new Point((int) Math.round(x), (int) Math.round(y));
    }

    public ArrayList<Point> shoot(double alpha, double v, double deltaSec) {
        ArrayList<Point> locais = new ArrayList<>();

        double velocidadeX = v * Math.cos(Math.toRadians(alpha));
        double velocidadeY = v * Math.sin(Math.toRadians(alpha));

        while (y >= 0) {
            move(deltaSec);
            locais.add(getLocation());
        }

        return locais;
    }

}
