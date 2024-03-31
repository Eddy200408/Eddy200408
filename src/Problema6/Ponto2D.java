package Problema6;

public class Ponto2D {
    private static final double VALOR_PADRAO = 0.0;
    private static final int QUADRANTE_PADRAO = 0;

    private double x;
    private double y;
    private int quadrante;

    public Ponto2D() {
        this(VALOR_PADRAO, VALOR_PADRAO);
    }

    public Ponto2D(Ponto2D ponto) {
        this(ponto.x, ponto.y);
    }

    public Ponto2D(double x, double y) {
        setPonto(x, y);
    }

    public void setX(double x) {
        setPonto(x, this.y);
    }

    public void setY(double y) {
        setPonto(this.x, y);
    }

    private void setPonto(double x, double y) {
        this.x = x;
        this.y = y;
        this.quadrante = determinarQuadrante(x, y);
    }

    private int determinarQuadrante(double x, double y) {
        if (x == VALOR_PADRAO || y == VALOR_PADRAO) {
            return QUADRANTE_PADRAO;
        } else if (x > VALOR_PADRAO && y > VALOR_PADRAO) {
            return 1;
        } else if (x < VALOR_PADRAO && y > VALOR_PADRAO) {
            return 2;
        } else if (x < VALOR_PADRAO && y < VALOR_PADRAO) {
            return 3;
        } else {
            return 4;
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getQuadrante() {
        return quadrante;
    }

}