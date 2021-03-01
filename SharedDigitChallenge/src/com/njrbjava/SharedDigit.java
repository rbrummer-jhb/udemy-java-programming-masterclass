package com.njrbjava;

public class SharedDigit {

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if ((firstNumber < 10 || firstNumber > 99) ||
            (secondNumber < 10 || secondNumber > 99)) {
            return false;
        }
        int firstNumberFirstDigit = firstNumber / 10;
        int firstNumberLastDigit = firstNumber % 10;
        int secondNumberFirstDigit = secondNumber / 10;
        int secondNumberLastDigit = secondNumber % 10;

        if ((firstNumberFirstDigit == secondNumberFirstDigit) ||
            (firstNumberFirstDigit == secondNumberLastDigit)) {
            return true;
        } else
        if ((firstNumberLastDigit == secondNumberFirstDigit) ||
            (firstNumberLastDigit == secondNumberLastDigit)) {
            return true;
        }
        return false;
    }
}
