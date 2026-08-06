package Aplicacao;

import java.io.File;
import java.util.Scanner;

public class UsandoPastas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o caminho da pasta: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        for(File folder: folders){
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("Files: ");
        for(File file: files){
            System.out.println(file);
        }
        boolean sucess = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created Sucessfully: " +  sucess);
        sc.close();

    }
}
