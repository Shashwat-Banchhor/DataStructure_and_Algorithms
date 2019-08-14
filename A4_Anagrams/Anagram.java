import java.util.*;
import java.io.*;
import java.util.Arrays;
public class  Anagram
{
	static class linked_list
	{
		static class Node
		{
			String element;
			int len_of_str;
			Node next;
			public Node(String item,Node address,int siz)
			{
				element = item;
				next = address;
				len_of_str = siz;
			}
			public String getval()
			{
				return element;
			}
			public Node getnext()
			{
				return next;
			}
			public void change_next(Node a)
			{
				next = a;
			}
		}	


		int num_nodes = 0;
		Node head = null ;
		Node tail = null ; 
		
		public void add_first(String item,int siz)
		{	
			head = new Node(item ,head,siz);
			if (num_nodes==0)
			{
				tail = head;
				tail.change_next(head);
			}
			tail.change_next(head);
			num_nodes ++ ;
		}
		public void add_last(String item,int siz)
		{
			Node second_last = tail;
			tail = new Node(item,tail.getnext(),siz);
			tail.change_next(head);
			second_last.change_next(tail);
			num_nodes++;
		}
		
		
		
		
		
		public boolean isEmpty()
		{
			return (head==null);
		}

		public boolean find(String to_find)
		{
			Node start = head;
			if (tail.element.equals(to_find))
			{
				return true;
			}
			while(start.getval()!=to_find && start!=tail)
			{
				if (start.element.equals(to_find))
				{
					return true;
				}
				start = start.next;
			}
			return false;
		}
		
		public Vector<String> find_Valid_per(String inp,Vector<Character> vector_of_chars)
		{
						Vector<String> brr = new Vector<>();
						int size = inp.length();
						Node nod = head;
						int times = num_nodes;
 						while (times>0)
 						{
 							if (nod.len_of_str==size)
 							{
 								int iqw=0;
 								for (int y = 0;y<vector_of_chars.size();y++)
 								{
 									if (str_contains_char(nod.element,vector_of_chars.get(y))!=str_contains_char(inp,vector_of_chars.get(y)))
 									{
 										break;
 									}
 									iqw++;
 								}
 								if (iqw==vector_of_chars.size())
 								{
 									brr.add(nod.element);
 								}
							}
							nod=nod.next;
							times--;
 						}
 						return brr;
		}

		public static int str_contains_char(String s,char a)
		{
			int count = 0;
			for (int i=0;i<s.length();i++)
			{
				if (s.charAt(i)==a)
				{
					count++;
				}
			}
			return count;
		}

		
	}
	public static void main(String args[])
	{
		try
		{
			long startTime=System.currentTimeMillis();
			FileInputStream voc = new FileInputStream(args[0]);
			Scanner s = new Scanner(voc);
			int no_of_words=Integer.parseInt(s.nextLine());
			linked_list[] word_store = new linked_list[pow(37,3)];
			
			
			for (int i=0;i<no_of_words ;i++ ) 
			{
				String abba= s.nextLine();
				int size =abba.length();
				int hash_val=0;
				if (size<=12)
				{
					int pos=0;
					
					while(pos<3)
					{
						if (abba.charAt(pos)==('0')) // char_At
						{
							hash_val+=1*pow(37,pos);
						}
						else if (abba.charAt(pos)==('1')) 
						{
							hash_val+=2*pow(37,pos);
						}
						else if (abba.charAt(pos)==('2')) 
						{
							hash_val+=3*pow(37,pos);
						}
						else if (abba.charAt(pos)==('3')) 
						{
							hash_val+=4*pow(37,pos);
						}
						else if (abba.charAt(pos)==('4')) 
						{
							hash_val+=5*pow(37,pos);
						}
						else if (abba.charAt(pos)==('5')) 
						{
							hash_val+=6*pow(37,pos);
						}
						else if (abba.charAt(pos)==('6')) 
						{
							hash_val+=7*pow(37,pos);
						}
						else if (abba.charAt(pos)==('7')) 
						{
							hash_val+=8*pow(37,pos);
						}
						else if (abba.charAt(pos)==('8')) 
						{
							hash_val+=9*pow(37,pos);
						}
						else if (abba.charAt(pos)==('9')) 
						{
							hash_val+=10*pow(37,pos);
						}
						else if (abba.charAt(pos)==('a')) 
						{
							hash_val+=11*pow(37,pos);
						}
						else if (abba.charAt(pos)==('b')) 
						{
							hash_val+=12*pow(37,pos);
						}
						else if (abba.charAt(pos)==('c')) 
						{
							hash_val+=13*pow(37,pos);
						}
						else if (abba.charAt(pos)==('d')) 
						{
							hash_val+=14*pow(37,pos);
						}
						else if (abba.charAt(pos)==('e')) 
						{
							hash_val+=15*pow(37,pos);
						}
						else if (abba.charAt(pos)==('f')) 
						{
							hash_val+=16*pow(37,pos);
						}
						else if (abba.charAt(pos)==('g')) 
						{
							hash_val+=17*pow(37,pos);
						}
						else if (abba.charAt(pos)==('h')) 
						{
							hash_val+=18*pow(37,pos);
						}
						
						else if (abba.charAt(pos)==('i')) 
						{
							hash_val+=19*pow(37,pos);
						}
						else if (abba.charAt(pos)==('j')) 
						{
							hash_val+=20*pow(37,pos);
						}
						else if (abba.charAt(pos)==('k')) 
						{
							hash_val+=21*pow(37,pos);
						}
						else if (abba.charAt(pos)==('l')) 
						{
							hash_val+=22*pow(37,pos);
						}
						else if (abba.charAt(pos)==('m')) 
						{
							hash_val+=23*pow(37,pos);
						}
						else if (abba.charAt(pos)==('n')) 
						{
							hash_val+=24*pow(37,pos);
						}
						
						else if (abba.charAt(pos)==('o')) 
						{
							hash_val+=25*pow(37,pos);
						}
						else if (abba.charAt(pos)==('p')) 
						{
							hash_val+=26*pow(37,pos);
						}
						else if (abba.charAt(pos)==('q')) 
						{
							hash_val+=27*pow(37,pos);
						}
						else if (abba.charAt(pos)==('r')) 
						{
							hash_val+=28*pow(37,pos);
						}
						else if (abba.charAt(pos)==('s')) 
						{
							hash_val+=29*pow(37,pos);
						}
						else if (abba.charAt(pos)==('t')) 
						{
							hash_val+=30*pow(37,pos);
						}
						else if (abba.charAt(pos)==('u')) 
						{
							hash_val+=31*pow(37,pos);
						}
						else if (abba.charAt(pos)==('v')) 
						{
							hash_val+=32*pow(37,pos);
						}
						else if (abba.charAt(pos)==('w')) 
						{
							hash_val+=33*pow(37,pos);
						}
						else if (abba.charAt(pos)==('x')) 
						{
							hash_val+=34*pow(37,pos);
						}
						else if (abba.charAt(pos)==('y')) 
						{
							hash_val+=35*pow(37,pos);
						}
						else if (abba.charAt(pos)==('z')) 
						{
							hash_val+=36*pow(37,pos);
						}
						else 
						{
							hash_val+=0*pow(37,pos);
						}
						pos++;
						if (word_store[hash_val]==null)
						{	
						 	word_store[hash_val] = new linked_list();
						 	word_store[hash_val].add_first(abba,size); 
						}
						else
						{
							word_store[hash_val].add_last(abba,size); 
						}
					}

				}
			
			}
			FileInputStream fin_ana = new FileInputStream(args[1]);
			Scanner sec = new Scanner(fin_ana);
			int no_of_words_in_input=Integer.parseInt(sec.nextLine());
			while(no_of_words_in_input>0)
			{
				find_anagrams(word_store,sec.nextLine());
				no_of_words_in_input--;
			}
			
			
		}
		catch (FileNotFoundException e )
		{
			System.out.println("No Such file Exists in the Directory");
		}


	}
	public static boolean search(linked_list[] store ,  String to_find)
	{
		int hash_val = compute_hash_val(to_find);
		
		if (store[hash_val]==null)
		{
			return false;
		}
		else
		{
			return store[hash_val].find(to_find);
		}
	}

