package custom_exceptions;
import custom_exceptions.SpeedOutOfRangeException;
public class classVehicleValidationRules {
	public static int MIN_SPEED;
	public static int MAX_SPEED;
	
	static {
		
		MIN_SPEED = 40;
		MAX_SPEED = 100;
		
	}
	public static void validationSpeed(int speed) throws SpeedOutOfRangeException
	{
		if(speed < 40)
			throw new SpeedOutOfRangeException("Too slow");
		if (speed > 100) {
			
			throw new SpeedOutOfRangeException("Too Fast");
		//System.out.println("speed within range....");
		}
	}

}
