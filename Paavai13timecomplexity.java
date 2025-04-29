package PaavaiDSpack;

public class Paavai13timecomplexity {

	public static void main(String[] args) {
		/*
		O(n)
		O(n2)
		O(1)
		O(log(n))
		O(n)(log(n))
		O(2n)
		O(m*n)
		*/
		
		// part 1  - O(n)
		int n=10;
		for(int i=1;i<=n;i++)
		{
			System.out.println("balaji");
		}
		
		// part 2  - O(log(n))
				int n=10;
				for(int i=1;i<=n/2;i++)
				{
					System.out.println("balaji");
				}
				
				// part 3  - O(1)
				if(n<10)
				{
					System.out.println("balaji");
				}
				else
				{
					System.out.println("srinivasan");
				}
				
				// part 4 - O(m*n)
				for(int i=1;i<m;i++)
				{
					for(int j=1;j<n;j++) 
					{
						System.out.println("balaji");
					}
				}

	}

}
