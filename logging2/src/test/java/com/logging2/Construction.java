package com.logging2;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Construction {
	private static final Logger LOGGER=LogManager.getLogger(Construction.class);
	@Test
	public void ConstructionCost() {
		Scanner s=new Scanner(System.in);
		LOGGER.info("Menu");
		LOGGER.info("1.Standard Materials");
		LOGGER.info("2.Above Standard Materials");
		LOGGER.info("3.High Standard Material");
		LOGGER.info("4.High Standard Material and Fully Automated Home");
		int[] mc= {1200,1500,1800,2500};
		int c;
		double a,p;
		LOGGER.info("Enter your choice regarding the material of your house");
		c=s.nextInt();
		LOGGER.info("Enter total area of the house in square feet");
        a=s.nextDouble();
        p=mc[c-1]*a;
        LOGGER.info("The cost of construction in rupees is:");
        LOGGER.info(p);
	}

}
