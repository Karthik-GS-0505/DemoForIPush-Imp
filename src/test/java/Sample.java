
public class Sample {

	public static void main(String[] args) {
		int[] arr = {5,4,7,2,1,9,15};
		int max = 0;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(max<arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println("max ="+max);
}
}
