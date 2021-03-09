import java.util.Scanner;
import java.util.Arrays;


public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Longest Increasing Subsequence!!");
		System.out.println("Enter the number sequence numbers:");
		
		String str = sc.nextLine();
		String[] temp = str.split(",");
		
		int[] arrSeq = new int[temp.length];
		
		for(int i = 0; i < temp.length; i++)
		{
			arrSeq[i]=Integer.parseInt(temp[i]);
		}
		incrSubeq(arrSeq, temp.length);		
	}
	

	private static void incrSubeq(int[] a, int l)
	{
		int[] lis = new int[l]; 
		int[] prev = new int[l];
		int maxLength = 0, bestEnd = 0; 
		
		for(int i = 0; i < l; i++)
		{
			prev[i] = -1;
			lis[i] = 1;
			for(int j = i - 1; j>=0; j--)
			{
				if(a[j] < a[i] && lis[j] + 1 > lis[i])
				{
					lis[i] = lis[j] + 1;
					prev[i] = j;	
				}
			}
			if(lis[i] > maxLength)
			{
				maxLength = lis[i];
				bestEnd = i;	
			}
		}
		int n = bestEnd;
		int[] lis_print = new int[maxLength];
		int pos = maxLength - 1; 
		while(n != -1)
		{
			lis_print[pos] = a[n];
			pos--;	//
			n = prev[n];
		}

		System.out.printf( "the subsequece is "+ Arrays.toString(lis_print)+" with length "+lis_print.length);
		
	}
}