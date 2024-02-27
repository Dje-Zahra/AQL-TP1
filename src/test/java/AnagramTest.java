import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void check1stString(){
        Assertions.assertThrows(NullPointerException.class, ()->Anagram.isAnagram(null,"test"));
    }

    @Test
    void check2ndString(){
        Assertions.assertThrows(NullPointerException.class, ()->Anagram.isAnagram("test",null));
    }

    @Test
    void notSameLength(){
        Assertions.assertFalse(Anagram.isAnagram("test","est"));
    }

    @Test
    void sameLengthButDiffLetters(){
        Assertions.assertFalse(Anagram.isAnagram("test","east"));
    }
    @Test
    void sameLength(){
        Assertions.assertTrue(Anagram.isAnagram("test","estt"));
    }

    @Test
    void noCaseSensitive(){
        Assertions.assertTrue(Anagram.isAnagram("test","esTT"));
    }

    @Test
    void noSpaces(){
        Assertions.assertTrue(Anagram.isAnagram("test","est t"));
    }



}