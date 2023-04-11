package Morsekod;

import java.util.Scanner;


public class Morsekod {
    public static String sentence;

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        sentence = scan.nextLine().toLowerCase();

        Logiskt logik = new Logiskt();

        System.out.println(logik.getTranslate(sentence));

    }
}
