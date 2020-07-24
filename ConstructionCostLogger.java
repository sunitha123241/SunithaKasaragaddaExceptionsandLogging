package logger;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger; 
public class ConstructionCostLogger {
	static
	{
		Logger logger=Logger.getLogger(ConstructionCostLogger.class.getName());
		Scanner sc=new Scanner(System.in);
		int standard,area;
		String msg;
		logger.info("Enter Material Standard\n1.standard\n2.above standard\n3.high standard\n4.high standard and fully automated home");
		standard=sc.nextInt();
		if(standard==1||standard==2||standard==3||standard==4)
		{
			logger.info("Enter total area of the house in sq.ft");
			area=sc.nextInt();
			Construction ob1=new Construction(standard,area);
			msg=ob1.calculateCost();
			logger.info(msg);
		}
		else
		{
			logger.info("invalid selection");
			java.lang.System.exit(0); 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}