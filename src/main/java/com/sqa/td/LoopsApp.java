package com.sqa.td;

import com.sqa.td.helpers.*;

public class LoopsApp
{

	public static void main(String[] args)
	{
		String name = AppBasics.greetUserAndGetName("Loops Project");
		// printNum();
		// printNum2();
		printGradeAvg();
		AppBasics.farewellUser(name);
	}

	/**
	 * This print the grade average given
	 */
	private static void printGradeAvg()
	{
		int num = AppBasics.requestInt("How many grade value will you be entering? ", 1, 10);
		double totalAvg = 0.00;
		int i = 1;
		do
		{
			totalAvg = totalAvg + AppBasics.requestDouble("Can I get your grade entry #" + i);
			i++;
		} while (i <= num);
		System.out.printf("The grade average is: %.1f%%\n", totalAvg / num);
	}

	/**
	 * This print out some numbers: 1. 1-100 2. 200-100 3. 10-1000 divisble by
	 * 10
	 */
	private static void printNum()
	{
		System.out.println("1. Print count from 1 to 100: ");
		for (int i = 1; i <= 100; i++)
		{
			System.out.println("i is " + i);
		}
		System.out.println("2. Print count from 200 to 100: ");
		for (int i = 200; i >= 100; i--)
		{
			System.out.println("i is " + i);
		}
		System.out.println("3. Print 10-1000 with only numbers evenly divided by 10");
		for (int i = 10; i <= 1000; i = i + 10)
		{
			System.out.println("This number:" + i + " is divisible by 10");
		}
	}

	/**
	 * This print out some numbers: 1. all even from 1-100 2. all odd from
	 * 300-400 3. divisible by 3 from 30-333
	 */
	private static void printNum2()
	{
		System.out.println("1. Print all even number from 1 to 100: ");
		int y = 2; // for odd and even
		int x = 3; // num divisible by 3
		for (int i = 2; i <= 100; i++)
		{
			while ((i % y) == 0)
			{
				System.out.println(i);
				i++;
			}
		}
		System.out.println("2. Print all odd number between 300-400: ");
		for (int i = 300; i <= 400; i++)
		{
			while ((i % y) == 1)
			{
				System.out.println(i);
				i++;
			}
		}
		System.out.println("3. Print 30-333 with only numbers evenly divided by 3");
		for (int i = 30; i <= 333; i++)
		{
			while ((i % x) == 0)
			{
				System.out.println(i);
				i++;
			}
		}
	}
}