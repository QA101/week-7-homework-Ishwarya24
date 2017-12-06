package greetingsUtil;

public class GreetingsUtil 
{

	String currentState = "coming";
	
	public static void main(String[] args) 
	{
		
		
		GreetingsUtil gu=new GreetingsUtil();

        
      //  gu.ChangeState();
       
        System.out.println(gu.Hello());
        System.out.println(gu.GoodBye());
	}
	

	/*public void ChangeState()
	{

		if(currentState.equals("coming"))
		{
			
			currentState = "going";

		}

		else 
		{
			currentState="coming";

		}

	}
*/
	

	public String Hello() {

		if(currentState.equals("coming")) 
		{

			return "You already said that";

		}

		else {

			currentState = "coming";

			return "Hi!";

		}

	}

	

	public String GoodBye() {

		if(currentState.equals("going")) {

			return "You already said that";

		}

		else {

			currentState = "going";

			return "bye";

		}

	}


}

