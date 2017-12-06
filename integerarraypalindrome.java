import java.util.ArrayList;

public class integerarraypalindrome {
	public static void main(String[] args)
	{
		int[] num= {9,4,3,5,3,4,9};
		int count=0;
			  for(int i = 0 ; i < num.length/2 ; i++)
			  {
			    if(num[i]==num[num.length-(i+1)]) 
			    	count++;
			    	
			  }
			 // System.out.println(count);
			  if(count== num.length/2)
			  {
			  System.out.println("Palindrome");
			  }
			  else
			  {
			  
			  System.out.println("Not a palindrome");
	}
			  }
}
