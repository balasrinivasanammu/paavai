package PaavaiDSpack;

/*public class Paavai13thdaysearching {

	public static void main(String[] args) {
		int a[]= {20,10,30,40,50};
		int search=-30,flag=0;
		for(int i=0;i<5;i++)
		{
			if(search==a[i])
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}*/
/*
public class Paavai13thdaysearching {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target)
                return mid; 
            else if (arr[mid] < target)
                left = mid + 1; 
            else
                right = mid - 1; 
        }

        return -1; 
    }

    public static void main(String[] args) {
        int[] data = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;

        int result = binarySearch(data, target);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found.");
    }
}
*/
public class Paavai13thdaysearching {
	public static void main(String baljai[])
	{
		String na="mangocitysalem";
		char src='a';
		int flag=0;
		for(int i=0;i<=na.length()-1;i++)
		{
			if(src==na.charAt(i))
			{
				flag=1;
				//break;
				System.out.print(i);
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("not");
		}
}
}
