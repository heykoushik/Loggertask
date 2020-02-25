package com.epam.loggingtask;
import Operation.*;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Interest {
	private static final Logger LOGGER=LogManager.getLogger(App.class);
	private Double result;
	int S=0;
	operation op=new operation();
	Interest()
	{
		 Scanner sc = new Scanner(System.in);
		 String Perform=sc.next();
		
    	sc.nextLine();
	if(Perform.equalsIgnoreCase("simple interest")||Perform.equalsIgnoreCase("si")||Perform.equals("Simple interest"))S=1;
	if(Perform.equalsIgnoreCase("compound interest")||Perform.equalsIgnoreCase("ci")||Perform.equals("Compound interest"))S=2;
	if(Perform.equalsIgnoreCase("estimation")||Perform.equalsIgnoreCase("est")||Perform.equals("Estimation"))S=3;
	switch(S)
	{
		case 1:	
			LOGGER.error("Enter the values to perform operation: ");
			double p = sc.nextDouble();
			double t = sc.nextDouble();
			double r = sc.nextDouble();
			this.result = op.Simple_interest(p,t,r);
			break;
		case 2:
			LOGGER.error("Enter the values to perform operation: ");
			double p1 = sc.nextDouble();
			double t1 = sc.nextDouble();
			double r1 = sc.nextDouble();
			this.result = op.Compound_interest(p1,t1,r1);
			break;
		case 3 :
			LOGGER.error("Enter the value of sq.ft\n");
			double s = sc.nextDouble();
			LOGGER.error("Choose:\nStandard materials enter 1\nAbove standard materials enter 2\nHigh standard material enter 3\nHigh standard material and fully automated enter 4\n");	
			int req =sc.nextInt();
			this.result = op.Estimation(s,req);
			break;
	}
		sc.close(); 
	}
	public void Result()
	{
		if(result!=null)System.out.println("Result: "+result);
		else System.out.println("interest is not possible");
	}
}