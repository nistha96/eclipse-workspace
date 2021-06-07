package JavaTraning;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		//int z = 10;
		//int z = 0;
		for(i = 1; i<=4; i++)// row
		{
			int z = 1;
			//for(j = 1; j<= 5-i; j++) //column
			for(j=4;j>=5-i;j--)	
			{
				//System.out.println(z);
				System.out.print(z);
				System.out.print("\t"); //for space 
				
				//z--;
				z++;
			}
			System.out.println("");
		}

	}

}
