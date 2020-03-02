package com.eight;
import java.util.*;
import java.lang.*;
import java.util.*;

public class BobsChallenge {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
			int i, count = 0, j,k=0;
			int a = in.nextInt();
			int arr1[] = new int[a];
			int arr2[]=new int[a];
			for (i = 0; i < a; i++) {
				arr1[i] = in.nextInt();
			}
			int max = arr1[0];
			for (i = 0; i < arr1.length; i++) {
				if (arr1[i] > max) {
					max = arr1[i];
				}

			}
			int min = arr1[0];
			for (i = 0; i < arr1.length; i++) {
				if (arr1[i] < min) {
					min = arr1[i];
				}

			}
			for(i=min;i<=max;i++) {
				count=0;
				for(j=0;j<a;j++) {
					if(arr1[j]==i) {
						count++;
					}
				}
				if(count>=2) {
					arr2[k]=i;
					k=k+1;
				}
			}
			Arrays.sort(arr2);
			if(arr2[a-1]*arr2[a-2]==0) {
				System.out.println("-1");
			}
			else {
				System.out.println(arr2[a-1]*arr2[a-2]);
			}
		}
	}