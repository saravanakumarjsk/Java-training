package com.thirteen;

import java.util.*;

public class Day4_ToTheMagicShow {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int source_x = input.nextInt();
		int source_y = input.nextInt();
		int dest_x = input.nextInt();
		int dest_y = input.nextInt();
		if (Reachable.isReachable(source_x, source_y, dest_x, dest_y))
			System.out.print("True\n");
		else
			System.out.print("False\n");

		input.close();
	}
}

class Reachable {

	static boolean isReachable(int sx, int sy, int dx, int dy) {

		if (sx > dx || sy > dy)
			return false;

		if (sx == dx && sy == dy)
			return true;

		return (isReachable(sx + sy, sy, dx, dy) || isReachable(sx, sy + sx, dx, dy));
	}
}