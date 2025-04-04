package com.paka.CoTe.Goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FarmCircumference {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N 입력받기
        int N = Integer.parseInt(br.readLine());
        // N개 만큼의 사각형의 높이 받기
        int[] H = new int[N];
        String[] input = br.readLine().split(" ");
        for(int i=0; i < N ; i++){
            H[i] = Integer.parseInt(input[i]);
        }
        int total = 0;
        // 세로는 양쪽 세로와 i와 i+1번째의 세로길이의 차의 절대값
        for ( int i=0; i<N-1;i++ ) {
            total += Math.abs(H[i]-H[i+1]);
        }

        //가로와 세로의 총합
        total += (H[0] + H[N-1] + N*2) ;

        System.out.println(total);



    }
}
