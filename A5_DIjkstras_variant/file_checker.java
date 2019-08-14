import java.io.*;
import java.util.*;
public class file_checker
{
	public static void main(String[] args )
	{
		check(args[0],args[1]);
	}
	public static void check(String file_1 ,String file_2)
	{
		try
		{
			
			/*FileInputStream file_1 = new FileInputStream(file1);
			Scanner s = new Scanner(file_1);
			FileInputStream file_2 = new FileInputStream(file2);
			Scanner p = new Scanner(file_2);
			boolean go_on = true;
			int c=0;
			while (go_on)
			{
				if (s.hasNext())	
					if (!(s.nextLine().equals(p.nextLine())))
					{
						go_on=false;
					}
				else
				{
					go_on = false;
					c =1;
				}
			}
			if (c==1&&go_on==true)
			{
				System.out.println("YUPEE");
			}
			else
			{
				System.out.println("OOHO");
			}*/

			byte[] f1 = Files.readAllBytes(file1);
			byte[] f2 = Files.readAllBytes(file2);
			System.out.println(Arrays.equals(f1,f2));
		}
		catch (FileNotFoundException e )
		{
			System.out.println("No Such file Exists in the Directory");
		}
	}
}