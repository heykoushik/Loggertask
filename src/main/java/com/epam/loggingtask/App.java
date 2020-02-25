package com.epam.loggingtask;
import java.util.*;
import java.util.NoSuchElementException;
import org.apache.logging.log4j.*;
public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    Scanner sc = new Scanner(System.in);
	boolean condition=true;
    while(condition)
    {
    	LOGGER.error("Choose the operation to be performed : \n");
        Interest i = new Interest();
    	i.Result();
    	LOGGER.error("To continue enter y for Yes and n for No\n");
    	//String again = sc.next();
    	int again=sc.nextInt();
    	//if(again.equalsIgnoreCase("y"))
    	if(again==1)
    		condition = true;
    	else
    	{
    	condition = false;
    		break;
    	}
    }
    sc.close();
}
}
