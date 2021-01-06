package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
       if (second > result) {
           result = second;
       }

            if (third > result) {
                result = third;
            }
        return result;
    }

    //public static void main(String[] args) {
    //    System.out.println(max(7,5,4));

    //}
}
