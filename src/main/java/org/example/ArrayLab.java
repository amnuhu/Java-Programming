package org.example;

public class ArrayLab {
        static int arr[] = new int[20];

        static int currentPos = 0;

        public ArrayLab() {
            arr[currentPos] = currentPos + 1;
            currentPos += 1;
        }

        public int getCurrentPos() {
            return currentPos;
        }

        public int[] getArr() {
            return arr;
        }
}
