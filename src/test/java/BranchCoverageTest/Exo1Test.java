package BranchCoverageTest;

import org.example.exo1.PalindromeFixed;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {
    @Test
    public void testConditions() {
        Assertions.assertThrows(NullPointerException.class, () -> PalindromeFixed.isPalindrome(null));
        assertTrue(PalindromeFixed.isPalindrome("RaceCar"));
        assertFalse(PalindromeFixed.isPalindrome("Testing"));
        assertTrue(PalindromeFixed.isPalindrome("No lemon no melon"));
    }
}
