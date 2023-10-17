package com.mphasis.billsystem;

public class BillCalculator {

	public static void main(String[] args) {
	int units= 200;
	double billtoPay= 0;
			if(units<100)
			{
				billtoPay=units*1.20;
			}
			else
			{
				billtoPay=100*1.20+(units-100)*2;
			}
	System.out.println("The electricity bill for"+units+ "is :" +billtoPay);
	}

}
