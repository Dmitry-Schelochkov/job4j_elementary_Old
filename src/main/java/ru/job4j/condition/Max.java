package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left - right;
        result = result > 0 ? left : right;
        return result;
    }
}

