package uk.jasonng.algoexpert.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromicSubstringFinderTest {
    private final PalindromicSubstringFinder palindromicSubstringFinder = new PalindromicSubstringFinder();

    @Test
    public void TestCase1() {
        String input = "abaxyzzyxf", output = "xyzzyx", result;
        result = palindromicSubstringFinder.longestPalindromicSubstring(input);
        assertEquals(result, output);
    }

    @Test
    public void TestCase2() {
        String input = "a", output = "a", result;
        result = palindromicSubstringFinder.longestPalindromicSubstring(input);
        assertEquals(result, output);
    }

    @Test
    public void TestCase3() {
        String input = "it's highnoon", output = "noon", result;
        result = palindromicSubstringFinder.longestPalindromicSubstring(input);
        assertEquals(result, output);
    }

    @Test
    public void TestCase4() {
        String input = "noon high it is", output = "noon", result;
        result = palindromicSubstringFinder.longestPalindromicSubstring(input);
        assertEquals(result, output);
    }

    @Test
    public void TestCase5() {
        String input = "abccbait's highnoon", output = "abccba", result;
        result = palindromicSubstringFinder.longestPalindromicSubstring(input);
        assertEquals(result, output);
    }

    @Test
    public void TestCase6() {
        String input = "abcdefgfedcbazzzzzzzzzzzzzzzzzzzz", output = "zzzzzzzzzzzzzzzzzzzz", result;
        result = palindromicSubstringFinder.longestPalindromicSubstring(input);
        assertEquals(result, output);
    }

    @Test
    public void TestCase7() {
        String input = "abcdefgfedcba", output = "abcdefgfedcba", result;
        result = palindromicSubstringFinder.longestPalindromicSubstring(input);
        assertEquals(result, output);
    }

    @Test
    public void TestCase8() {
        String input = "abcdefghfedcbaa", output = "aa", result;
        result = palindromicSubstringFinder.longestPalindromicSubstring(input);
        assertEquals(result, output);
    }

    @Test
    public void TestCase9() {
        String input = "abcdefggfedcba", output = "abcdefggfedcba", result;
        result = palindromicSubstringFinder.longestPalindromicSubstring(input);
        assertEquals(result, output);
    }

    @Test
    public void TestCase10() {
        String input = "zzzzzzz2345abbbba5432zzbbababa", output = "zz2345abbbba5432zz", result;
        result = palindromicSubstringFinder.longestPalindromicSubstring(input);
        assertEquals(result, output);
    }

    @Test
    public void TestCase11() {
        String input = "z234a5abbbba54a32z", output = "5abbbba5", result;
        result = palindromicSubstringFinder.longestPalindromicSubstring(input);
        assertEquals(result, output);
    }

    @Test
    public void TestCase12() {
        String input = "z234a5abbba54a32z", output = "5abbba5", result;
        result = palindromicSubstringFinder.longestPalindromicSubstring(input);
        assertEquals(result, output);
    }

    @Test
    public void TestCase13() {
        String input = "ab12365456321bb", output = "b12365456321b", result;
        result = palindromicSubstringFinder.longestPalindromicSubstring(input);
        assertEquals(result, output);
    }

    @Test
    public void TestCase14() {
        String input = "aca", output = "aca", result;
        result = palindromicSubstringFinder.longestPalindromicSubstring(input);
        assertEquals(result, output);
    }
}
