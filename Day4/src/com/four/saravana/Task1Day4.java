package com.four.saravana;

import java.util.*;

public class Task1Day4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ticket = input.next().toLowerCase().charAt(0);

		switch (ticket) {
		case 'e':
			System.out.println("Early Bird Ticket");
			break;
		case 'd':
			System.out.println("Discount Ticket");
			break;
		case 'v':
			System.out.println("VIP Ticket");
			break;
		case 's':
			System.out.println("Standard Ticket");
			break;
		case 'c':
			System.out.println("Children Ticket");
			break;
		default:
			System.out.println("Ticket Invalid");
		}
	}

}
