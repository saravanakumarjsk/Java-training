package com.nine;
import java.util.*;

public class Task4_AESNumbers{

	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int s = input.nextInt();
        int e = input.nextInt();
        
        int count = 0, count1 = 0;
        
        for(int i=s; i <= e; i++) {
            count = 0;
            for(int j = 1; j <= i; j++) {
                if(i%j == 0) {
                    count++;
                }
                else {
                    count = count;
                }
            }
            if(count == 4) {
                count1++;
            }
            else {
                count1 = count1;
            }
        }
        System.out.println(count1);
    }
}
