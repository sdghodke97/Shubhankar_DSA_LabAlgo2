package com.gl.paymoney;
import java.util.*;
public class CurrencyDenominations {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of currency denominations:");
	        int n = sc.nextInt();
	        int[] denominations = new int[n];
	        System.out.println("Enter the currency denominations value:");
	        for (int i = 0; i < n; i++) {
	            denominations[i] = sc.nextInt();
	        }
	        System.out.println("Enter the amount you want to pay:");
	        int amount = sc.nextInt();
	        Arrays.sort(denominations); // sort the denominations in ascending order
	        int[] notes = new int[n];
	        for (int i = n - 1; i >= 0; i--) {
	            notes[i] = amount / denominations[i];
	            amount = amount % denominations[i];
	        }
	        if (amount == 0) {
	            int totalNotes = 0;
	            System.out.println("Your payment approach in order to give min no of notes will be:");
	            for (int i = n - 1; i >= 0; i--) {
	                if (notes[i] > 0) {
	                    System.out.println(denominations[i] + ":" + notes[i]);
	                    totalNotes += notes[i];
	                }
	            }
	            System.out.println("Total number of notes: " + totalNotes);
	        } else {
	            System.out.println("Payment cannot be made for the entered amount.");
	        }
	 }
}
