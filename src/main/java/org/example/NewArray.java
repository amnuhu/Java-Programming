package org.example;

import java.util.ArrayList;
import java.util.Random;

public class NewArray {
    private int arr[] = new int[6];



    public NewArray() {
        int n ;
        int Max = 49, Min = 1;

        for (int i = 0; i < 6; i++) {
            n = Min + (int)(Math.random() * ((Max - Min) + 1));
            System.out.println(n);
        }
    }

    public int[] getArr() {
        return arr;
    }

}