	public static void Voc_Store(String filename)
	{
		try
		{
			//long fac = factorial(14);
			long startTime=System.currentTimeMillis();
			//long fac = factorial(14);
			FileInputStream voc = new FileInputStream(filename);
			Scanner s = new Scanner(voc);
			int no_of_words=Integer.parseInt(s.nextLine());
			linked_list[] word_store = new linked_list[pow(37,3)];
			//linked_list[] vocabulary = new linked_list[no_of_words];
			
			for (int i=0;i<no_of_words ;i++ ) {
				String abba= s.nextLine();
				int size =abba.length();
				int hash_val=0;
				if (size<12)
				{
					int pos=0;
					
					while(pos<3)
					{
						
						if (abba.charAt(pos)==('0')) // char_At
						{
							hash_val+=1*pow(37,pos);
						}
						else if (abba.charAt(pos)==('1')) 
						{
							hash_val+=2*pow(37,pos);
						}
						else if (abba.charAt(pos)==('2')) 
						{
							hash_val+=3*pow(37,pos);
						}
						else if (abba.charAt(pos)==('3')) 
						{
							hash_val+=4*pow(37,pos);
						}
						else if (abba.charAt(pos)==('4')) 
						{
							hash_val+=5*pow(37,pos);
						}
						else if (abba.charAt(pos)==('5')) 
						{
							hash_val+=6*pow(37,pos);
						}
						else if (abba.charAt(pos)==('6')) 
						{
							hash_val+=7*pow(37,pos);
						}
						else if (abba.charAt(pos)==('7')) 
						{
							hash_val+=8*pow(37,pos);
						}
						else if (abba.charAt(pos)==('8')) 
						{
							hash_val+=9*pow(37,pos);
						}
						else if (abba.charAt(pos)==('9')) 
						{
							hash_val+=10*pow(37,pos);
						}
						else if (abba.charAt(pos)==('a')) 
						{
							hash_val+=11*pow(37,pos);
						}
						else if (abba.charAt(pos)==('b')) 
						{
							hash_val+=12*pow(37,pos);
						}
						else if (abba.charAt(pos)==('c')) 
						{
							hash_val+=13*pow(37,pos);
						}
						else if (abba.charAt(pos)==('d')) 
						{
							hash_val+=14*pow(37,pos);
						}
						else if (abba.charAt(pos)==('e')) 
						{
							hash_val+=15*pow(37,pos);
						}
						else if (abba.charAt(pos)==('f')) 
						{
							hash_val+=16*pow(37,pos);
						}
						else if (abba.charAt(pos)==('g')) 
						{
							hash_val+=17*pow(37,pos);
						}
						else if (abba.charAt(pos)==('h')) 
						{
							hash_val+=18*pow(37,pos);
						}
						
						else if (abba.charAt(pos)==('i')) 
						{
							hash_val+=19*pow(37,pos);
						}
						else if (abba.charAt(pos)==('j')) 
						{
							hash_val+=20*pow(37,pos);
						}
						else if (abba.charAt(pos)==('k')) 
						{
							hash_val+=21*pow(37,pos);
						}
						else if (abba.charAt(pos)==('l')) 
						{
							hash_val+=22*pow(37,pos);
						}
						else if (abba.charAt(pos)==('m')) 
						{
							hash_val+=23*pow(37,pos);
						}
						else if (abba.charAt(pos)==('n')) 
						{
							hash_val+=24*pow(37,pos);
						}
						
						else if (abba.charAt(pos)==('o')) 
						{
							hash_val+=25*pow(37,pos);
						}
						else if (abba.charAt(pos)==('p')) 
						{
							hash_val+=26*pow(37,pos);
						}
						else if (abba.charAt(pos)==('q')) 
						{
							hash_val+=27*pow(37,pos);
						}
						else if (abba.charAt(pos)==('r')) 
						{
							hash_val+=28*pow(37,pos);
						}
						else if (abba.charAt(pos)==('s')) 
						{
							hash_val+=29*pow(37,pos);
						}
						else if (abba.charAt(pos)==('t')) 
						{
							hash_val+=30*pow(37,pos);
						}
						else if (abba.charAt(pos)==('u')) 
						{
							hash_val+=31*pow(37,pos);
						}
						else if (abba.charAt(pos)==('v')) 
						{
							hash_val+=32*pow(37,pos);
						}
						else if (abba.charAt(pos)==('w')) 
						{
							hash_val+=33*pow(37,pos);
						}
						else if (abba.charAt(pos)==('x')) 
						{
							hash_val+=34*pow(37,pos);
						}
						else if (abba.charAt(pos)==('y')) 
						{
							hash_val+=35*pow(37,pos);
						}
						else if (abba.charAt(pos)==('z')) 
						{
							hash_val+=36*pow(37,pos);
						}
						else 
						{
							hash_val+=0*pow(37,pos);
						}
						
						pos++;
						if (word_store[hash_val]==null)
						{	
						 	word_store[hash_val] = new linked_list();
						 	word_store[hash_val].add_first(abba,size); 
						}
						else
						{
							word_store[hash_val].add_last(abba,size); 
						}
					}

				}
				//word_store[hash_val].add_last(abba); 
				/*if (word_store[hash_val].isEmpty())
				{	
				 	word_store[hash_val] = new linked_list();
				 	word_store[hash_val].add_last(abba); 
				}
				else
				{
					word_store[hash_val].add_last(abba); 
				}*/
			}
			long time=System.currentTimeMillis()-startTime;
			 System.out.println("time: "+time+" millis");
			// System.out.println(vocabulary[0]);
		}
		catch (FileNotFoundException e )
		{
			System.out.println("No Such file Exists in the Directory");
		}
	}

