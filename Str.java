import java.io.BufferedReader;
import java.io.InputStreamReader;

class Str
{
	public static void main(String[] args){
		try{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number of the words:");
		int num = Integer.parseInt(r.readLine());
		for(int i = 0; i < num; i ++){
			System.out.println("Enter the word:");
			String s = r.readLine();
			if (s.length()>=8)
			{
				s=s.substring(3,8); //3-й символ игнорируется
				System.out.println(s);
			}
			else System.out.println("Less than 8 symbols in the word");
		}
		}catch (Exception e) {}
	
	}
}
	