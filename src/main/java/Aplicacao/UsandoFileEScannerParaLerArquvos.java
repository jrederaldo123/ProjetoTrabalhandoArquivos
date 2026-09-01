package Aplicacao;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class UsandoFileEScannerParaLerArquvos {
    public static void main(String[] args) {
        /*

        Para abrir um arquivo .txt no java você precisar criar um objeto arquivo da
        classe File onde você passa o caminho físico do arquivo (“c:\\temp\\arquivo.txt”)
        e depois criar um objeto sc da classe Scanner passando esse objeto arquivo com parâmetro de entrada do construtor da classe Scanner.

        Para ler esse arquivo, você precisa utilizar um while ( sc.hasNextLine()) e
        utilizar o System.out.println(sc.nextLine);
        hasNextLine() verifica se ainda tem linha no arquivo para leitura

         */

        File file = new File("c:\\temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
                System.out.println("Erro: " + e.getMessage());
        }  finally {
                if (sc != null){
                    sc.close();
                }
        }

        }
    }

