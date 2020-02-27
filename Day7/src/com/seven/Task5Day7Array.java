package com.seven;
import java.util.*;

public class Task5Day7Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        Integer arr[] = new Integer[num];
        
        for(int i=0; i<num; i++) {
            arr[i] = input.nextInt();
        }
        
//        System.out.println(Arrays.toString(arr));

        LinkedHashSet<Integer> lk = new LinkedHashSet<>(Arrays.asList(arr));
        Integer[] remv = lk.toArray(new Integer[] {});

        System.out.println(remv.length);
    }

}
