package Problema5;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class problema5 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffReader = new BufferedReader(new FileReader("numeros.txt"));
        int[][]Matriz= new int[4][4];
        int[]somaColuna=new int[4];

        int a=0;
        int b =0;
        int soma=0;
        int soma1=0;
        String linha;
        boolean QuadradoMagico=true;
        linha=buffReader.readLine();
        while(true){
            linha=buffReader.readLine();
            if (linha == null && a == 4){
                break;
            }




            try{
            Matriz[a][b]=Integer.parseInt(linha);
            a=a+1;
            if(b==4){
                b=0;
                a=a+1;
            }

        }catch (Exception e){
            continue;
        }
        }
        buffReader.close();

        for(a=0;a<4;a++){
            for(b=0;b<4;b++){
                System.out.println(""+Matriz[a][b]);
                soma1=soma + Matriz[a][b];
                somaColuna[a]+=Matriz[a][b];
            }
            System.out.println();
            if(a==0){
                soma=soma1;
            }
            if (soma!=soma1){
                QuadradoMagico=false;
                soma1=0;
            }
        }
        if (somaColuna[0] != somaColuna[1] && somaColuna[1] != somaColuna[2])
            QuadradoMagico = false;

        //soma das diagonais
        int soma_diagonal0 = Matriz[0][0] + Matriz[1][1] + Matriz[2][2] + Matriz[3][3];
        int soma_diagonal1 = Matriz[0][3] + Matriz[1][2] + Matriz[2][1] + Matriz[3][0];
        if (soma_diagonal0 != soma_diagonal1)
            QuadradoMagico = false;


        if (QuadradoMagico)
            System.out.println("a matriz é um Quadrado Magico");
        else System.out.println("A matriz não é um quadrado Magico");


    }
}

