import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    String input = sc.next();
	    int rounds = 0;
	    //this block help you to determine how many rounds required
	    if(input.length()%2==0)
	        rounds = input.length()/2; // if even length / 2 times
	    else
	        rounds = (input.length()/2)+1; // if odd length /2 + 1 times
	    
	    //loop till rounds
	    for(int i=0;i<rounds;i++)
	    {
		//loop till the all the characters
	        for(int j=i;j<input.length()-i;j++)
	        {
	            System.out.print(input.charAt(j));
	        }
	        System.out.println();
	    }

	}
}
