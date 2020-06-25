//Daisy Murillo  Wed. June 24, 2020
package week2assignment;

public class loops {
	public static void main(String[] args) {
		loopOne();   //		A while loop that prints all even numbers from 0 to 100
		loopTwo();   //		A while loop that prints every 3rd number going backwards from 100 until we reach 0
		loopThree(); //		A for loop that prints every other number from 1 to 100
		loopFour();  //		A for loop that prints every number from 0 to 100, but if the number is divisible by 3, it prints “Hello” instead of the number, and if the number is divisible by 5, it prints “World” instead of the number, and if it is divisible by both 3 and 5, it prints “HelloWorld” instead of the number.
	}
	public static void loopOne() {
		System.out.println("########################## LOOP ONE ##########################");
		int i =0;
		
		while (i <=100) {
			System.out.println(i);
			i+=2;
		}	
	}
	public static void loopTwo() {
		System.out.println("########################## LOOP TWO ##########################");
		int i = 100;
		
		while (i >= 0) {
			System.out.println(i);
			i-=3;	
		}
	}
	public static void loopThree() {
		System.out.println("########################## LOOP THREE ##########################");
		int i = 1;
		
		while (i <= 100) {
			System.out.println(i);
			i+=2;	
		}
	}
	public static void loopFour() {
		System.out.println("########################## LOOP FOUR ##########################");
		
		for(int i=0; i <= 100; i++) {
			if (i % 15 == 0 ) {
				System.out.println("Hello World");
			} 
			else if ( i % 3 == 0 ) {
				System.out.println("Hello");
			}
			else if ( i % 5 == 0 ) {
				System.out.println("World");
			} 
			else {
				System.out.println(i);
			}
		}
	}
}
