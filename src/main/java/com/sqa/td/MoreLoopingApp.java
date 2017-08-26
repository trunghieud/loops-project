package com.sqa.td;

import com.sqa.td.helpers.*;

public class MoreLoopingApp
{

	public static void main(String[] args)
	{
		moreLoops();
		drawStars();
		drawStars2();
		activityLoops();
	}

	/**
	 * A loop which keeps asking "What do you want to do?" and echo the activity
	 * back to the user until the user type "exit".
	 */
	private static void activityLoops()
	{
		String activity = AppBasics.requestString("What do you want to do? ");
		while (!activity.equals("exit"))
		{
			System.out.println("OK," + activity);
			activity = AppBasics.requestString("What else? Type 'exit' to quit. ");
		}
	}

	/**
	 * This will use two loops to draw stars in descending order
	 */
	private static void drawStars()
	{
		System.out.println("5. This will print stars in descending order:");
		for (int i = 6; i >= 1; i--)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	/**
	 * This will use three loops to draw stars in ascending order
	 */
	private static void drawStars2()
	{
		System.out.println("6. This will print stars in ascending order: ");
		for (int i = 6; i > 0; i--)
		{
			for (int j = i; j > 1; j--)
			{
				System.out.print(" ");
			}
			for (int k = 6 - i; k >= 0; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * Create a Loop for each of the following 4 outputs: 10,9,8,7,6,5
	 * [0][1][2][3][4][5] 1000<<<200<<<40<<<8 {{{{-9999{{{{-3333{{{{-1111
	 */
	private static void moreLoops()
	{
		System.out.print("1.");
		for (int i = 10; i >= 5; i--)
		{
			System.out.print(i + ",");
		}
		System.out.print("\n2.");
		for (int i = 0; i <= 5; i++)
		{
			System.out.print("[" + i + "]");
		}
		System.out.print("\n3.");
		for (int i = 1000; i >= 8; i /= 5)
		{
			System.out.print(i);
			if (i > 8)
				System.out.print("<<<");
		}
		System.out.print("\n4.");
		for (int i = 9999; i >= 1111; i /= 3)
		{
			if (i >= 1111)
				System.out.print("{{{{-");
			System.out.print(i);
		}
		System.out.println();
	}
}
