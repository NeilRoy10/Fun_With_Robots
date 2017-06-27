import org.jointheleague.graphical.robot.Robot;

public class IntroToLeagueRobot {
	public static void main(String[] args) {
		//put your code here
		Robot Neil = new Robot();
		Robot Neil2 = new Robot();
		Neil.move(5);
	    Neil2.move(-5);
		Neil.penDown();
		Neil2.penDown();
		Neil.setPenColor(100, 100, 200);
		Neil2.setPenColor(100, 100, 200);
		Neil.hide();
		Neil2.hide();
		Neil.setSpeed(10);
		Neil2.setSpeed(5);
		int varible = 20;
	   for (int i = 0; i < 50; i++) {
			
		
		for (int j = 0; j < 4 ; j++) {
			
		
		Neil.move(100);
		Neil2.move(-100);
	    Neil.turn(90);
		Neil2.turn(-90);
		varible = varible + 5;
		}
		Neil.turn(-90);
		Neil2.turn(-90);
		Neil.move(varible);
		Neil2.move(varible);
		}
	   }
	}


	

