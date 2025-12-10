
import java.util.*;
public class CTJ27703 {
	public static void uniqElement(int arr[])
	{
		int count = 0;
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			boolean flag = false;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i] == arr[j])
				{
					flag = true;
					break;
				}
			}
			if(!flag)
			{
				arr[count++] = arr[i];
			}
		}
		int count2 = 0;
		for(int i=0;i<count;i++)
		{
			// System.out.print(arr[i] + " ");
			count2++;
			
		}
		System.out.println(count2);
	}
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine().trim();
	String[] numStrings = input.split(" ");
	int[] nums = new int[numStrings.length];
	for(int i=0;i<numStrings.length;i++)
	{
		nums[i] = Integer.parseInt(numStrings[i]);
	}
	uniqElement(nums);
}
}
