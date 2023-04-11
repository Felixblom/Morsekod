package Morsekod;

import java.util.HashMap;
public class Logiskt {


     String[] mening = Morsekod.sentence.split("\\s+");

    private HashMap<String, String> koder;
    public StringBuilder morse = new StringBuilder();

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

               // String s = koder.get(character) + " ";
                morse.append(koder.get(character)).append(" ");
            }
        }
        //System.out.println(morse);
    }
    public String getTranslate(String key){ return morse.toString() ;}
}
