package Problema10;
import java.util.ArrayList;

public class Problema10 {

    public static void main(String[] args) {
        String[] faixas = {"red", "violet", "green", "gold"};
        double[] valores = calcularResistencia(faixas);
        double resistencia = valores[0];
        double tolerancia = valores[1];
        System.out.printf("Valor da resistência: %.3f kO ± %.1f%%\n", resistencia / 1000, tolerancia);
    }

    public static double[] calcularResistencia(String[] faixas) {
        ArrayList<String> tabelaCores = new ArrayList<>();
        tabelaCores.add("black");
        tabelaCores.add("brown");
        tabelaCores.add("red");
        tabelaCores.add("orange");
        tabelaCores.add("yellow");
        tabelaCores.add("green");
        tabelaCores.add("blue");
        tabelaCores.add("violet");
        tabelaCores.add("gray");
        tabelaCores.add("white");

        ArrayList<String> tolerancias = new ArrayList<>();
        tolerancias.add("brown");
        tolerancias.add("red");
        tolerancias.add("green");
        tolerancias.add("blue");
        tolerancias.add("violet");
        tolerancias.add("gray");
        tolerancias.add("gold");
        tolerancias.add("silver");

        ArrayList<String> multiplicadores = new ArrayList<>();
        multiplicadores.add("black");
        multiplicadores.add("brown");
        multiplicadores.add("red");
        multiplicadores.add("orange");
        multiplicadores.add("yellow");
        multiplicadores.add("green");
        multiplicadores.add("blue");
        multiplicadores.add("violet");
        multiplicadores.add("gray");
        multiplicadores.add("white");

        int Primeiro_digito = tabelaCores.indexOf(faixas[0]);
        int Segundo_digito = tabelaCores.indexOf(faixas[1]);
        double tolerancia = getTolerancia(faixas[3], tolerancias);
        double multiplicador = getMultiplicador(faixas[2], multiplicadores);

        double valor = (Primeiro_digito * 10 + Segundo_digito) * multiplicador;
        return new double[]{valor, tolerancia};
    }

    private static double getTolerancia(String cor, ArrayList<String> tolerancias) {
        if (tolerancias.contains(cor)) {
            if (cor.equals("gold")) return 5.0;
            if (cor.equals("silver")) return 10.0;
        }
        return 0.0;
    }

    private static double getMultiplicador(String cor, ArrayList<String> multiplicadores) {
        if (multiplicadores.contains(cor)) {
            int index = multiplicadores.indexOf(cor);
            return Math.pow(10, index);
        }
        return 0.0;
    }
}
