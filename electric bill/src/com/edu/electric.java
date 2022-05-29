package com.edu;

import java.util.Scanner;

public class electric {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your name");
	String name=sc.next();
	System.out.println("enter the unit");
	int unit=sc.nextInt();
	double bill=0;
	if(unit>0 && unit<=100)
	{
		bill=unit*2;
	}
	else if(unit>100 && unit<=300 )
	{
		bill=100*2+(unit-100)*3;
	}
	else {
		bill=100*2+200*3+(unit-300)*5;
		double surcharge = (bill*2.5)/100;
		bill=bill+surcharge;
	}
	System.out.println("Name of the customer="+name);
	System.out.println("number of unit consumend="+unit);
	System.out.println("bill amount="+bill);

	}

}
