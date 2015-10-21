import java.io.BufferedReader;
import java.io.InputStreamReader;

class Str
{
	public static void main(String[] args){
		try{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(r.readLine());
		for(int i = 0; i < num; i ++){
			String s = r.readLine();
			if (s.length()>3)
			s = s.replace(' ', '2');
			else System.out.println("ּוםüרו 3-ץ סטלגמכמג ג סכמגו");
			System.out.println(s);
		}
		}catch (Exception e) {}
	
	}
}
	