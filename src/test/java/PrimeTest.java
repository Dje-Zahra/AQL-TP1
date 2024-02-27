import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void isNegativePrime() {
        assertEquals(false,Prime.isPrime(-1));
    }
    @Test
    void oneIsNotPrime() {
        assertEquals(false,Prime.isPrime(1));
    }

    @Test
    void isPrime(){
        assertAll(() -> assertEquals(true,Prime.isPrime(2)),
                () -> assertEquals(true,Prime.isPrime(3)),
                () -> assertEquals(false,Prime.isPrime(4)));
    }
}