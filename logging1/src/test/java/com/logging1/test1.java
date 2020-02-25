package com.logging1;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class test1 {
	private static Logger LOGGER=LogManager.getLogger(test1.class);
	@Test
	public void CalcInterest1(){
		int p,t,n;
		double r;
		double si=0;
		Scanner s=new Scanner(System.in);
		LOGGER.info("Enter principal amount:");
		p=s.nextInt();
		LOGGER.info("Enter time");
		t=s.nextInt();
		LOGGER.info("Enter rate of interest");
		r=s.nextDouble();
		si=(p*t*r)/100;
		LOGGER.info("The simple interest is:");
		LOGGER.info(si);
		LOGGER.info("Enter n(number of times that interest is compounded per unit t):");
		n=s.nextInt();
		double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        LOGGER.info("The compound interest is:");
        LOGGER.info(cinterest);
	}
}