	public static int compute_hash_val(String to_find)
	{
				String abba= to_find;
				int size =abba.length();
				int hash_val=0;
				if (size<=12)
				{
					int pos=0;
					
					while(pos<3)
					{
						if (abba.charAt(pos)==('0')) // char_At
						{
							hash_val+=1*pow(37,pos);
						}
						else if (abba.charAt(pos)==('1')) 
						{
							hash_val+=2*pow(37,pos);
						}
						else if (abba.charAt(pos)==('2')) 
						{
							hash_val+=3*pow(37,pos);
						}
						else if (abba.charAt(pos)==('3')) 
						{
							hash_val+=4*pow(37,pos);
						}
						else if (abba.charAt(pos)==('4')) 
						{
							hash_val+=5*pow(37,pos);
						}
						else if (abba.charAt(pos)==('5')) 
						{
							hash_val+=6*pow(37,pos);
						}
						else if (abba.charAt(pos)==('6')) 
						{
							hash_val+=7*pow(37,pos);
						}
						else if (abba.charAt(pos)==('7')) 
						{
							hash_val+=8*pow(37,pos);
						}
						else if (abba.charAt(pos)==('8')) 
						{
							hash_val+=9*pow(37,pos);
						}
						else if (abba.charAt(pos)==('9')) 
						{
							hash_val+=10*pow(37,pos);
						}
						else if (abba.charAt(pos)==('a')) 
						{
							hash_val+=11*pow(37,pos);
						}
						else if (abba.charAt(pos)==('b')) 
						{
							hash_val+=12*pow(37,pos);
						}
						else if (abba.charAt(pos)==('c')) 
						{
							
							hash_val+=13*pow(37,pos);
						}
						else if (abba.charAt(pos)==('d')) 
						{
							hash_val+=14*pow(37,pos);
						}
						else if (abba.charAt(pos)==('e')) 
						{
							hash_val+=15*pow(37,pos);
						}
						else if (abba.charAt(pos)==('f')) 
						{
							hash_val+=16*pow(37,pos);
						}
						else if (abba.charAt(pos)==('g')) 
						{
							hash_val+=17*pow(37,pos);
						}
						else if (abba.charAt(pos)==('h')) 
						{
							hash_val+=18*pow(37,pos);
						}
						
						else if (abba.charAt(pos)==('i')) 
						{
							hash_val+=19*pow(37,pos);
						}
						else if (abba.charAt(pos)==('j')) 
						{
							hash_val+=20*pow(37,pos);
						}
						else if (abba.charAt(pos)==('k')) 
						{
							hash_val+=21*pow(37,pos);
						}
						else if (abba.charAt(pos)==('l')) 
						{
							hash_val+=22*pow(37,pos);
						}
						else if (abba.charAt(pos)==('m')) 
						{
							hash_val+=23*pow(37,pos);
						}
						else if (abba.charAt(pos)==('n')) 
						{
							hash_val+=24*pow(37,pos);
						}
						
						else if (abba.charAt(pos)==('o')) 
						{
							hash_val+=25*pow(37,pos);
						}
						else if (abba.charAt(pos)==('p')) 
						{
							hash_val+=26*pow(37,pos);
						}
						else if (abba.charAt(pos)==('q')) 
						{
							hash_val+=27*pow(37,pos);
						}
						else if (abba.charAt(pos)==('r')) 
						{
							hash_val+=28*pow(37,pos);
						}
						else if (abba.charAt(pos)==('s')) 
						{
							hash_val+=29*pow(37,pos);
						}
						else if (abba.charAt(pos)==('t')) 
						{
							hash_val+=30*pow(37,pos);
						}
						else if (abba.charAt(pos)==('u')) 
						{
							hash_val+=31*pow(37,pos);
						}
						else if (abba.charAt(pos)==('v')) 
						{
							hash_val+=32*pow(37,pos);
						}
						else if (abba.charAt(pos)==('w')) 
						{
							hash_val+=33*pow(37,pos);
						}
						else if (abba.charAt(pos)==('x')) 
						{
							hash_val+=34*pow(37,pos);
						}
						else if (abba.charAt(pos)==('y')) 
						{
							hash_val+=35*pow(37,pos);
						}
						else if (abba.charAt(pos)==('z')) 
						{
							hash_val+=36*pow(37,pos);
						}
						else 
						{
							hash_val+=0*pow(37,pos);
						}
						pos++;
					}
				}
				else
				{
					hash_val =  -1;
				}
				return hash_val;
	}
	

	public static Vector<StringBuilder> permute_all(String rigo,linked_list[] word_store)
	{
		char[] arr_chars = rigo.toCharArray();
		Arrays.sort(arr_chars);
 		String rig = new String(arr_chars); 
		int length = rig.length();
		//StringBuilder[] string_array = new StringBuilder[factorial(length)];
		Vector<StringBuilder> string_array = new Vector<>();
		Vector<StringBuilder> rigger = new Vector<>();
		//rigger.append(rig);
		//int i=0;
		if (length==2)
		{
			
			
			StringBuilder rigi = new StringBuilder();
			//System.out.println(rig);
			rigi.append(rig);
			string_array.add(rigi);
			//System.out.println(string_array.get(0).toString());
			if(!rig.substring(1,2).equals(rig.substring(0,1)))
			{	
				StringBuilder rigi_rev = new StringBuilder();
				rigi_rev.append(rig.substring(1,2)+rig.substring(0,1));
				string_array.add(rigi_rev);
			}
			return string_array;
		}
		else 
		{
			int k=0;
			String chk = "";
			for (int j =0 ;j<length;j++)
			{
				if (!chk.equals(rig.substring(j,j+1)))
				{	rigger = add_permute(rig.substring(j,j+1), permute(rig.substring(0,j)+rig.substring(j+1,length),word_store));
					for(int l=0;l<rigger.size();l++)
					{
						//string_array[k] = new StringBuilder();
						string_array.add(rigger.get(l));
						k++;
					}
				}
				chk = rig.substring(j,j+1);
			}
			
			return string_array;
		}
	}


	public static Vector<StringBuilder> permute(String rigo,linked_list[] word_store)
	{
		char[] arr_chars = rigo.toCharArray();
		Arrays.sort(arr_chars);
 		String rig = new String(arr_chars); 
		int length = rig.length();
		//StringBuilder[] string_array = new StringBuilder[factorial(length)];
		Vector<StringBuilder> string_array = new Vector<>();
		Vector<StringBuilder> rigger = new Vector<>();
		//rigger.append(rig);
		//int i=0;
		if (length==2)
		{
			
			/*string_array[0] = new StringBuilder();
			string_array[1] = new StringBuilder();
			string_array[0].append(rig);
			string_array[1].append(rig.substring(1,2)+rig.substring(0,1));*/
			StringBuilder rigi = new StringBuilder();
			//System.out.println(rig);
			rigi.append(rig);
			string_array.add(rigi);
			//System.out.println(string_array.get(0).toString());
			if(!rig.substring(1,2).equals(rig.substring(0,1)))
			{	
				StringBuilder rigi_rev = new StringBuilder();
				rigi_rev.append(rig.substring(1,2)+rig.substring(0,1));
				string_array.add(rigi_rev);
			}
			return string_array;
		}
		else if (length<6) 
		{
			int k=0;
			String chk = "";
			for (int j =0 ;j<length;j++)
			{
				if (!chk.equals(rig.substring(j,j+1)))
				{	rigger = add_permute(rig.substring(j,j+1), permute(rig.substring(0,j)+rig.substring(j+1,length),word_store));
					for(int l=0;l<rigger.size();l++)
					{
						//string_array[k] = new StringBuilder();
						string_array.add(rigger.get(l));
						k++;
					}
				}
				chk = rig.substring(j,j+1);
			}
			
			return string_array;
		}
		else
		{
			Vector<String> vecto = new Vector<>();
			Vector<StringBuilder> vec = new Vector<>();
			for (int i =0;i<length-2;i++)
			{
				for (int j=i+1;j<length-1;j++)
				{
					for (int k =j+1 ; k<length;k++)
					{
						vec = permute(rig.substring(i,i+1)+rig.substring(j,j+1)+rig.substring(k,k+1),word_store);
						//rigger = permute_all(rig.substring(0,i)+rig.substring(i+1,j)+rig.substring(j+1,k)+rig.substring(k+1,length),word_store);
						for (int h= 0;h<vec.size();h++)
						{
							 
							if (word_store[compute_hash_val(vec.get(h).toString())]!=null)
							{
								String add_it = vec.get(h).toString();
								rigger = permute_all(rig.substring(0,i)+rig.substring(i+1,j)+rig.substring(j+1,k)+rig.substring(k+1,length),word_store);
								for (int u =0;u<rigger.size();u++)
								{
									StringBuilder on = new StringBuilder();
									on.append(rigger.get(u));
									string_array.add(on.insert(0,add_it));
								}
							}
						}
					}
				}
			}

			

			return string_array;
		}

		


		/*int length = rig.length();
		String[] string_array = new string_array[factorial(length)];
		StringBuilder rigger = new StringBuilder();
		rigger.append()*/
	}

