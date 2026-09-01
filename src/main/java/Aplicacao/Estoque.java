package Aplicacao;

import Entidade.Produto;

import java.io.*;
import java.util.ArrayList;

public class Estoque {
    public static void main(String[] args) {
        String path = "c:\\temp\\estoque.csv";
        FileReader fr = null;
        BufferedReader br = null;
        ArrayList<Produto> produtos = new ArrayList<>();


        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                String[] partes = line.split(",");
                Produto p1 = new Produto(partes[0], Double.parseDouble(partes[1]), Integer.parseInt(partes[2]));
                produtos.add(p1);
                line = br.readLine();
            }


            // escrevendo no arquivo out/somatorio.csv
            String path2 = "c:\\temp\\out\\somatorio.csv";
            File pasta = new File("c:\\temp\\out");
            if (!pasta.exists()) {
                pasta.mkdirs();
            }
            String line2;


            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2))) {
                for (Produto p : produtos){
                    line2 = p.getNome() + "," +p.total();
                    bw.write(line2);
                    bw.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
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
