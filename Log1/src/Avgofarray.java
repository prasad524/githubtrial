
public class Avgofarray {
	

	public static void main(String[] args) {
		
		
		int a[]= {1,9,4,6,85,35};
		int sum=0;
		double avg=0;
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.println(avg);
			System.out.println(avg);
			sum= sum+a[i];
			avg= sum/2;
		}
		System.out.println(avg);
		
		
		System.out.println("finding specific number and removing that number from array");
		
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]==85)
			{
				System.out.println(i);
				
			}
			else
			{
				for(int j=0; j<=a.length-1; j++)
				{
					a[i]=a[j];
				System.out.println(a[j]);
				
			}
		}
		}
		
		
		
	
		
		
	}
	

}