	public static Vector<StringBuilder> check_permute(String rigo,linked_list[] word_store)
	{
		char[] arr_chars = rigo.toCharArray();
		Arrays.sort(arr_chars);
 		String rig = new String(arr_chars); 
		int length = rig.length();
		//StringBuilder[] string_array = new StringBuilder[factorial(length)];
		Vector<StringBuilder> string_array = new Vector<>();
		Vector<StringBuilder> rigger = new Vector<>();
		//rigger.append(rig);
		int i=0;
		if (length==2)
		{
			
			/*string_array[0] = new StringBuilder();
			string_array[1] = new StringBuilder();
			string_array[0].append(rig);
			string_array[1].append(rig.substring(1,2)+rig.substring(0,1));*/
			StringBuilder rigi = new StringBuilder();
			//System.out.println(rig);
			rigi.append(rig);
			string_array.add(rigi);
			//System.out.println(string_array.get(0).toString());
			if(!rig.substring(1,2).equals(rig.substring(0,1)))
			{	
				StringBuilder rigi_rev = new StringBuilder();
				rigi_rev.append(rig.substring(1,2)+rig.substring(0,1));
				string_array.add(rigi_rev);
			}
			return string_array;
		}
		else
		{
			int k=0;
			String chk = "";
			for (int j =0 ;j<length;j++)
			{
				if (!chk.equals(rig.substring(j,j+1)))
				{	rigger = add_permute(rig.substring(j,j+1), permute(rig.substring(0,j)+rig.substring(j+1,length),word_store));
					for(int l=0;l<rigger.size();l++)
					{
						//string_array[k] = new StringBuilder();
						string_array.add(rigger.get(l));
						k++;
					}
				}
				chk = rig.substring(j,j+1);
			}
			return string_array;
		}


		/*int length = rig.length();
		String[] string_array = new string_array[factorial(length)];
		StringBuilder rigger = new StringBuilder();
		rigger.append()*/
	}

	public static Vector<StringBuilder> add_permute(String a,Vector<StringBuilder> word )
	{
		
		
		Vector<StringBuilder> str_arr = new Vector<>();
		for (int i = 0;i<word.size();i++)
		{
			//str_arr[i] = new StringBuilder();
			str_arr.add((word.get(i).insert(0,a)));
		}
		return str_arr;
	}



	public static void find_anagrams(linked_list[] word_store,String inp)
	{
		int size = inp.length();
		int pos = 3;
		if (size==1||size==2)
		{
			;
		}
		else if (size==3)
		{
			Vector<StringBuilder> arr = permute(inp,word_store);
			//sorted(arr);
			String b= "";
			for (int i = 0 ;i<arr.size();i++)
			{
				String a=arr.get(i).toString();
				if ( !a.equals(b) && search(word_store,a) )
				{
					System.out.println(a);
				}
				b=a;
			}
		}
		else if (size==4)
		{
			

			Vector<StringBuilder> arr = permute(inp,word_store);
			Vector<String> brr = new Vector<>();
			for (int i = 0 ;i<arr.size();i++)
			{
				//brr.add(arr.get(i).toString());
				String a=arr.get(i).toString();
				if (search(word_store,a))
				{
					brr.add(a);
					//System.out.println(a);
				}
			}
			Collections.sort(brr);
			
			int o = brr.size();
			int lo = 0;
			while(lo<o-1)
			{
				if (brr.get(lo).equals(brr.get(lo+1)))
				{
					brr.remove(brr.get(lo));
					o--;
				}
				else
				{
					lo++;
				}
			}
			for (int i = 0 ;i<brr.size();i++)
			{
				System.out.println(brr.get(i));
			}
		}
		else if (size==5)
		{
			Vector<StringBuilder> arr = permute(inp,word_store);
			Vector<String> brr = new Vector<>();
			for (int i = 0 ;i<arr.size();i++)
			{
				//brr.add(arr.get(i).toString());
				String a=arr.get(i).toString();
				if (search(word_store,a))
				{
					brr.add(a);
					//System.out.println(a);
				}
			}
			Collections.sort(brr);
			
			int o = brr.size();
			int lo = 0;
			while(lo<o-1)
			{
				if (brr.get(lo).equals(brr.get(lo+1)))
				{
					brr.remove(brr.get(lo));
					o--;
				}
				else
				{
					lo++;
				}
			}
			for (int i = 0 ;i<brr.size();i++)
			{
				System.out.println(brr.get(i));
			}
		}

		else if (size==6)
		{
			Vector<String> brr =anagram_giver(inp,word_store);
			Collections.sort(brr);
			for (int i = 0 ;i<brr.size()-1;i++)
			{
				if (brr.get(i).equals(brr.get(i+1)))
				{
					brr.remove(brr.get(i));
				}
			}
			Vector<StringBuilder> arr = permute(inp,word_store);
			for (int i = 0 ;i<arr.size();i++)
			{
				String a=arr.get(i).toString();
				if (search(word_store,a))
				{
					brr.add(a);
				}
			}
			Collections.sort(brr);
			int o = brr.size();
			int lo = 0;
			while(lo<o-1)
			{
				if (brr.get(lo).equals(brr.get(lo+1)))
				{
					brr.remove(brr.get(lo));
					o--;
				}
				else
				{
					lo++;
				}
			}
			for (int i = 0 ;i<brr.size();i++)
			{
				
				System.out.println(brr.get(i));
				
			}

		}
		else if (size==7)
		{
			Vector<String> brr =anagram_giver(inp,word_store);
			
			Collections.sort(brr);
			for (int i = 0 ;i<brr.size()-1;i++)
			{
				if (brr.get(i).equals(brr.get(i+1)))
				{
					brr.remove(brr.get(i));
				}
			}
				
			
			Vector<StringBuilder> arr = permute(inp,word_store);
			for (int i = 0 ;i<arr.size();i++)
			{
				String a=arr.get(i).toString();
				if (search(word_store,a))
				{
					brr.add(a);
				}
			}
			Collections.sort(brr);
			int o = brr.size();
			int lo = 0;
			while(lo<o-1)
			{
				if (brr.get(lo).equals(brr.get(lo+1)))
				{
					brr.remove(brr.get(lo));
					o--;
				}
				else
				{
					lo++;
				}
			}
			for (int i = 0 ;i<brr.size();i++)
			{
				
				System.out.println(brr.get(i));
				
			}
			

		}
		else if (size==8)
		{
			Vector<String> brr =anagram_giver(inp,word_store);
		
			Collections.sort(brr);
			for (int i = 0 ;i<brr.size()-1;i++)
			{
				if (brr.get(i).equals(brr.get(i+1)))
				{
					brr.remove(brr.get(i));
				}
			}
			Vector<StringBuilder> arr = permute(inp,word_store);
			for (int i = 0 ;i<arr.size();i++)
			{
				String a=arr.get(i).toString();
				if (search(word_store,a))
				{
					brr.add(a);
				}
			}
			Collections.sort(brr);
			int o = brr.size();
			int lo = 0;
			while(lo<o-1)
			{
				if (brr.get(lo).equals(brr.get(lo+1)))
				{
					brr.remove(brr.get(lo));
					o--;
				}
				else
				{
					lo++;
				}
			}
			for (int i = 0 ;i<brr.size();i++)
			{
				
				System.out.println(brr.get(i));
				
			}
			

		}
		else if (size==9)
		{
			Vector<String> brr =anagram_giver(inp,word_store);
			
			Collections.sort(brr);
				
			
			
			give_the_valid_permutations(inp,brr,word_store);
			Collections.sort(brr);
			

			int o = brr.size();
			int lo = 0;
			while(lo<o-1)
			{
				if (brr.get(lo).equals(brr.get(lo+1)))
				{
					brr.remove(brr.get(lo));
					o--;
				}
				else
				{
					lo++;
				}
			}



			for (int i = 0 ;i<brr.size();i++)
			{
				
				System.out.println(brr.get(i));
				
			}
		}
		else if (size==10)
		{
			Vector<String> brr =anagram_giver(inp,word_store);
			
			Collections.sort(brr);
			
			give_the_valid_permutations(inp,brr,word_store);
			Collections.sort(brr);
			
			int o = brr.size();
			int lo = 0;
			while(lo<o-1)
			{
				if (brr.get(lo).equals(brr.get(lo+1)))
				{
					brr.remove(brr.get(lo));
					o--;
				}
				else
				{
					lo++;
				}
			}
			for (int i = 0 ;i<brr.size();i++)
			{
				
				System.out.println(brr.get(i));
				
			}
			

		}
		else if (size==11)
		{
			Vector<String> brr =anagram_giver(inp,word_store);
			
			Collections.sort(brr);
			
			give_the_valid_permutations(inp,brr,word_store);
			Collections.sort(brr);
			
			int o = brr.size();
			int lo = 0;
			while(lo<o-1)
			{
				if (brr.get(lo).equals(brr.get(lo+1)))
				{
					brr.remove(brr.get(lo));
					o--;
				}
				else
				{
					lo++;
				}
			}
			for (int i = 0 ;i<brr.size();i++)
			{
				
				System.out.println(brr.get(i));
				
			}
			

		}
		else if (size==12)
		{
			Vector<String> brr = anagram_giver(inp,word_store); ///new Vector<>(); //anagram_giver(inp,word_store);
			
			
			give_the_valid_permutations(inp,brr,word_store);
			Collections.sort(brr);
			int o = brr.size();
		
			int lo = 0;
			while(lo<o-1)
			{
				if (brr.get(lo).equals(brr.get(lo+1)))
				{
					brr.remove(brr.get(lo));
					o--;
				}
				else
				{
					lo++;
				}
			}
			for (int i = 0 ;i<brr.size();i++)
			{
				
				System.out.println(brr.get(i));
				
			}
			

		}
		System.out.println(-1);
	}

