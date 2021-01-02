package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double rsl = (p / (2 * (k + 1))) * k;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(12, 3);
        System.out.println(" p = 12, k = 3, s = 2, real = " + result1);
    }

}
