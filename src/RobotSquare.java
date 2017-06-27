import org.jointheleague.graphical.robot.Robot;
 
public class RobotSquare {
	public static void main(String[] args) throws Exception {
		// 1. Make a new Robot
 Robot Neil = new Robot();
		// 3. Put the robot's pen down
Neil.penDown();
		// 6. Make the robot move as fast as possible
Neil.setSpeed(100);
		// 5. Do everything below here 4 times

 

		// 		2. Move your robot 200 pixels
	for (int i = 0; i < 4; i++) {
		 Neil.move(200);
		 Neil.turn(90);
	}
 // 		4. Turn the robot 90 degrees to the right (90 degrees)

	
	}
}