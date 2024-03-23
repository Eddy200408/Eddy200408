package Problema4;

import java.util.ArrayList;

public class Sequencia {
    private int[] numeros;

    public Sequencia(int[] numeros) {
        this.numeros = numeros;
    }

    public ArrayList<Integer> getNumeros() {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int num : numeros) {
            lista.add(num);
        }
        return lista;
    }

    public String arrayToString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < numeros.length; i++) {
            sb.append(numeros[i]);
            if (i < numeros.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
