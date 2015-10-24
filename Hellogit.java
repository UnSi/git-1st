import java.io.BufferedReader;
import java.io.InputStreamReader;

class Hellogit
{
	public static void main (String[] args){
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.print("Enter the name of your GIT repository:");
			String s = r.readLine();
			//int i = Integer.parseInt(r.readLine());
			System.out.println("Hello, " + s);
		//	System.out.println("You have " + i + " repositories");
		}
		catch (Exception e) {System.out.println(e.toString());}
		}	
}