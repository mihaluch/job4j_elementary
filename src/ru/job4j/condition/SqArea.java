package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
       double h = p / (2 * (k + 1));

       double  L = h * k;

       double s = L * h;


        //double rsl = (p / (2 * (k + 1))) * k;
        return s;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 12, k = 3, s = 2, real = " + result1);
    }

}
