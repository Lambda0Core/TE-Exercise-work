package com.techelevator.exceptions;

public class JavaBlueException extends Exception {
    private int testScore;

    public JavaBlueException(String message, int score) {
        super(message);
        this.testScore = score;
    }

    public int getTestScore() {
        return this.testScore;
    }
}
