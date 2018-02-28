import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    String input = sc.next();
	    
	    int rounds = 0;
	    if(input.length()%2==0)
	        rounds = input.length()/2;
	    else
	        rounds = (input.length()/2)+1;
	    
	    for(int i=0;i<rounds;i++)
	    {
	        for(int j=i;j<input.length()-i;j++)
	        {
	            System.out.print(input.charAt(j));
	        }
	        System.out.println();
	    }

	}
}
