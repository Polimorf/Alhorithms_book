package com.algorithms4.book;

import edu.princeton.cs.algs4.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*int[] test = {11, 7, 28, 45, 63, 8, 5, 10, 110, 18, 23};
        Arrays.sort(test);
        int result = BinarySearch.rank(8, test);
        System.out.println("result = "+result);*/

        /*int N = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);
        for(int i=0; i<N; i++)
        {
            double x = StdRandom.uniform(lo, hi);
            StdOut.printf("%.2f\n", x);
        }*/

        double sum = 0.0;
        int cnt = 0;
        while(!StdIn.isEmpty())
        {
            sum += StdIn.readDouble();
            cnt++;
        }

        double avg = sum / cnt;
        StdOut.printf("Среднее - %.5f", avg);

    }
}
