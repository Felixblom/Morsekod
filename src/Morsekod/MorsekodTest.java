package Morsekod;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MorsekodTest {

    @Test
    void fel(){

    Morsekod.sentence = "";
    String test = "";
    if (Morsekod.sentence.isEmpty()){
        test = "tomt";
    }
    assertTrue(test.contains("tomt"));

    }

    @Test
    void hashmap() {

        Logiskt.koder = new HashMap<>();

        String[] one = {"a","b","c"};
        String[] two ={"ett","två","tre"};

        for(int i =0; i< Logiskt.koder.size();i++){
            Logiskt.koder.put(one[i], two[i]);
            Logiskt.koder.put(two[i], one[i]);
            assertTrue(Logiskt.koder.containsKey("tre"));
            assertTrue(Logiskt.koder.containsKey("c"));
        }
    }
    @Test
    void split(){

        Morsekod.sentence = "hejsan";
        String[] result = Morsekod.sentence.split("");
        assertEquals(6, result.length);
        assertEquals("h", result[0]);
        assertEquals("e", result[1]);
        assertEquals("j", result[2]);
        assertEquals("s", result[3]);
        assertEquals("a", result[4]);
        assertEquals("n", result[5]);
    }


}