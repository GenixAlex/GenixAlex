package javaclass;

public class j1_lesson9_lab03 {
/* 9.8 (The fan class)
 *   Design a class named Fan to represent a fan with the values 1,2,3
 *   to denote the fan speed.
 *   ---------------------------------------------------------------------------
 *   The class contains:
 *   	>Three constants named SLOW, MEDIUM, and FAST
 *   		-With the values: 1, 2, and 3
 *   	/>A private int data field that specifies the speed of the fan
 *   		-Default is SLOW
 *   	/>A private boolean data field named on that specifies whether the fan is 
 *   	 on.
 *   		-Default value is off
 *   	/>A private double data field named radius that specifies the radius of the
 *    	 fan.
 *   		-Default value is 5
 *   	/>A string data field named color that specifies color of the fan
 *   		-Default value is blue
 *   	>The accessor and mutator methods for all four data fields.
 *   	/>A no-arg constructor that creates a default fan.
 *   	>A method named toString( ) that returns string description of the fan
 *  		-if the fan is on, the method returns:
 *  			-fan speed
 *  			-color
 *  			-and radius in one combined string
 *  		-if the fan is off, the method returns:
 *  			-fan color
 *  			-radius
 *  			-"fan is off" in one combined string.
 *  -----------------------------------------------------------------------------
 *  Write a test program that creates two Fan objects.
 *  	Fan1
 *  		>Assigns maximum speed
 *  		>Radius 10
 *  		>Color yellow
 *  		>and turn it on to the first object.
 *  	Fan2
 *  		>Assign medium speed
 *  		>radius 5
 *  		>color blue
 *  		>and turn it off to the second object
 *  	Display the objects by calling their toString method
 *  -----------------------------------------------------------------------------
 */ 
	public static void main(String[] args) {
		// Create two Fan objects
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
				
			fan1.turnOn();//turns fan on
			fan1.setSpeed(fan1.FAST);//Sets to maximum speed
			fan1.setRadius(10);//Sets fan radius to 10
			fan1.setColor("yellow");// Sets fan color to yellow
			
		
			fan2.turnOff();//Sets fan to off
			fan2.setSpeed(fan2.MEDIUM);//Sets speed to medium
			fan2.setRadius(5);//Sets radius to 5.
			fan2.setColor("blue"); //Sets fan color to blue
			
			//Display the objects by calling their toString method
			System.out.println(fan1.toString());
			System.out.println(fan2.toString());
	}
}
//------------------------------------------------------------------------------------------
//class named Fan to represent a fan with the values 1,2,3
	class Fan {
//Declaration and initialization of three constants named SLOW, MEDIUM, and FAST
		final int SLOW = 1;		// Fan speed slow
		final int MEDIUM = 2;	// Fan speed medium
		final int FAST = 3;		// Fan speed fast
//Declaration of data fields		
		private int speed;
		private boolean on;
		private double radius;
		private String color;
//------------------------------------------------------------------------------------------	
//no-arg constructor that creates a default fan.
		Fan(){
			speed = SLOW;
			on = false;
			radius = 5;
			color = "blue";	
		}
//------------------------------------------------------------------------------------------
//Mutator Methods for setting 
		
		public void setSpeed(int newSpeed){//Setter method for fan speed.
		//Switch statement specifies speeds, and the default
			speed = newSpeed;
			switch (speed) {
			case SLOW: speed = SLOW; break;
			case MEDIUM: speed = MEDIUM; break;
			case FAST: speed = FAST; break;
				default: speed = MEDIUM;
			}
		}
		
		public void setRadius(double newRadius){//Setter method for fan radius
			radius = newRadius;
		}
		
		public void setColor(String newColor){//Setter method for fan color
			color = newColor;
		}
		 
		public void turnOn() {//Setter method fan on
				on = true;
		}
		
		public void turnOff() {//Setter method fan off
				on = false;
		}
//----------------------------------------------------------------------------------------
//Accessor Methods
		
		public int getSpeed() {//Getter method for fan speed
			return speed;
		}
		
		public double getRadius() {//Getter method for fan radius
			return radius;
		}
		
				public String getColor() {//Getter method for fan color.
					return color;
				}
		
		public boolean isOn() {//Getter method for if fan isOn
			return on;
		}

		public String toString() {//Returns a string description for the fan
		//If the fan is on print.........
			if (isOn() == true) {
				return "\nFan speed: " + getSpeed() + ", color: " + getColor() + 
						 ", radius: " + getRadius() + "\n";
			}
		//Else if the fan is off print.........
			else{
				return "\nFan color: " + getColor() + ", radius: " + getRadius() +
						 "\nfan is off\n";
			}
		}
	}

