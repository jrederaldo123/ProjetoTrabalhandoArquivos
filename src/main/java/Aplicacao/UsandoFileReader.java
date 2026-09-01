package Aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsandoFileReader {
    public static void main(String[] args) {

        /*
        Segunda situação. Vamos utilizar as classes FileReader  e BufferedReader  para
        ler uma arquivo texto armazenado em uma pasta. A FileReader cria uma sequência de
         leitura dentro de um stream. O  BufferedReader vai ser  criado a partir do FileReader e
         vai otimizar a leitura do arquivo

         */
        String path = "c:\\temp\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine(); // se o arquivo estiver no fim ele vai retornar um null
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        }
        catch (IOException e) {
            System.out.println("Erro: " +  e.getMessage());
        }
        finally {
            try {
                if (br != null) {
                    br.close();
                }

                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                 e.printStackTrace();
            }


        }

    }
}
