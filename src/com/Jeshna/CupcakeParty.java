package com.Jeshna;

import java.util.Scanner;

/**
 * @author Jeshna Kanduri
 * @date 10/06/2024 
 * Variables - determining #of leftover cupcakes(constant #of students, input-amount of boxes, each type with diff. capacities)
 * (CCC 2022 jr)
 */
public class CupcakeParty {
	
	/**
	 * Main method
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		
		// Cupcake Party constants given by ccc problem
		final int REG_BOX = 8;
		final int SMALL_BOX = 3;
		final int NUM_STUDENTS = 28;
		
		// Getting info from user ---> amount of each box type
		Scanner regBoxInput = new Scanner(System.in);
		Scanner smallBoxInput = new Scanner(System.in);
		
		// Calculating the total amount of cupcakes (regular + small)
		int total = (regularCupcakes(REG_BOX, regBoxInput))+ (smallCupcakes(SMALL_BOX, smallBoxInput));
		
		// Calculating and displaying the remaining amount of cupcakes after each student has gotten one
		int remainingCc = total - NUM_STUDENTS;
		System.out.println(remainingCc);
	}
	

	/**
	 * Calculates amount of cupcakes resulting from the regular boxes
	 * @param regularBoxCc Amount of cupcakes one regular box holds
	 * @param regInput Amount of regular boxes user wants
	 * @return Total amount of regular box cupcakes
	 */
	private static int regularCupcakes(int regularBoxCc, Scanner regInput) {
		Scanner input = new Scanner(System.in);
		int regBoxes = input.nextInt();
 
		int regTotal = regularBoxCc * regBoxes;
		return regTotal;
	}
	
	/**
	 * Calculates amount of cupcakes resulting from the small boxes
	 * @param smallBoxCc Amount of cupcakes one small box holds
	 * @param smInput Amount of small boxes user wants
	 * @return Total amount of small box cupcakes
	 */
	private static int smallCupcakes(int smallBoxCc, Scanner smInput) {
		Scanner input = new Scanner(System.in);
		int smallBoxes = input.nextInt();
	
		int smallTotal = smallBoxCc * smallBoxes;
		return smallTotal;	
	}
}