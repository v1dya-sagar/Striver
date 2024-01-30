package com.Striver.Arrays.Basic;

public class FindLargestElementInArray {
    public static void main(String[] args) {
        int[] givenArray = {1,2,5,6,2,8};
        int max = 0;
        for (int j : givenArray) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);
    }
}
