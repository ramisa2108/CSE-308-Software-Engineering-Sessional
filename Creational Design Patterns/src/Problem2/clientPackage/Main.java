package Problem2.clientPackage;

import Problem2.editorPackage.Editor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Editor editor = Editor.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter filename: ");
        while (scanner.hasNext()){
            String filename = scanner.next();
            editor.openFile(filename);
            System.out.println("\n\nEnter filename:");
        }
    }
}
