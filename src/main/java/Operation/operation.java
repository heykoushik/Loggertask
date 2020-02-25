package Operation;
import java.lang.Math;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.loggingtask.App;
//import java.util.*;
public class operation implements Operations {
	private static final Logger LOGGER=LogManager.getLogger(App.class);

	//Scanner sc = new Scanner(System.in);
	public double Simple_interest(double p, double t,double r) {
		return ((p*t*r)/100);
}

public double Compound_interest(double p, double t,double r) {
		return (p*(Math.pow((1+(r/100)),t)-1));
}

public double Estimation (double s,int req) {
	  double re=0;
		switch(req)
		{
		case 1:
			LOGGER.error("Estimated cost is:\n");
			re= (s*1200);
			break;
		case 2:
			LOGGER.error("Estimated cost is:\n");
			re= (s*1500);
			break;
		case 3:
			LOGGER.error("Estimated cost is:\n");
			re= (s*1800);
			break;
		case 4:
			LOGGER.error("Estimated cost is:\n");
			re= (s*2500);
			break;		
		}
		return re;
}	
}
