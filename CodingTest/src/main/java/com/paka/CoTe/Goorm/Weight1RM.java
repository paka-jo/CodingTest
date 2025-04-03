package com.paka.CoTe.Goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Weight1RM {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        double W = Integer.parseInt(input[0]);
        double R = Integer.parseInt(input[1]);


        System.out.println((int) (W * (1 + R / 30)));



    }
}
