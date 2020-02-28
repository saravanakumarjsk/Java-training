package com.first;
import java.util.*;

public class LucyAtFlimFestival {
	
	public int findIndex(int arr[], int elem) 
	{
		int temp = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == elem)
			{
				temp = i;
			}
			else {
				temp = temp;
			}
		}
		return temp;
	}
	
	public int findMax(int arr[])
	{
		int res = 0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=1; j<arr.length; j++)
			{
				if(arr[i] <= arr[j])
				{
					res = arr[i];
				}
				else {
					res = res;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int ln[] = new int[n];
		int rt[] = new int[n];

		for (int i = 0; i < n; i++) {
			ln[i] = input.nextInt();
		}

		for (int i = 0; i < n; i++) {
			rt[i] = input.nextInt();
		}
		
		int res[] = new int[ln.length];
		
		for(int i=0; i<ln.length; i++)
		{
			res[i] = ln[i] * rt[i];
		}
		
		LucyAtFlimFestival ob = new LucyAtFlimFestival();
		
		int max = ob.findMax(res);
		int idx_min = ob.findIndex(rt, max);
		
		
		System.out.println(max+" "+idx_min);

	}

}



