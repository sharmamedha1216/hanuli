package diomand;

public class Actualdiomand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i=1; i<=5; i++)
		{
		for(j=4; j>=i; j--)
		{
		System.out.print(" ");
		}
		for(k=1; k<=(2*i-1); k++)
		{
		System.out.print("*");
		}
		System.out.println("");
	}

		//int i,j,k;
		for(i=1; i<=5; i++)
		{
			for(j=1; j<i; j++)
				{
				System.out.print(" ");
				}
			for(k=9; k>=(2*i-1); k--)
				{
					System.out.print("*");
				}
		System.out.println("");
		
}
}
}

