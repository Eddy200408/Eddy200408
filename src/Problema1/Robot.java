package Problema1;

public class Robot {
    private int x;
    private int y;
    private Direcao direcao;

    public Robot(int x, int y, Direcao direcao) {
        this.x = x;
        this.y = y;
        this.direcao = direcao;
    }

    public void turnLeft() {
        this.direcao = this.direcao.left();
    }

    public void turnRight() {
        this.direcao = this.direcao.right();
    }

    public void move() {
        switch (this.direcao) {
            case NORTE:
                this.y += 1;

                break;
            case ESTE:
                this.x += 1;
                break;
            case SUL:
                this.y -= 1;
                break;
            case OESTE:
                this.x -= 1;
                break;
        }
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String getDirecao() {
        return this.direcao.toString();
    }
}

enum Direcao {
    NORTE, ESTE, SUL, OESTE;

    public Direcao left() {
        return values()[(ordinal() + 3) % 4];
    }

    public Direcao right() {
        return values()[(ordinal() + 1) % 4];
    }
}

