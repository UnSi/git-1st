	import java.io.BufferedReader;
	import java.io.InputStreamReader;
class unsi
{
	public static void main(String[] args){
		try{
		System.out.println("Hellow world!");
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s = r.readLine();
		System.out.println(s);
		System.out.println("Added String");
		}
		catch (Exception e ) {}
	}	
}
	