package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double debt = amount + amount * percent / 100;
        System.out.println(debt);
        while (debt > 0) {
            debt = (debt - salary);
            debt = debt + debt * percent / 100;
            year += 1;
        }
        return year;
    }

    public static void main(String[] args) {
        Mortgage.year(100,70,10);
    }
}
