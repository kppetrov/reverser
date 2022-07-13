package com.artplan.reverser;

public class Tester {

    private Reverser reverser;

    public Tester(Reverser reverser) {
        this.reverser = reverser;
    }

    public long startTest(long numberOfTests) {

        if (numberOfTests < 0) {
            throw new IllegalArgumentException("The argument must not be less than zero");
        }

        long start = System.nanoTime();

        for (long i = 0; i < numberOfTests; i++) {
            reverser.getReverse();
        }

        return System.nanoTime() - start;

    }
}
