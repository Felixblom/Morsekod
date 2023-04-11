package Morsekod;

import java.util.Scanner;


public class Morsekod {
    public static String sentence;
    public static String morsKod;
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Skriv med bokstäver");
            sentence = scan.nextLine().toLowerCase();
            System.out.println("Skriv med morsekod");
            morsKod = scan.nextLine();

            if (sentence.isEmpty()){
                System.out.println("Du skrev inga bokstäver");

            } if(morsKod.isEmpty()){
                System.out.println("Du skrev ingen morsekod");

            }else{
                Logiskt logik = new Logiskt();
                System.out.println(logik.getTranslate(sentence));
                System.out.println(logik.getMorse(morsKod));

            }



        }


    }
}
