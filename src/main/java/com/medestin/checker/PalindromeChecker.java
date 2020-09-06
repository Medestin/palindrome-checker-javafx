package com.medestin.checker;

public class PalindromeChecker {

    public boolean isPalindrome(String string) {
        String modifiedString = string
                .trim()
                .replaceAll("[^A-Za-z0-9]", "")
                .toLowerCase();
        char[] array = modifiedString.toCharArray();
        int length = modifiedString.length() - 1;

        for(int i = 0; i < modifiedString.length() / 2; i++) {
            if(array[i] != array[length - i]) {
                return false;
            }
        }
        return true;
    }
}
