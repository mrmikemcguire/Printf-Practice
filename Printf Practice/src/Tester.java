import java.util.ArrayList;

public class Tester
	{
		public static void main(String[] args)
			{
			String s1 = "Mike";
			String s2 = "Phillip";
			String s3 = "Christopher";
			String s4 = "Joe";
			String s5 = "Fred";  //added by Mr. McGuire @ 2:27
			//test test
			ArrayList<String> names = new ArrayList<String>();
			names.add(s1);
			names.add(s2);
			names.add(s3);
			names.add(s4);
			
			System.out.println(s1 + "\t" + s2 + "\t" 
			+ s3 + "\t" + s4);
			System.out.println();
			
			System.out.printf("%-12s %-12s %-12s %-12s", 
					s1, s2, s3, s4);

			System.out.println("\n");

		
			for (Object s : names)
				{
				System.out.printf("%-12s", s);
				}
			}
	}
