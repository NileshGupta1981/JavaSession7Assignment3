//import java.util.Scanner;

public class Session7Assignment3 {
	
	public static void main (String args[]){
		//Scanner scnr = new Scanner (System.in);
		NullPointer np = null;
		//System.out.println ("Enter the number");
		//Integer inte;
		try {
		//int  integer = Integer.parseInt(scnr.next());
		np.check(5);
		}
		catch(NullPointerException E){
			
			System.out.println ("Please instantiate the object");
			
		}
		finally{
		System.out.println ("Closing the program");
			//scnr.close();
	}
	}
	
	
}