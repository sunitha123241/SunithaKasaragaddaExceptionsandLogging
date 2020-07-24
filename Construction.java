package logger;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger; 
public class Construction
{
	int standard,areac;
	Construction(int std,int area)
	{
		standard=std;
		areac=area;
	}
	String calculateCost()
	{
		if(standard==1)
			return("Construction Cost: "+areac*12000);
		else if(standard==2)
			return("Construction Cost: "+areac*15000);
		else if(standard==3)
			return("Construction Cost:"+areac*18000);
		else if(standard==4)
			return("Construction Cost:"+areac*25000);
		else
			return("invalid");
	}
}