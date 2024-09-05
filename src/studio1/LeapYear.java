package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("What year?");
		boolean isLeap;
		int year = in.nextInt();
		if ((year % 4 == 0) && (year % 100 != 0)) {
			isLeap = true;
		}
		else if(year % 400 == 0){
			isLeap = true;
		}
		else {
			isLeap = false;
		}
				
		System.out.println(year + " is a leap year: " + isLeap);
	}
		

}


