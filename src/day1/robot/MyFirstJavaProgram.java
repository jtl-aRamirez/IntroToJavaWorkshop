package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE 
Robot Noel=new Robot();
for (int i = 0; i < 200; i++) {
	Noel.setPenColor(200, 0, 0);
Noel.setSpeed(200);
Noel.penDown();
Noel.move(200);
Noel.turn(200);
Noel.move(200);
Noel.turn(200);
Noel.move(200);
Noel.turn(200);		
Noel.move(200);
}
}
}