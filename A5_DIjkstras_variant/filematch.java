import java.util.*;
import java.io.*;

public class filematch{

	static boolean compare(String s1, String s2){
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		int p;
		if (s1.length() - s2.length() > 1 || s1.length() - s2.length() < -1){
			//System.err.println(" : here");
			return false;
		}
		if(s1.length() < s2.length()){
			p = s1.length();
			if(c2[p] != ' '){
				//System.err.println(c2[p] + " : here");
				return false;
			}
		}
		else if(s1.length() > s2.length()){
			p = s2.length();
			if(c1[p] != ' '){
				//System.err.println(c1[p] + " : here");
				return false;
			}
		}
		else{
			p = s2.length();
		}
		for(int i = 0; i < p; i++){
			if(c1[i] != c2[i]){
				//System.err.println(c1[p] + " : here");
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]){
		System.err.println("start");
		try{
			FileInputStream fstream1 = new FileInputStream(args[0]);
			Scanner s1 = new Scanner(fstream1);
			FileInputStream fstream2 = new FileInputStream(args[1]);
			Scanner s2 = new Scanner(fstream2);
			int i = 0;
			int count = 0;
			while(s1.hasNext()){
				i += 1;
				if(s2.hasNext()){
					if(!compare(s1.nextLine(),s2.nextLine())){
						System.out.println("Error in line  : " + i);
						count++;
						if(count >100){
							System.out.println("More than 100 differences!!!!");
							break;
						}
					}
				}
				else{
					System.out.println("Second file has only  : " + i + " lines.");
					break;
				}
			}
			System.out.println("matched!!");
		} catch(FileNotFoundException e){
			System.out.println("File not found");
		}
	}
}