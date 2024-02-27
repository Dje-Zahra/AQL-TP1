import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    void noString(){
        Assertions.assertThrows(NullPointerException.class, () ->Palindrome.isPalindrome(null));
    }

    @Test
    void notAPalindrome(){
        Assertions.assertFalse(Palindrome.isPalindrome("zahra"));
    }

    @Test
    void aPalindromeOdd(){
        Assertions.assertTrue(Palindrome.isPalindrome("kayak"));
    }

    @Test
    void aPalindromeEven(){
        Assertions.assertTrue(Palindrome.isPalindrome("kayyak"));
    }

    @Test
    void noCaseSensitivePalindrome(){
        Assertions.assertTrue(Palindrome.isPalindrome("Kayak"));
    }

    @Test
    void ignoreSpacesPalindrome(){
        Assertions.assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose"));
    }

}