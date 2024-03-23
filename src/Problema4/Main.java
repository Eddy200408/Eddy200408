package Problema4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(100);
        }

        ArrayList<Integer> indicesPares = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> reverseArray = new ArrayList<>();

        for (int c = 0; c < num.length; c++) {
            if (c % 2 == 0) {
                indicesPares.add(c);
            }
            if (num[c] % 2 == 0) {
                pares.add(num[c]);
            }
        }

        for (int k = num.length - 1; k >= 0; k--) {
            reverseArray.add(num[k]);
        }

        Sequencia numeros = new Sequencia(num);

        escreverOutputFile(numeros, indicesPares, pares, reverseArray);
    }

    private static void escreverOutputFile(Sequencia numeros, ArrayList<Integer> indicesPares,
                                           ArrayList<Integer> pares, ArrayList<Integer> reverseArray) {

        String line0 = "Array: " + numeros.arrayToString() + "\n";
        String line1 = "Indices de pares: " + indicesPares.toString() + "\n";
        String line2 = "Pares: " + pares.toString() + "\n";
        String line3 = "Sequência inversa: " + reverseArray.toString() + "\n";
        String line4 = "Primeiro: " + numeros.getNumeros().get(0) + " Último: " +
                " " + numeros.getNumeros().get((numeros.getNumeros().size() - 1));

        try {
            FileWriter writer = new FileWriter("output.txt");

            writer.write(line0);
            writer.write(line1);
            writer.write(line2);
            writer.write(line3);
            writer.write(line4);

            writer.close();

        } catch (IOException ex) {
            System.out.println("ocorreu um erro ");
            System.out.println(ex.getMessage());
        }
    }
}
