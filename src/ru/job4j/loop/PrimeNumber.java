package ru.job4j.loop;

public class PrimeNumber {

    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;
        }
        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && number != i) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static int calc(int finish) {
        int count = 0;
        for (int number = 1; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count += 1;
            }
        }
        return count;

    }
}