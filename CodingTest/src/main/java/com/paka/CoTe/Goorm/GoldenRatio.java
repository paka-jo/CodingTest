package com.paka.CoTe.Goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.max;
import static java.lang.Math.min;


public class GoldenRatio {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int T = Integer.parseInt(br.readLine());
        long Golden = 0;

        for(int t=0; t < T; t++) {
            String[] input = br.readLine().split(" ");
            long A = Integer.parseInt(input[0]);
            long B = Integer.parseInt(input[1]);

            long minNum = min(A,B);
            long maxNum = max(A,B);

            if (maxNum >= minNum*1.6 && maxNum <= minNum*1.63) {
                Golden++;

                System.out.println(Golden);
            }
        }


    }
}