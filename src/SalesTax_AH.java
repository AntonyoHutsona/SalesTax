/**
 * This program calculates the total price which includes sales tax
 * Student:	    Antonyo Hutsona
 * Student-ID:	36225268
 * Class        CIS163AA
 * Assignment:	Chapter 2 Assignment 1 task # 3
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalesTax_AH {
	public static void main(String[] args) {

		// Constants
		final double SALES_TAX_RATE = 0.055;								// Sales tax rate

		// Scanner object, read from keyboard
		Scanner keyboard = new Scanner(System.in);

		// Display prompts and get input
		System.out.print("Item description: ");
		String item = keyboard.nextLine().concat(" ");						// Item description from keyboard
		System.out.print("Item price: $");
		double price = keyboard.nextDouble();								// Price of item from keyboard

		// Consume remaining newline.
		keyboard.nextLine();

		// Calculations
		double tax = price * SALES_TAX_RATE;								// Calculated sales tax
		double total = price + tax;											// Calculated total with sales tax

		// DecimalFormat object, format to dollar amount
		DecimalFormat dollar = new DecimalFormat("$#,##0.00");

		/*
		 * Display results
		 * Fields should line up nicely
		 */
		String padFormat = "%-25s%s%n";										// left justifies fields fix spacing
		System.out.printf(padFormat, item, dollar.format(price));
		System.out.printf(padFormat, "Tax", dollar.format(tax));
		System.out.printf(padFormat, "Total", dollar.format(total));
	}
}