	public static Vector<String> give_the_valid_permutations(String inp,Vector<String> brr,linked_list[] word_store)
	{
		Vector<Character> vector_of_chars  =  Vector_of_char(inp);
			
				for (int z=0;z<pow(37,3) ; z++) 
				{
					if (word_store[z]!=null)
					{
						
						
						Vector<String> vecky =  word_store[z].find_Valid_per(inp,vector_of_chars);
						for (int gh =0 ;gh<vecky.size();gh++)
						{
							brr.add(vecky.get(gh));
						}
					}
				
				}
				return brr;
	}

	
	public static Vector<String> anagram_giver_of_8_4_4(String str,linked_list[] word_store)
	{
				Vector<String> to_return = new Vector<>();
				int size = 8;
				int h = 0;
				for (int i=h+1;i<size-2;i++)						///4-4
				{
					for (int j=i+1;j<size-1 ;j++ )
					{
						for (int k =j+1;k<size;k++)
						{
							Vector<StringBuilder> vec= permute(str.substring(h,h+1)+str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1),word_store);	
							for (int l =0;l<vec.size();l++)
							{
								if (search(word_store,vec.get(l).toString())) //word_store[compute_hash_val(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1))]!=null
								{
									Vector<StringBuilder> vec_rem = permute(str.substring(1,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),word_store);
									for (int m = 0 ; m<vec_rem.size();m++)
									{
										if (search(word_store,vec_rem.get(m).toString()))
										{
											StringBuilder s =  new StringBuilder();
											s.append(vec.get(l));
											StringBuilder p = new StringBuilder();
											p.append(vec_rem.get(m));
											to_return.add((s.append(" ").append(vec_rem.get(m))).toString());
											to_return.add((p.append(" ").append(vec.get(l))).toString());
										}
									}
								}
							}				
						}			
					}
				}
				return to_return;
	}


	public static Vector<String> anagram_giver(String str,linked_list[] word_store)
	{
		
		Vector<String> to_return = new Vector<>();
		int size = str.length();
		if (true)
		{
			if (size==6)						/// 3-3
			{	
				for (int i=0;i<size-2;i++)
				{
					for (int j=i+1;j<size-1 ;j++ )
					{
						for (int k =j+1;k<size;k++)
						{
							Vector<StringBuilder> vec= permute(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1),word_store);	
							for (int l =0;l<vec.size();l++)
							{
								if (search(word_store,vec.get(l).toString())) //word_store[compute_hash_val(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1))]!=null
								{
									Vector<StringBuilder> vec_rem = permute(str.substring(0,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),word_store);
									for (int m = 0 ; m<vec_rem.size();m++)
									{
										if (search(word_store,vec_rem.get(m).toString()))
										{
											StringBuilder s =  new StringBuilder();
											s.append(vec.get(l));
											StringBuilder p = new StringBuilder();
											p.append(vec_rem.get(m));
											to_return.add((s.append(" ").append(vec_rem.get(m))).toString());
											to_return.add((p.append(" ").append(vec.get(l))).toString());
										}
									}
								}
							}				
						}			
					}
				}
			}
			else if(size==7)
			{
				for (int i=0;i<size-2;i++)						//3-4
				{
					for (int j=i+1;j<size-1 ;j++ )
					{
						for (int k =j+1;k<size;k++)
						{
							Vector<StringBuilder> vec= permute(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1),word_store);	
							for (int l =0;l<vec.size();l++)
							{
								if (search(word_store,vec.get(l).toString())) //word_store[compute_hash_val(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1))]!=null
								{
									Vector<StringBuilder> vec_rem = permute(str.substring(0,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),word_store);
									for (int m = 0 ; m<vec_rem.size();m++)
									{
										if (search(word_store,vec_rem.get(m).toString()))
										{
											StringBuilder s =  new StringBuilder();
											s.append(vec.get(l));
											StringBuilder p = new StringBuilder();
											p.append(vec_rem.get(m));
											to_return.add((s.append(" ").append(vec_rem.get(m))).toString());
											to_return.add((p.append(" ").append(vec.get(l))).toString());
										}
									}
								}
							}				
						}			
					}
				}
			}
			else if(size==8)								
			{	
				for (int i=0;i<size-2;i++)									/// 3-5;
				{
					for (int j=i+1;j<size-1 ;j++ )
					{
						for (int k =j+1;k<size;k++)
						{
							Vector<StringBuilder> vec= permute(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1),word_store);	
							for (int l =0;l<vec.size();l++)
							{
								if (search(word_store,vec.get(l).toString())) //word_store[compute_hash_val(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1))]!=null
								{
									Vector<StringBuilder> vec_rem = permute(str.substring(0,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),word_store);
									for (int m = 0 ; m<vec_rem.size();m++)
									{
										if (search(word_store,vec_rem.get(m).toString()))
										{
											StringBuilder s =  new StringBuilder();
											s.append(vec.get(l));
											StringBuilder p = new StringBuilder();
											p.append(vec_rem.get(m));
											to_return.add((s.append(" ").append(vec_rem.get(m))).toString());
											to_return.add((p.append(" ").append(vec.get(l))).toString());
										}
									}
								}
							}				
						}			
					}
				}
				int h = 0;
				for (int i=h+1;i<size-2;i++)						///4-4
				{
					for (int j=i+1;j<size-1 ;j++ )
					{
						for (int k =j+1;k<size;k++)
						{
							Vector<StringBuilder> vec= permute(str.substring(h,h+1)+str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1),word_store);	
							for (int l =0;l<vec.size();l++)
							{
								if (search(word_store,vec.get(l).toString())) //word_store[compute_hash_val(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1))]!=null
								{
									Vector<StringBuilder> vec_rem = permute(str.substring(1,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),word_store);
									for (int m = 0 ; m<vec_rem.size();m++)
									{
										if (search(word_store,vec_rem.get(m).toString()))
										{
											StringBuilder s =  new StringBuilder();
											s.append(vec.get(l));
											StringBuilder p = new StringBuilder();
											p.append(vec_rem.get(m));
											to_return.add((s.append(" ").append(vec_rem.get(m))).toString());
											to_return.add((p.append(" ").append(vec.get(l))).toString());
										}
									}
								}
							}				
						}			
					}
				}
			}
			else if(size==9)												
			{
				for (int i=0;i<size-2;i++)						// 3-6
				{
					for (int j=i+1;j<size-1 ;j++ )
					{
						for (int k =j+1;k<size;k++)
						{
							Vector<StringBuilder> vec= permute(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1),word_store);	
							for (int l =0;l<vec.size();l++)
							{
								if (search(word_store,vec.get(l).toString())) //word_store[compute_hash_val(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1))]!=null
								{
									Vector<StringBuilder> vec_rem = permute(str.substring(0,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),word_store);
									for (int m = 0 ; m<vec_rem.size();m++)
									{
										if (search(word_store,vec_rem.get(m).toString()))
										{
											StringBuilder s =  new StringBuilder();
											s.append(vec.get(l));
											StringBuilder p = new StringBuilder();
											p.append(vec_rem.get(m));
											to_return.add((s.append(" ").append(vec_rem.get(m))).toString());
											to_return.add((p.append(" ").append(vec.get(l))).toString());
										}
									}
								}
							}				
						}			
					}
				}
				for(int h = 0;h<size-3;h++)							///4-5;
				{
					for (int i=h+1;i<size-2;i++)
					{
						for (int j=i+1;j<size-1 ;j++ )
						{
							for (int k =j+1;k<size;k++)
							{
								Vector<StringBuilder> vec= permute(str.substring(h,h+1)+str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1),word_store);	
								for (int l =0;l<vec.size();l++)
								{
									if (search(word_store,vec.get(l).toString())) //word_store[compute_hash_val(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1))]!=null
									{
										Vector<StringBuilder> vec_rem = permute(str.substring(0,h)+ str.substring(h+1,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),word_store);
										for (int m = 0 ; m<vec_rem.size();m++)
										{
											if (search(word_store,vec_rem.get(m).toString()))
											{
												StringBuilder s =  new StringBuilder();
												s.append(vec.get(l));
												StringBuilder p = new StringBuilder();
												p.append(vec_rem.get(m));
												to_return.add((s.append(" ").append(vec_rem.get(m))).toString());
												to_return.add((p.append(" ").append(vec.get(l))).toString());
											}
										}
									}
								}				
							}			
						}
					}
				}
				for (int i=0;i<size-2;i++)						///3-3-3
				{
					for (int j=i+1;j<size-1 ;j++ )
					{
						for (int k =j+1;k<size;k++)
						{
							Vector<StringBuilder> vec= permute(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1),word_store);	
							for (int l =0;l<vec.size();l++)
							{
								if (search(word_store,vec.get(l).toString())) //word_store[compute_hash_val(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1))]!=null
								{
									Vector<String> vec_rem = anagram_giver(str.substring(0,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),word_store);
									for (int m = 0 ; m<vec_rem.size();m++)
									{
										
											
											//s.append(vec.get(l));
											String spl = vec.get(l).toString();
											String p = vec_rem.get(m);
											
											
											to_return.add(spl+" "+p);
											to_return.add(p+" "+spl);
											to_return.add(p.substring(4,7)+" "+spl+" "+p.substring(0,3));
											to_return.add(p.substring(0,4)+spl+" "+p.substring(4,7));
											to_return.add(spl+" "+p.substring(4,7)+" "+p.substring(0,3));
											to_return.add(p.substring(4,7)+" "+p.substring(0,4)+spl);
										
									}
								}
							}				
						}			
					}
				}


			}
			else if(size==10)
			{
				for (int i=0;i<size-2;i++)         // 3-7
				{
					for (int j=i+1;j<size-1 ;j++ )
					{
						for (int k =j+1;k<size;k++)
						{
							Vector<StringBuilder> vec= permute(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1),word_store);	
							for (int l =0;l<vec.size();l++)
							{
								if (search(word_store,vec.get(l).toString())) //word_store[compute_hash_val(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1))]!=null
								{
									Vector<StringBuilder> vec_rem = permute(str.substring(0,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),word_store);
									for (int m = 0 ; m<vec_rem.size();m++)
									{
										if (search(word_store,vec_rem.get(m).toString()))
										{
											StringBuilder s =  new StringBuilder();
											s.append(vec.get(l));
											StringBuilder p = new StringBuilder();
											p.append(vec_rem.get(m));
											to_return.add((s.append(" ").append(vec_rem.get(m))).toString());
											to_return.add((p.append(" ").append(vec.get(l))).toString());
										}
									}
								}
							}				
						}			
					}
				}
				for(int h = 0;h<size-3;h++)				//4-6
				{
					for (int i=h+1;i<size-2;i++)
					{
						for (int j=i+1;j<size-1 ;j++ )
						{
							for (int k =j+1;k<size;k++)
							{
								Vector<StringBuilder> vec= permute(str.substring(h,h+1)+str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1),word_store);	
								for (int l =0;l<vec.size();l++)
								{
									if (search(word_store,vec.get(l).toString())) //word_store[compute_hash_val(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1))]!=null
									{
										Vector<StringBuilder> vec_rem = permute(str.substring(0,h)+ str.substring(h+1,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),word_store);
										for (int m = 0 ; m<vec_rem.size();m++)
										{
											if (search(word_store,vec_rem.get(m).toString()))
											{
												StringBuilder s =  new StringBuilder();
												s.append(vec.get(l));
												StringBuilder p = new StringBuilder();
												p.append(vec_rem.get(m));
												to_return.add((s.append(" ").append(vec_rem.get(m))).toString());
												to_return.add((p.append(" ").append(vec.get(l))).toString());
											}
										}
									}
								}				
							}			
						}
					}
				}
				int e=0;								//// 5-5
				for(int h = e+1;h<size-3;h++)
				{
					for (int i=h+1;i<size-2;i++)
					{
						for (int j=i+1;j<size-1 ;j++ )
						{
							for (int k =j+1;k<size;k++)
							{
								Vector<StringBuilder> vec= permute(str.substring(e,e+1)+str.substring(h,h+1)+str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1),word_store);	
								for (int l =0;l<vec.size();l++)
								{
									if (search(word_store,vec.get(l).toString())) //word_store[compute_hash_val(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1))]!=null
									{
										Vector<StringBuilder> vec_rem = permute(str.substring(1,h)+ str.substring(h+1,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),word_store);
										for (int m = 0 ; m<vec_rem.size();m++)
										{
											if (search(word_store,vec_rem.get(m).toString()))
											{
												StringBuilder s =  new StringBuilder();
												s.append(vec.get(l));
												StringBuilder p = new StringBuilder();
												p.append(vec_rem.get(m));
												to_return.add((s.append(" ").append(vec_rem.get(m))).toString());
												to_return.add((p.append(" ").append(vec.get(l))).toString());
											}
										}
									}
								}				
							}			
						}
					}
				}
				for (int i=0;i<size-2;i++)			// 3 Spaces
				{
					for (int j=i+1;j<size-1 ;j++ )
					{
						for (int k =j+1;k<size;k++)
						{
							Vector<StringBuilder> vec= permute(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1),word_store);	
							for (int l =0;l<vec.size();l++)
							{
								if (search(word_store,vec.get(l).toString())) //word_store[compute_hash_val(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1))]!=null
								{
									Vector<String> vec_rem = anagram_giver(str.substring(0,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),word_store);
									for (int m = 0 ; m<vec_rem.size();m++)
									{
										
											
											//s.append(vec.get(l));
											String spl = vec.get(l).toString();
											String p = vec_rem.get(m);
											

											if (p.charAt(3)==' ')   // 3 3 4
											{
												to_return.add(spl+" "+p);
												to_return.add(p+" "+spl);
												to_return.add(p.substring(4,8)+" "+spl+" "+p.substring(0,3));
												to_return.add(p.substring(0,3)+" "+spl+" "+p.substring(4,8));
												to_return.add(spl+" "+p.substring(4,8)+" "+p.substring(0,3));
												to_return.add(p.substring(4,8)+" "+p.substring(0,4)+spl);
											}
											
									}
								}
							}				
						}			
					}
				}
			}
			else if(size==11)
			{
				for (int i=0;i<size-2;i++)      //// for 3 -8
				{
					for (int j=i+1;j<size-1 ;j++ )
					{
						for (int k =j+1;k<size;k++)
						{
							Vector<StringBuilder> vec= permute(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1),word_store);	
							for (int l =0;l<vec.size();l++)
							{
								if (search(word_store,vec.get(l).toString())) //word_store[compute_hash_val(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1))]!=null
								{
									//Vector<StringBuilder> vec_rem = permute(str.substring(0,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),word_store);
									Vector<String> vec_rem = new Vector<>();
									vec_rem = give_the_valid_permutations(str.substring(0,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),vec_rem,word_store);
									for (int m = 0 ; m<vec_rem.size();m++)
									{
										
											StringBuilder s =  new StringBuilder();
											s.append(vec.get(l));
											StringBuilder p = new StringBuilder();
											p.append(vec_rem.get(m));
											to_return.add((s.append(" ").append(vec_rem.get(m))).toString());
											to_return.add((p.append(" ").append(vec.get(l))).toString());
									}
								}
							}				
						}			
					}
				}
				for(int h = 0;h<size-3;h++)			//// 4-7
				{
					for (int i=h+1;i<size-2;i++)
					{
						for (int j=i+1;j<size-1 ;j++ )
						{
							for (int k =j+1;k<size;k++)
							{
								Vector<StringBuilder> vec= permute(str.substring(h,h+1)+str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1),word_store);	
								for (int l =0;l<vec.size();l++)
								{
									if (search(word_store,vec.get(l).toString())) //word_store[compute_hash_val(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1))]!=null
									{
										Vector<StringBuilder> vec_rem = permute(str.substring(0,h)+ str.substring(h+1,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),word_store);
										for (int m = 0 ; m<vec_rem.size();m++)
										{
											if (search(word_store,vec_rem.get(m).toString()))
											{
												StringBuilder s =  new StringBuilder();
												s.append(vec.get(l));
												StringBuilder p = new StringBuilder();
												p.append(vec_rem.get(m));
												to_return.add((s.append(" ").append(vec_rem.get(m))).toString());
												to_return.add((p.append(" ").append(vec.get(l))).toString());
											}
										}
									}
								}				
							}			
						}
					}
				}
				for(int e=0;e<size-4;e++)
				{								// 5-6
					for(int h = e+1;h<size-3;h++)
					{
						for (int i=h+1;i<size-2;i++)
						{
							for (int j=i+1;j<size-1 ;j++ )
							{
								for (int k =j+1;k<size;k++)
								{
									Vector<StringBuilder> vec= permute(str.substring(e,e+1)+str.substring(h,h+1)+str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1),word_store);	
									for (int l =0;l<vec.size();l++)
									{
										if (search(word_store,vec.get(l).toString())) //word_store[compute_hash_val(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1))]!=null
										{
											Vector<StringBuilder> vec_rem = permute( str.substring(0,e)+str.substring(e+1,h)+ str.substring(h+1,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),word_store);
											for (int m = 0 ; m<vec_rem.size();m++)
											{
												if (search(word_store,vec_rem.get(m).toString()))
												{
													StringBuilder s =  new StringBuilder();
													s.append(vec.get(l));
													StringBuilder p = new StringBuilder();
													p.append(vec_rem.get(m));
													to_return.add((s.append(" ").append(vec_rem.get(m))).toString());
													to_return.add((p.append(" ").append(vec.get(l))).toString());
												}
											}
										}
									}				
								}			
							}
						}
					}
				}
				for (int i=0;i<size-2;i++)						// 3 and //// 3-5 and 4-4
				{
					for (int j=i+1;j<size-1 ;j++ )
					{
						for (int k =j+1;k<size;k++)
						{
							Vector<StringBuilder> vec= permute(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1),word_store);	
							for (int l =0;l<vec.size();l++)
							{
								if (search(word_store,vec.get(l).toString())) //word_store[compute_hash_val(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1))]!=null
								{
									Vector<String> vec_rem = anagram_giver(str.substring(0,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),word_store);
									for (int m = 0 ; m<vec_rem.size();m++)
									{
										
											
											//s.append(vec.get(l));
											String spl = vec.get(l).toString();
											String p = vec_rem.get(m);
											

											if (p.charAt(3)==' ')
											{
												to_return.add(spl+" "+p);
												to_return.add(p+" "+spl);
												to_return.add(p.substring(4,9)+" "+spl+" "+p.substring(0,3));
												to_return.add(p.substring(0,3)+" "+spl+" "+p.substring(4,9));
												to_return.add(spl+" "+p.substring(4,9)+" "+p.substring(0,3));
												to_return.add(p.substring(4,9)+" "+p.substring(0,4)+spl);
											}

											else if (p.charAt(4)==' ')
											{
												to_return.add(spl+" "+p);
												to_return.add(p+" "+spl);
												to_return.add(p.substring(5,9)+" "+spl+" "+p.substring(0,4));
												to_return.add(p.substring(0,4)+" "+spl+" "+p.substring(5,9));
												to_return.add(spl+" "+p.substring(5,9)+" "+p.substring(0,4));
												to_return.add(p.substring(5,9)+" "+p.substring(0,5)+spl);
											}
											
									}
								}
							}				
						}			
					}
				}
			}
			else if(size==12)
			{
				//long startTime=System.currentTimeMillis();
				//long time=System.currentTimeMillis()-startTime;
				for (int i=0;i<size-2;i++)      //// for 3 -9
				{
					for (int j=i+1;j<size-1 ;j++ )
					{
						for (int k =j+1;k<size;k++)
						{
							Vector<StringBuilder> vec= permute(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1),word_store);	
							for (int l =0;l<vec.size();l++)
							{
								if (search(word_store,vec.get(l).toString())) //word_store[compute_hash_val(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1))]!=null
								{
									//Vector<StringBuilder> vec_rem = permute(str.substring(0,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),word_store);

									Vector<String> vec_rem = new Vector<>();
 									vec_rem = give_the_valid_permutations(str.substring(0,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),vec_rem,word_store);
									for (int m = 0 ; m<vec_rem.size();m++)
									{
										
									
											
											StringBuilder s =  new StringBuilder();
											s.append(vec.get(l));
											StringBuilder p = new StringBuilder();
											p.append(vec_rem.get(m));
											to_return.add((s.append(" ").append(vec_rem.get(m))).toString());
											to_return.add((p.append(" ").append(vec.get(l))).toString());
									}
								}
							}				
						}			
					}
				}
				

				for(int h = 0;h<size-3;h++)			//// 4-8
				{
					for (int i=h+1;i<size-2;i++)
					{
						for (int j=i+1;j<size-1 ;j++ )
						{
							for (int k =j+1;k<size;k++)
							{
								Vector<StringBuilder> vec= permute(str.substring(h,h+1)+str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1),word_store);	
								for (int l =0;l<vec.size();l++)
								{
									if (search(word_store,vec.get(l).toString())) //word_store[compute_hash_val(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1))]!=null
									{
										//Vector<StringBuilder> vec_rem = permute(str.substring(0,h)+ str.substring(h+1,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),word_store);
										Vector<String> vec_rem = new Vector<>();
										vec_rem = give_the_valid_permutations(str.substring(0,h)+ str.substring(h+1,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),vec_rem,word_store);
										for (int m = 0 ; m<vec_rem.size();m++)
										{
											
												StringBuilder s =  new StringBuilder();
												s.append(vec.get(l));
												StringBuilder p = new StringBuilder();
												p.append(vec_rem.get(m));
												to_return.add((s.append(" ").append(vec_rem.get(m))).toString());
												to_return.add((p.append(" ").append(vec.get(l))).toString());
										}
									}
								}				
							}			
						}
					}
				}
				
				for(int e=0;e<size-4;e++)
				{																	// 5-7
					for(int h = e+1;h<size-3;h++)
					{
						for (int i=h+1;i<size-2;i++)
						{
							for (int j=i+1;j<size-1 ;j++ )
							{
								for (int k =j+1;k<size;k++)
								{
									Vector<StringBuilder> vec= permute(str.substring(e,e+1)+str.substring(h,h+1)+str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1),word_store);	
									for (int l =0;l<vec.size();l++)
									{
										if (search(word_store,vec.get(l).toString())) //word_store[compute_hash_val(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1))]!=null
										{
											Vector<StringBuilder> vec_rem = permute( str.substring(0,e)+str.substring(e+1,h)+ str.substring(h+1,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),word_store);
											//Vector<String> vec_rem = new Vector<>();
											//vec_rem = give_the_valid_permutations( str.substring(0,e)+str.substring(e+1,h)+ str.substring(h+1,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),vec_rem,word_store);
											for (int m = 0 ; m<vec_rem.size();m++)
											{
												if (search(word_store,vec_rem.get(m).toString()))
												{
													StringBuilder s =  new StringBuilder();
													s.append(vec.get(l));
													StringBuilder p = new StringBuilder();
													p.append(vec_rem.get(m));
													to_return.add((s.append(" ").append(vec_rem.get(m))).toString());
													to_return.add((p.append(" ").append(vec.get(l))).toString());
												}
																							}
										}
									}				
								}			
							}
						}
					}
				}
				
				int d=0;
				for(int e=d+1;e<size-4;e++)
				{								//// 6-6
					for(int h = e+1;h<size-3;h++)
					{
						for (int i=h+1;i<size-2;i++)
						{
							for (int j=i+1;j<size-1 ;j++ )
							{
								for (int k =j+1;k<size;k++)
								{
									Vector<StringBuilder> vec= permute(str.substring(d,d+1)+str.substring(e,e+1)+str.substring(h,h+1)+str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1),word_store);	
									for (int l =0;l<vec.size();l++)
									{
										if (search(word_store,vec.get(l).toString())) //word_store[compute_hash_val(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1))]!=null
										{
											Vector<StringBuilder> vec_rem = permute(str.substring(1,e)+ str.substring(e+1,h)+ str.substring(h+1,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),word_store);
											for (int m = 0 ; m<vec_rem.size();m++)
											{
												if (search(word_store,vec_rem.get(m).toString()))
												{
													StringBuilder s =  new StringBuilder();
													s.append(vec.get(l));
													StringBuilder p = new StringBuilder();
													p.append(vec_rem.get(m));
													to_return.add((s.append(" ").append(vec_rem.get(m))).toString());
													to_return.add((p.append(" ").append(vec.get(l))).toString());
												}
											}
										}
									}				
								}			
							}
						}
					}
				}
				
				for (int i=0;i<size-2;i++)      /// 3 3 6   3 4 5
				{
					for (int j=i+1;j<size-1 ;j++ )
					{
						for (int k =j+1;k<size;k++)
						{
							Vector<StringBuilder> vec= permute(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1),word_store);	
							for (int l =0;l<vec.size();l++)
							{
								if (search(word_store,vec.get(l).toString())) //word_store[compute_hash_val(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1))]!=null
								{
									Vector<String> vec_rem = anagram_giver(str.substring(0,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),word_store);
									for (int m = 0 ; m<vec_rem.size();m++)
									{
										
											
											//s.append(vec.get(l));
											String spl = vec.get(l).toString();
											String p = vec_rem.get(m);
											

											if (p.charAt(3)==' ' && p.length()==10)
											{
												to_return.add(spl+" "+p);
												to_return.add(p+" "+spl);
												to_return.add(p.substring(4,10)+" "+spl+" "+p.substring(0,3));
												to_return.add(p.substring(0,3)+" "+spl+" "+p.substring(4,10));
												to_return.add(spl+" "+p.substring(4,10)+" "+p.substring(0,3));
												to_return.add(p.substring(4,10)+" "+p.substring(0,4)+spl);
											}
											else if (p.charAt(4)==' ')
											{
												to_return.add(spl+" "+p);
												to_return.add(p+" "+spl);
												to_return.add(p.substring(5,10)+" "+spl+" "+p.substring(0,4));
												to_return.add(p.substring(0,4)+" "+spl+" "+p.substring(5,10));
												to_return.add(spl+" "+p.substring(5,10)+" "+p.substring(0,4));
												to_return.add(p.substring(5,10)+" "+p.substring(0,5)+spl);
											}
											
									}
								}
							}				
						}			
					}
				}
				
				for (int h = 0 ;h<size-3;h++)		 /// 4 -4-4
				{
					for (int i=h+1;i<size-2;i++)      
					{
						for (int j=i+1;j<size-1 ;j++ )
						{
							for (int k =j+1;k<size;k++)
							{
								Vector<StringBuilder> vec= permute(str.substring(h,h+1)+str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1),word_store);	
								for (int l =0;l<vec.size();l++)
								{
									if (search(word_store,vec.get(l).toString())) //word_store[compute_hash_val(str.substring(i,i+1)+str.substring(j,j+1)+str.substring(k,k+1))]!=null
									{
										Vector<String> vec_rem = anagram_giver_of_8_4_4(str.substring(0,h)+str.substring(h+1,i)+str.substring(i+1,j)+str.substring(j+1,k)+str.substring(k+1,size),word_store);
										for (int m = 0 ; m<vec_rem.size();m++)
										{
											
												
												//s.append(vec.get(l));
												String spl = vec.get(l).toString();
												String p = vec_rem.get(m);
												

												
												if (p.charAt(4)==' ')
												{
													to_return.add(spl+" "+p);
													to_return.add(p+" "+spl);
													to_return.add(p.substring(5,9)+" "+spl+" "+p.substring(0,4));
													to_return.add(p.substring(0,4)+" "+spl+" "+p.substring(5,9));
													to_return.add(spl+" "+p.substring(5,9)+" "+p.substring(0,4));
													to_return.add(p.substring(5,9)+" "+p.substring(0,5)+spl);
												}
												
										}
									}
								}				
							}			
						}
					}
				}
				
			}
			return to_return;
		}
		else
		{
			return to_return;
		}	
	}
	
	public static Vector<Character> Vector_of_char(String inp)
	{
		char[] chars = inp.toCharArray();
		Arrays.sort(chars);
		//set(chars);

		Vector<Character> vecto = new Vector<>();
		vecto.add(chars[0]);
		for(int j=1;j<chars.length;j++)
		{
			if (chars[j]!=chars[j-1])
			{
				vecto.add(chars[j]);
			}
		}
		return vecto;
	}
	public static int str_contains_char(String s,char a)
	{
		int count = 0;
		for (int i=0;i<s.length();i++)
		{
			if (s.charAt(i)==a)
			{
				count++;
			}
		}
		return count;
	}
	
	public static int factorial(int a)
	{
		int to_ret = 1;
		while (a>0)
		{
			to_ret = a*to_ret;
			a--;
		}
		return to_ret;
	}
	public static int pow(int a,int power)
	{	

		int to_ret = 1;
		int of = a;
		while (power>0)
		{
			to_ret = of*to_ret;
			power--;
		}
		return to_ret;
	}


}