package ru.mail.polis.open.task1;

public class FizzBuzzDemo implements FizzBuzz {
    private static final int DIVIDER_1 = 3;
    private static final int DIVIDER_2 = 5;
    private static final int DIVIDER_MULTIPLE = DIVIDER_1 * DIVIDER_2;

    @Override
    public void print(int from, int to) {
        if (from < to) {
            while (from <= to) {
                if (from % DIVIDER_MULTIPLE == 0) {
                    System.out.println("FizzBuzz");
                } else if (from % DIVIDER_1 == 0) {
                    System.out.println("Fizz");
                } else if (from % DIVIDER_2 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(from);
                }
                from++;
            }
        } else {
            System.out.println("Incorrect numbers");
        }
    }

    public static void main(String[] args) {
        new FizzBuzzDemo().print(1, 100);
    }
}
