package Lesson_3.palindrom;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str1 = "polelop";
        System.out.println(equals(str1));

    }


    public static boolean equals(String str1) {
        StringBuilder stringBuilder = new StringBuilder(str1);
        stringBuilder.reverse();
        System.out.print(stringBuilder.toString() + " ");

        if (str1.equalsIgnoreCase(stringBuilder.toString())) {
            return true;
        }
        return false;
    }
}