package Problema3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um texto para encriptar: \n");
        String textoOriginal = scanner.nextLine();
        String textoEncriptado = encriptar(textoOriginal);
        System.out.println("Texto encriptado: \n" + textoEncriptado);
    }

    public static String encriptar(String textoOriginal) {
        StringBuilder textoEncriptado = new StringBuilder();
        for (char c : textoOriginal.toCharArray()) {
            if (Character.isLetter(c)) {
                char novaLetra = rodarTexto(c);
                textoEncriptado.append(novaLetra);
            } else {
                textoEncriptado.append(c);
            }
        }
        return textoEncriptado.toString();
    }

    public static char rodarTexto(char letra) {
        char base = Character.isLowerCase(letra) ? 'a' : 'A'; // determina (minúscula ou maiúscula)
        int deslocamento = 13;
        int indiceLetra = letra - base; // converte a letra para um índice (0 a 25)
        int novoIndiceLetra = (indiceLetra + deslocamento) % 26;
        char novaLetra = (char) (base + novoIndiceLetra); // converte o índice de volta para uma letra
        return novaLetra;
    }

}
