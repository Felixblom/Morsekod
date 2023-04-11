package Morsekod;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MorsekodTest {

    @Test
    void array(){
        String[] array = {"a","b","c"};

        assertEquals(3, array.length);

    }

    @Test
    void hashmap() {
        HashMap<String, String> ord = new HashMap<>();

        String[] one = {"a","b","c"};
        String[] two ={"ett","två","tre"};

        for(int i =0; i< ord.size();i++){
            ord.put(one[i], two[i]);
            ord.put(two[i], one[i]);
            assertTrue(ord.containsKey("tre"));
            assertTrue(ord.containsKey("c"));
        }
    }
    @Test
    void split(){
        String str = "hejsan";
        String[] result = str.split("");
        assertEquals(6, result.length);
        assertEquals("h", result[0]);
        assertEquals("e", result[1]);
        assertEquals("j", result[2]);
        assertEquals("s", result[3]);
        assertEquals("a", result[4]);
        assertEquals("n", result[5]);
    }
}