package com.gl.paymoney;

import java.util.Scanner;

public class PayMoney {
	
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Enter the size of the transaction array:");
	        int size = input.nextInt();
	      
	        int[] transactions = new int[size];
	        System.out.println("Enter the values of the transaction array:");
	        for (int i = 0; i < size; i++) {
	            transactions[i] = input.nextInt();
	        }
	       
	        System.out.println("Enter the number of targets:");
	        int numTargets = input.nextInt();
	       
	        for (int t = 1; t <= numTargets; t++) {
	            
	            System.out.println("Enter target " + t + ":");
	            int target = input.nextInt();

	            int total = 0;
	            int numTransactions = 0;
	            for (int i = 0; i < size; i++) {
	                total += transactions[i];
	                numTransactions++;
	                if (total >= target) {
	                    System.out.println("Target achieved after " + numTransactions + " transactions");
	                    break;
	                }
	            }
	            if (total < target) {
	                System.out.println("Given target is not achieved");
	            }
	        }
	    }

}

