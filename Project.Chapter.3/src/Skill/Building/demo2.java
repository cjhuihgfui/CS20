package Skill.Building;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userinput = new Scanner(System.in);
		
		int x = 5;
		double y =6.7;
		char m = 'A';
		String name = "vigor";
		int z = x + x;
		
		final double PI = 3.14;
		
		
		System.out.println("enter an integer: ");//Promting for an int
		int numEntered = userinput.nextInt();//recording an int
		
		System.out.println("the integer you've entered is:"+ numEntered );
		System.out.println("Please type Y/N");
		char ans = userinput.next().charAt(0);
		
		if(ans == 'Y')
		{
			System.out.println("great! we will move on.");
		
		}	
		else	
		{
			System.out.println("Sorry");
			
		}
		
		
	}

}
