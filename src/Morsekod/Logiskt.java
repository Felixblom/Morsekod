package Morsekod;

import java.util.HashMap;
public class Logiskt {


     String[] mening = Morsekod.sentence.split("");
     String[] mKod = Morsekod.morsKod.split(" ");
    public static HashMap<String, String> koder;
    public StringBuilder sb = new StringBuilder();
    public StringBuilder mb = new StringBuilder();



    public Logiskt(){
        koder = new HashMap<>();

        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " "};
        String[] mors = {"*_", "_***", "_*_*", "_**", "*", "**_*", "__*", "****", "**", "*___", "_*_", "*_**", "__", "_*", "___", "*__*", "__*_", "*_*", "***", "_", "**_", "***_", "*__", "_**_", "_*__", "__**", " "};

        for(int i =0; i<letters.length;i++){
            koder.put(letters[i], mors[i]);
            koder.put(mors[i], letters[i]);
        }
        //System.out.println(mening.toString());

        for(int i=0; i<mening.length; i++){
            String character = String.valueOf(mening[i]);
            if(koder.containsKey(character)){
                sb.append(koder.get(character)).append(" ");
            }

        }

        for (int i = 0; i <mKod.length; i++){
            String kod = String.valueOf(mKod[i]);
            if(koder.containsKey(kod)){
                mb.append(koder.get(kod)).append(" ");
                //System.out.println(mb);
        }
    }




}public String getTranslate(String key){ return sb.toString() ;}
     public String getMorse(String key){ return mb.toString() ;}
}

