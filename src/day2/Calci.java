package day2;

public class Calci {
	
	int lhs;
	int rhs;
	
	public Calci (int x, int y)
		{
			lhs = x;
			rhs= y;
		}
	
	public int toAdd()
	{
		int result = lhs+rhs;
		return result;
	}
	
	public int toSub()
		{
			int result = lhs-rhs;
			return result;
		}

}
