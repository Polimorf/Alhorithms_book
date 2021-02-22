package com.algorithms4.book;

import edu.princeton.cs.algs4.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] test = {11, 7, 28, 45, 63, 8, 5, 10, 110, 18, 23};
        Arrays.sort(test);
        int result = BinarySearch.rank(8, test);
        System.out.println("result = "+result);
    }
}
