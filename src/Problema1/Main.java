package Problema1;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite as coordenadas iniciais do robô (x,y): ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println("Digite a direção inicial do robô (Norte, Este, Sul, Oeste): ");
            Direcao direcao = Direcao.valueOf(scanner.next().toUpperCase());

            Robot robo = new Robot(x, y, direcao);

            System.out.println("Coordenadas atuais do robô: (" + robo.getX() + ", " + robo.getY() + ")");
            System.out.println("Direção atual do robô: " + robo.getDirecao());

            System.out.println("Girando o robô para a esquerda...");
            robo.turnLeft();
            System.out.println("Direção atual do robô: " + robo.getDirecao());

            System.out.println("Movendo o robô...");
            robo.move();
            System.out.println("Coordenadas atuais do robô: (" + robo.getX() + ", " + robo.getY() + ")");
        }

    }

