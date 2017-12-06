import java.util.Arrays;
import java.util.Scanner;
public class anagram 
{
		
	public static void main(String[] args)
		{
			String word1, word2;			
			System.out.println("Enter word 1");
			Scanner console = new Scanner(System.in);
			word1 = console.nextLine(); 
			System.out.println("Enter word 2");
			word2 = console.nextLine(); 
			if(word1.length() == word2.length())
			{
				char[] charword1 = word1.toCharArray();
				char[] charword2 = word2.toCharArray();
				Arrays.sort(charword1);
				//System.out.println(charword1);
				Arrays.sort(charword2);
				
				if(Arrays.equals(charword1, charword2))
				{
					System.out.print("It is an anagram");		
				}								
			}
			else
			{
				System.out.print("It is not an anagram");
			}
			console.close();
		}
	}

