package ru.mail.polis.open.task1;

public class FizzBuzzDemo implements FizzBuzz {
    private final int DIV_1 = 3;
    private final int DIV_2 = 5;
    private final int DIV_3 = DIV_1 * DIV_2;

    @Override
    public void print(int from, int to) {
        int curr = from;
        int finish = to + 1;
        while (curr < finish) {
            if (curr % DIV_3 == 0) {
                System.out.println("FizzBuzz");
            } else if (curr % DIV_1 == 0) {
                System.out.println("Fizz");
            } else if (curr % DIV_2 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(curr);
            }
            curr++;
        }
    }

    public static void main(String[] args) {
        new FizzBuzzDemo().print(1,100);
    }
}
