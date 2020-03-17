package com;
import java.util.*;

public class Task3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Set s = new HashSet();
        
        boolean res = true;
        int count = 0;
        String choice;
        
        do {
            System.out.println("enter the username");
            String x = input.nextLine();
            if(!x.equals("")) {
                s.add(x);
            }
            System.out.println("do you want to continue?");
            
            choice = input.next();
            input.nextLine();
        
        }while(choice.equals("y"));
        
        System.out.println("Number of user = "+s.size());
    }
}
