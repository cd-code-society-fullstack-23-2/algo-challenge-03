package com.codedifferently.algos;

public class AlgoChallenge03 {
    public String advancedVowelShift(String message, int shift) {
        StringBuilder shiftedMessage = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (isVowel(c)) {
                shiftedMessage.append(shiftCharacter(c, shift));
            } else {
                shiftedMessage.append(c);
            }
        }

        return shiftedMessage.toString();
    }

    private char shiftCharacter(char c, int shift) {
        char base = Character.isLowerCase(c) ? 'a' : 'A';
        int effectiveShift = Character.isLowerCase(c) ? -shift : shift;
        return (char) (base + (c - base + effectiveShift + 26) % 26);
    }

    private boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
