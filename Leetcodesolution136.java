package Paavaipack;

public class Leetcodesolution136 {
	public int singleNumber(int nums[]) {
        int result = 0;
        for (int num : nums) 
        {
            result ^= num; 
        }
        return result;
    }

	public static void main(String[] args) {
		Leetcodesolution136 l=new Leetcodesolution136();
		int nums[]= {2,2,1};
		//int nums[]={4,1,2,1,2};
		int result=l.singleNumber(nums);
		System.out.println(result);

	}

}
