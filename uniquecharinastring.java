import java.util.Scanner;

public class uniquecharinastring {
	
public static void main(String[] args)
	{
		String word;
		int count = 1,i,j;
		String temp = "";
		System.out.print("Enter the word ");
		Scanner console = new Scanner(System.in);
		word=console.nextLine(); 
		for(i=0;i<word.length();i++)
		{
			if(!temp.contains(word.charAt(i) + ""))
			{		
				temp = temp + word.charAt(i);
			//	System.out.print(word.charAt(i));
			}			
		}	System.out.println(temp);
		console.close();
	}
	}




