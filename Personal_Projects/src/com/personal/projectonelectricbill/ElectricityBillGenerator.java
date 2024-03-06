package com.personal.projectonelectricbill;

import java.util.Scanner;

public class ElectricityBillGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
System.out.print("Enter customer name: ");
		
			String customerName = sc.nextLine();

			System.out.print("Enter customer ID: ");
			int customerId = sc.nextInt();



			System.out.print("Enter units consumed: ");
			double unitsConsumed = sc.nextDouble();


			double ratePerUnit = 3.50;  

			double totalBill = unitsConsumed * ratePerUnit;


			System.out.println("\nElectricity Bill");
			System.out.println("Customer Name: " + customerName);
			System.out.println("Customer ID: " + customerId);
			System.out.println("Units Consumed per Month: ₹" + unitsConsumed);
			System.out.println("Rate per Unit: ₹" + ratePerUnit);  
			System.out.println("Total Bill: ₹" + totalBill);


			sc.close();
		}

	}


//hi this is pune city I am a from hyderabad  try to count vowels on the first word
