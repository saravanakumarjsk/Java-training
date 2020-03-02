package com.eight;
import java.util.*;

public class CompetitiveTest {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i,j,k,s1,x,count=0,count1=0;
		int a=in.nextInt();
		int arr[]=new int[a];
		for(i=0;i<a;i++) {
			arr[i]=in.nextInt();
		}
		for(i=0;i<a;i++) {
			for(j=i+1;j<=a;j++) {
				int[] ints1 = Arrays.copyOfRange(arr, i, j);
//				System.out.println(Arrays.toString(ints1));
				s1=ints1.length;
				count=0;
				for(k=0;k<s1;k++) {
					for(x=k+1;x<s1;x++) {
						if(ints1[k]>ints1[x]) {
							count++;
						}
					}
				}
				if(count==0) {
					count1++;
				}
			}
		}
		System.out.println(count1);

	}

}
