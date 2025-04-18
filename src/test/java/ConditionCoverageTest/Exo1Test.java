package ConditionCoverageTest;

import org.example.exo1.PalindromeFixed;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {
    @Test
    public void testPalindrome_NullInput() {
        assertThrows(NullPointerException.class, () -> PalindromeFixed.isPalindrome(null));
    }

    @Test
    public void testPalindrome_AllBranches() {
        assertTrue(PalindromeFixed.isPalindrome("A man a plan a canal Panama"));
        assertFalse(PalindromeFixed.isPalindrome("Java"));
    }
}
