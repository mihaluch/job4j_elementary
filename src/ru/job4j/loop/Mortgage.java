package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double debt = amount;
        //System.out.println(debt);
        while (debt > 0) {
            debt = debt + debt * percent / 100;
            debt = (debt - salary);
            year += 1;
        }
        return year;
    }

}
