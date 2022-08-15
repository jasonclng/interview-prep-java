package uk.jasonng.algoexpert.strings;

public class PalindromicSubstringFinder {
    public String longestPalindromicSubstring(String str) {
        int length = str.length(), centre = 0, rightBoundary = 0, start = 0, maxLen = 0;
        char[] chars = new char[str.length() * 2 + 1];
        for (int i = 0; i < length; i++) {
            chars[2 * i] = '#';
            chars[2 * i + 1] = str.charAt(i);
        }
        chars[chars.length - 1] = '#';
        int[] p = new int[chars.length];

        for(int i = 0; i < chars.length; i++) {
            int mirror = (2 * centre) - i;
            if(i < rightBoundary) {
                p[i] = Math.min(rightBoundary - i, p[mirror]);
            }
            int left = i - (1 + p[i]), right = i + (1 + p[i]);
            while(right < chars.length && left >= 0 && chars[right] == chars[left]) {
                p[i]++;
                right++;
                left--;
            }
            if(i + p[i] > rightBoundary) {
                centre = i;
                rightBoundary = i + p[i];

                if(p[i] > maxLen) {
                    start = (i - p[i]) / 2;
                    maxLen = p[i];
                }
            }
        }

        return str.substring(start, start + maxLen);
    }
}