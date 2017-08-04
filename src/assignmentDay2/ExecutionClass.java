package assignmentDay2;

import java.util.Scanner;

public class ExecutionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("enter the Weekday :-");	
	Scanner scan = new Scanner (System.in);	
	int result = scan.nextInt();
	ReturnWeek obj = new ReturnWeek();
	obj.toReturnWeek(result);
	}

}
