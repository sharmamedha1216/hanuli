package assignmentDay2;

public class UsingSwitch {
	
	public String Weekday (int x)
	{
		String result = "None of these";
		
		switch(x)
		{
		case 1 : result = "Mon";
		break;
		
		case 2 : result = "Tue";
		break;
		
		default : result =  "None of these";
		
		}
		return result;
	}

}
