 package com.fourteen;

public class Task3 {

    public static void main(String[] args) {
        int sum = 0;
        
//        try {
        if(args.length < 2)
        {
        	System.out.println("Invalid inp");
        	System.exit(0);
        }
        else {
        for (String i : args) {
            int a = Integer.parseInt(i);
            sum += a;
        }
        System.out.println("The sum of "+args[0]+" and "+ args[1]+ " is "+ sum);
        }
//        catch(ArrayIndexOutOfBoundsException e)
//        {
//        	 System.out.println("Invalid Input ");
//        }
    }
}
