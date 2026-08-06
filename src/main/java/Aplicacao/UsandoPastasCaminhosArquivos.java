package Aplicacao;

import java.io.File;
import java.util.Scanner;

public class UsandoPastasCaminhosArquivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o caminho do arquivo: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);
        System.out.println("getName: " + path.getName());
        System.out.println("getName: " + path.getParent());
        System.out.println("getName: " + path.getPath());

    }
}
