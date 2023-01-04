//{ Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    //taking total number of elements
		    int n=sc.nextInt();
		    
		    //calling printFibb() method
		    long[] res = new Solution().printFibb(n);
		    
		    //printing the elements of the array
		    for (int i = 0; i < res.length; i++)
		        System.out.print (res[i]+" ");
		    System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        long ser[]=new long[n];
        if(n==1)
        {
        ser[0]=1;
        return ser;
        }
        else if(n==2)
        {
            ser[0]=1;
            ser[1]=1;
        }
        else{
        ser[0]=1;
        ser[1]=1;
        int i=2;
        while(i!=n)
        {
        ser[i]=ser[i-1]+ser[i-2];
        i++;
        }
        }
        return ser;
    }
    /*static long fib(int x)
    {
        if(x<=1)
        return 1;
        long last=fib(x-1);
        long slast=fib(x-2);
        return last+slast;
    }*/
}