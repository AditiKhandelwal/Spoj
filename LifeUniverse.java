package SPOJ;
import java.util.Scanner;
public class LifeUniverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		for(int i=1;i>0;i++)
		{
			int n = scn.nextInt();
			if(n>=0 && n<100)
			{
				if(n!=42)
					System.out.println(n);
				else
					break;
			}
		}

	}

}
