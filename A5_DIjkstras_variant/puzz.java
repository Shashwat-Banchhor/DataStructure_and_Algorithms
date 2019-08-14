import java.util.*;
import java.io.*;

public class puzz
{
	class nod
		{
			String s = "";
			int mov = 0;
			int price = -1;
			nod prev = null;
			int u =1;
			int d =1;
			int l =1;
			int r =1;
			String prev_reached_by = "";
			int  moved = -1;
			public nod(String ver , int move, int pric,nod pre)
			{
				s = ver;
				mov = move; 
				price = pric;
				prev = pre;
			}
		}
	class heap
	{
		


		nod[] Heap = new nod[362883];
		int N = 0;
		public nod delete()
		{
			nod to_ret = Heap[1];
			Heap[1] = Heap[N];
			Heap[N]=null;
			int k =1;

			
			boolean done=false;
			while(!done)
			{
				nod to_rep_with = null;
				if (Heap[2*k]==null)
				{
					done=true;
				}
				else if (Heap[2*k+1]==null)
				{
					if (Heap[k].price>=Heap[2*k].price)
					{
						if (Heap[k].price == Heap[2*k].price)
						{
							if (Heap[k].mov>Heap[2*k].mov)
							{
							
									nod tmp = Heap[2*k];
									Heap[2*k]=Heap[k];
									Heap[k]= tmp;
									k=2*k;
							
							}
							else
							{
								done=true;
							}
						}
						else
						{
								
									nod tmp = Heap[2*k];
									Heap[2*k]=Heap[k];
									Heap[k]= tmp;
									k=2*k;
							
						}
					}
					else
					{
						done=true;
					}
				}
				else
				{
					if( Heap[2*k].price <= Heap[2*k+1].price )
					{
						if (Heap[2*k].price == Heap[2*k+1].price)
						{
							if (Heap[2*k].mov>=Heap[2*k+1].mov)
							{
								to_rep_with = Heap[2*k+1];
							}
							else
							{
								to_rep_with = Heap[2*k];
							}
						}
						else //if(Heap[2*k].price <Heap[2*k+1].price)
						{
							to_rep_with = Heap[2*k];
						}
					}
					else
					{
						to_rep_with = Heap[2*k+1];
					}

				
					if (Heap[k].price>=to_rep_with.price)
					{
						if (Heap[k].price == to_rep_with.price)
						{
							if (Heap[k].mov>to_rep_with.mov)
							{
								if (to_rep_with.s.equals(Heap[2*k+1].s))
								{
									nod tmp = Heap[2*k+1];
									Heap[2*k+1]=Heap[k];
									Heap[k]= tmp;
									k=2*k+1;
								}
								else
								{
									nod tmp = Heap[2*k];
									Heap[2*k]=Heap[k];
									Heap[k]= tmp;
									k=2*k;
								}
							}
							else
							{
								done = true;
							}
						}
						else
						{
								if (to_rep_with.s.equals(Heap[2*k+1].s))
								{
									nod tmp = Heap[2*k+1];
									Heap[2*k+1]=Heap[k];
									Heap[k]= tmp;
									k=2*k+1;
								}
								else
								{
									nod tmp = Heap[2*k];
									Heap[2*k]=Heap[k];
									Heap[k]= tmp;
									k=2*k;
								}
						}
					}
					else
					{
						done = true;
					}
				}
			}
			
			N--;
			return to_ret;
		}
		public void insert(nod key)
		{
			int k = N+1;
			Heap[k]=key;
			if (N==0)
			{
				N++;
			}
			else
			{
				N++;
				while(!(k/2==0||Heap[k/2].price<=Heap[k].price))
				{
					if (Heap[k/2].price == Heap[k].price)
					{
						if (Heap[k/2].mov > Heap[k].mov)
						{
							nod tmp = Heap[k/2];
							Heap[k/2] = Heap[k];
							Heap[k] = tmp;
							k=k/2;
						}
					}
					else
					{
							nod tmp = Heap[k/2];
							Heap[k/2] = Heap[k];
							Heap[k] = tmp;
							k=k/2;
					}
				}
			}


		}

	
	}
	class Vertice
	{
		
		String vertice = null ; 
		Vertice prev = null;
		int distance = 1001;
		boolean in_cloud=false;
		String[] edges  = new String[4];
		int[] edge_cost  = new int[4]; 
		public Vertice(String v)
		{
			vertice = v;

		}
		public void set_distance(int d)
		{
			distance = d;
		}
		public boolean equals(Vertice v)
		{
			return  (this.vertice).equals(v.vertice) ; 
		}
		public void set_egde_cost(int[] costs)
		{
			edge_cost  = costs;
		}
		public void set_edges(String[] edg)
		{
			edges = edg;
		}
	}
	class Edges
	{
		Vertice up_edge = null;
		Vertice down_edge = null;
		Vertice left_edge = null;
		Vertice right_edge = null;

		int up_edge_cost = 0;
		int down_edge_cost = 0;
		int left_edge_cost = 0;
		int right_edge_cost = 0;
		public Edges(Vertice up_eg,int up_cost,Vertice down_eg,int down_cost,Vertice left_eg,int left_cost,Vertice right_eg, int right_cost )
		{
			 up_edge = up_eg;
			 down_edge = down_eg;
			 left_edge = left_eg;
			 right_edge = right_eg;

			 up_edge_cost =up_cost;
			 down_edge_cost =down_cost;
			 left_edge_cost =left_cost;
			 right_edge_cost =right_cost;
		}
		public Vertice up_edge()
		{
			return up_edge;
		}
		public Vertice down_edge()
		{
			return down_edge;
		}
		public Vertice left_edge()
		{
			return left_edge;
		}
		public Vertice right_edge()
		{
			return right_edge;
		}

		public int up_edge_cost()
		{
			return up_edge_cost;
		}
		public int down_edge_cost()
		{
			return down_edge_cost;
		}
		public int left_edge_cost()
		{
			return left_edge_cost;
		}
		public int right_edge_cost()
		{
			return right_edge_cost;
		}
	}
	public HashMap<String,Vertice> start_graph(puzz new_puz,Vector<String> graph_ver)
	{
		HashMap<String,Vertice> hm  = new HashMap<>();
		HashMap<String,Integer> sm = new HashMap<>();
		int[] cost = new int[9];
		for(int i=1;i<9;i++)
		{
			cost[i] = 1 ;
		}
		Vertice inpu = new Vertice("12346875G");
		for (int k=0;k<graph_ver.size();k++)
		{
			put_in_graph(hm,graph_ver.get(k),cost); 
		}
		return hm;
	}
	
	public static Vector<StringBuilder> permute_all(String rig)
	{
		
		int length = rig.length();
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
				{	rigger = add_permute(rig.substring(j,j+1), permute_all(rig.substring(0,j)+rig.substring(j+1,length)));
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
	public static Vector<String> permute_all_s(String rig)
	{
		
		int length = rig.length();
		Vector<String> string_array = new Vector<>();
		Vector<String> rigger = new Vector<>();
		if (length==2)
		{
			
			
			
			string_array.add(rig);
	
			string_array.add(rig.substring(1,2)+rig.substring(0,1));
			
			return string_array;
		}
		if (length==3)
		{
			
			
			
			string_array.add(rig);
	
			string_array.add(rig.substring(1,2)+rig.substring(0,1)+rig.substring(2,3));
			string_array.add(rig.substring(2,3)+rig.substring(0,1)+rig.substring(1,2));
			string_array.add(rig.substring(0,1)+rig.substring(2,3)+rig.substring(1,2));
			string_array.add(rig.substring(2,3)+rig.substring(1,2)+rig.substring(0,1));
			string_array.add(rig.substring(1,2)+rig.substring(2,3)+rig.substring(0,1));
			return string_array;
		}
		else 
		{
			int k=0;
			String chk = "";
			for (int j =0 ;j<length;j++)
			{
					rigger = add_permute_s(rig.substring(j,j+1), permute_all_s(rig.substring(0,j)+rig.substring(j+1,length)));
					for(int l=0;l<rigger.size();l++)
					{
						//string_array[k] = new StringBuilder();
						string_array.add(rigger.get(l));
						k++;
					}
		
			}
			
			return string_array;
		}
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

	public static Vector<String> add_permute_s(String a,Vector<String> word )
	{
		
		
		Vector<String> str_arr = new Vector<>();
		for (int i = 0;i<word.size();i++)
		{
			//str_arr[i] = new StringBuilder();
			str_arr.add(a+word.get(i));
		}
		return str_arr;
	}

	public static void main(String args[])
	{
		try
		{
			long startTime=System.currentTimeMillis();
			FileInputStream voc = new FileInputStream(args[0]);
			//FileOutputStream stream = new FileOutputStream(args[1],true);
			PrintWriter ostream = new PrintWriter(args[1]);
			Scanner s = new Scanner(voc);
			int no_of_words = Integer.parseInt(s.nextLine());
			Vector<String> graph_ver = permute_all_s("12345678G");
			puzz new_puz = new puzz();
			HashMap<String,Vertice> hm = new_puz.start_graph(new_puz,graph_ver);
			while(no_of_words>0)
			{
				String[] src_des=s.nextLine().split(" ");
				String[] cost = s.nextLine().split(" ");
				//Vector<String> graph_ver = permute_all_s("12345678G");
				//puzz new_puz = new puzz();
				//HashMap<String,Vertice> hm = new_puz.start_graph(new_puz,graph_ver);
				int[] costs = new  int[9];
				for(int j=1;j<9;j++)
				{
					costs[j]= Integer.parseInt(cost[j-1]);
				}
				new_puz.dijkstra(hm,src_des[0],src_des[1],costs,ostream);
				no_of_words--;
			}
			ostream.close();
			long endTime=System.currentTimeMillis();

			System.out.println(endTime-startTime+" ms");
		}

		catch (FileNotFoundException e )
		{
			System.out.println("No Such file Exists in the Directory");
		}

	}
	public  HashMap<String,Vertice> put_in_graph(HashMap<String,Vertice> hm,String inp,int[] costs )
	{
		//String inp = inpu.vertice;
		Vertice ver = new Vertice(inp);
		/*if (sm.containsKey(inpu.vertice))
		{
			
			return hm;
		}*/
		
			
			int index = inp.indexOf('G');
			if (index==0)
			{
				Vertice down =  new Vertice(inp.substring(3,4) + inp.substring(1,3)+"G"+inp.substring(4,9));
				Vertice right = new Vertice(inp.substring(1,2)+"G"+inp.substring(2,9));
				Edges edg  = new Edges(null,0,down,1,null,0,right,1);
				
				//String[] eges = new String[4];
				ver.edges[1] = inp.substring(3,4) + inp.substring(1,3)+"G"+inp.substring(4,9);
				ver.edges[3] = inp.substring(1,2)+"G"+inp.substring(2,9);
				//ver.edges = eges;
				ver.edge_cost[1] = Integer.parseInt(inp.substring(3,4));
				ver.edge_cost[3] = Integer.parseInt(inp.substring(1,2));
				hm.put(inp,ver);
				//sm.put(inpu.vertice,0);
				/*make_graph(hm,sm,edg.down_edge());
				make_graph(hm,sm,edg.right_edge());
				if (!sm.containsKey(right.vertice))
				{
					make_graph(hm,sm,edg.right_edge());

				}
			
				if(!sm.containsKey(down.vertice))
				{
					make_graph(hm,sm,edg.down_edge());
				}*/

			}
			else if (index==1)
			{
				Vertice down = new   Vertice(inp.substring(0,1)+inp.substring(4,5)+inp.substring(2,4)+"G"+inp.substring(5,9));
				Vertice left  =  new Vertice("G"+inp.substring(0,1)+inp.substring(2,9));
				Vertice right = new Vertice(inp.substring(0,1)+inp.substring(2,3)+"G"+inp.substring(3,9));
				Edges edg  = new Edges(null,0,down,1,left,1,right,1);
				
				
				ver.edges[1] = inp.substring(0,1)+inp.substring(4,5)+inp.substring(2,4)+"G"+inp.substring(5,9);
				ver.edges[2] = "G"+inp.substring(0,1)+inp.substring(2,9);
				ver.edges[3] = inp.substring(0,1)+inp.substring(2,3)+"G"+inp.substring(3,9);
				
				ver.edge_cost[1] = Integer.parseInt(inp.substring(4,5));
				ver.edge_cost[2] = Integer.parseInt(inp.substring(0,1));
				ver.edge_cost[3] = Integer.parseInt(inp.substring(2,3));
				hm.put(inp,ver);

			}
			else if(index==2)
			{
				Vertice down = new Vertice(inp.substring(0,2)+inp.substring(5,6)+inp.substring(3,5)+"G"+inp.substring(6,9));
				Vertice left = new Vertice(inp.substring(0,1)+"G"+inp.substring(1,2)+inp.substring(3,9));
				Edges edg  = new Edges(null,0,down,1,left,1,null,0);
				

				ver.edges[1] = inp.substring(0,2)+inp.substring(5,6)+inp.substring(3,5)+"G"+inp.substring(6,9);
				ver.edges[2] = inp.substring(0,1)+"G"+inp.substring(1,2)+inp.substring(3,9);
				
				
				ver.edge_cost[1] = Integer.parseInt(inp.substring(5,6));
				ver.edge_cost[2] = Integer.parseInt(inp.substring(1,2));

				hm.put(inp,ver);

			}
			else if( index==3)
			{
				Vertice up = new Vertice("G"+inp.substring(1,3)+inp.substring(0,1)+inp.substring(4,9));
				Vertice right = new Vertice(inp.substring(0,3)+inp.substring(4,5)+"G"+inp.substring(5,9));
				Vertice down = new Vertice(inp.substring(0,3)+inp.substring(6,7)+inp.substring(4,6)+"G"+inp.substring(7,9));
				Edges edg  = new Edges(up,1,down,1,null,0,right,1);
				
				ver.edges[0] = "G"+inp.substring(1,3)+inp.substring(0,1)+inp.substring(4,9);
				ver.edges[1] =	inp.substring(0,3)+inp.substring(6,7)+inp.substring(4,6)+"G"+inp.substring(7,9);
				ver.edges[3] = inp.substring(0,3)+inp.substring(4,5)+"G"+inp.substring(5,9);
				
				
				ver.edge_cost[0] = Integer.parseInt(inp.substring(0,1));
				ver.edge_cost[1] = Integer.parseInt(inp.substring(6,7));
				ver.edge_cost[3] = Integer.parseInt(inp.substring(4,5));

				hm.put(inp,ver);
			}
			else if(index==4)
			{
				/*Vertice up = new Vertice(inp.substring(0,1)+"G"+inp.substring(2,4)+inp.substring(1,2)+inp.substring(5,9));
				Vertice down = new Vertice(inp.substring(0,4)+inp.substring(7,8)+inp.substring(5,7)+"G"+inp.substring(8,9));
				Vertice left = new Vertice(inp.substring(0,3)+"G"+inp.substring(3,4)+inp.substring(5,9));
				Vertice right = new Vertice(inp.substring(0,4)+inp.substring(5,6)+"G"+inp.substring(6,9));
				Edges edg  = new Edges(up,1,down,1,left,1,right,1);
				hm.put(inpu,edg);*/
				
				ver.edges[0] = inp.substring(0,1)+"G"+inp.substring(2,4)+inp.substring(1,2)+inp.substring(5,9);
				ver.edges[1] =	inp.substring(0,4)+inp.substring(7,8)+inp.substring(5,7)+"G"+inp.substring(8,9);
				ver.edges[2] = inp.substring(0,3)+"G"+inp.substring(3,4)+inp.substring(5,9);
				ver.edges[3] = inp.substring(0,4)+inp.substring(5,6)+"G"+inp.substring(6,9);
				
				ver.edge_cost[0] = Integer.parseInt(inp.substring(1,2));
				ver.edge_cost[1] = Integer.parseInt(inp.substring(7,8));
				ver.edge_cost[2] = Integer.parseInt(inp.substring(3,4));
				ver.edge_cost[3] = Integer.parseInt(inp.substring(5,6));
				hm.put(inp,ver);
			}
			else if(index==5)
			{
				//System.out.println("yuo_2");
				Vertice up = new Vertice(inp.substring(0,2)+"G"+inp.substring(3,5)+inp.substring(2,3)+inp.substring(6,9));
				Vertice left = new Vertice(inp.substring(0,4)+"G"+inp.substring(4,5)+inp.substring(6,9));
				Vertice down = new Vertice(inp.substring(0,5)+inp.substring(8,9)+inp.substring(6,8)+"G");
				Edges edg  = new Edges(up,1,down,1,left,1,null,0);
				//hm.put(inpu,edg);
				//sm.put(inpu.vertice,0);
				
				ver.edges[0] = inp.substring(0,2)+"G"+inp.substring(3,5)+inp.substring(2,3)+inp.substring(6,9);
				ver.edges[1] =	inp.substring(0,5)+inp.substring(8,9)+inp.substring(6,8)+"G";
				ver.edges[2] = inp.substring(0,4)+"G"+inp.substring(4,5)+inp.substring(6,9);
			
				
				ver.edge_cost[0] = Integer.parseInt(inp.substring(2,3));
				ver.edge_cost[1] = Integer.parseInt(inp.substring(8,9));
				ver.edge_cost[2] = Integer.parseInt(inp.substring(4,5));
				
				hm.put(inp,ver);
			}
			else if(index==6)
			{
				Vertice up = new Vertice(inp.substring(0,3)+"G"+inp.substring(4,6)+inp.substring(3,4)+inp.substring(7,9));
				Vertice right = new Vertice(inp.substring(0,6)+inp.substring(7,8)+"G"+inp.substring(8,9));
				Edges edg  = new Edges(up,1,null,0,null,0,right,1);
				//hm.put(inpu,edg);
				//sm.put(inpu.vertice,0);
				
				ver.edges[0] =inp.substring(0,3)+"G"+inp.substring(4,6)+inp.substring(3,4)+inp.substring(7,9);
				ver.edges[3] = inp.substring(0,6)+inp.substring(7,8)+"G"+inp.substring(8,9);
				
				ver.edge_cost[0] = Integer.parseInt(inp.substring(3,4));
			
				ver.edge_cost[3] = Integer.parseInt(inp.substring(7,8));
				hm.put(inp,ver);
				

			}
			if (index==7)
			{
				//System.out.println("yuo_1");
				Vertice up = new Vertice(inp.substring(0,4)+"G"+inp.substring(5,7)+inp.substring(4,5)+inp.substring(8,9));
				Vertice left = new Vertice(inp.substring(0,6)+"G"+inp.substring(6,7)+inp.substring(8,9));
				Vertice right = new Vertice(inp.substring(0,7)+inp.substring(8,9)+"G");
				Edges edg  = new Edges(up,1,null,0,left,1,right,1);
				ver.edges[0] = inp.substring(0,4)+"G"+inp.substring(5,7)+inp.substring(4,5)+inp.substring(8,9);
				ver.edges[2] =	inp.substring(0,6)+"G"+inp.substring(6,7)+inp.substring(8,9);
				ver.edges[3] = inp.substring(0,7)+inp.substring(8,9)+"G";
			
				
				ver.edge_cost[0] = Integer.parseInt(inp.substring(4,5));
				ver.edge_cost[2] = Integer.parseInt(inp.substring(6,7));
				ver.edge_cost[3] = Integer.parseInt(inp.substring(8,9));
				hm.put(inp,ver);
			}
			else if(index==8)
			{
				//System.out.println("yuo");
				Vertice up = new Vertice(inp.substring(0,5)+"G"+inp.substring(6,8)+inp.substring(5,6));
				Vertice left = new Vertice(inp.substring(0,7)+"G"+inp.substring(7,8));
				Edges edg  = new Edges(up,1,null,0,left,1,null,0);
				//hm.put(inpu,edg);
				//sm.put(inpu.vertice,0);
				
				ver.edges[0] = inp.substring(0,5)+"G"+inp.substring(6,8)+inp.substring(5,6);
				ver.edges[2] =	inp.substring(0,7)+"G"+inp.substring(7,8);
		
			
				
				ver.edge_cost[0] = Integer.parseInt(inp.substring(5,6));
				ver.edge_cost[2] = Integer.parseInt(inp.substring(7,8));
			
				hm.put(inp,ver);
				
			}
			return hm;
	}

	public  void dijkstra(HashMap<String,Vertice> hm,String source,String dest,int[] costs,PrintWriter ostream)
	{
		HashMap<String,Vertice> pmi = new HashMap<>();
		HashMap<String,nod> pm = new HashMap<>();
		HashMap<String,nod> found = new HashMap<>();
		HashMap<String,Integer> dist = new HashMap<>();
		Iterator<String> it= hm.keySet().iterator(); 
		boolean reached = false;
		
		heap Heap = new heap();
		nod n= new nod(hm.get(source).vertice,0,0,null);
		if (n.s.equals(dest))
		{
			reached = true;
			ostream.println(("0 0"));
			ostream.println((" "));
			return;
		} 
			pm.put(n.s,n);
			found.put(n.s,n);
			dist.put(n.s,0);
			Vertice edi = hm.get(n.s);
			if (edi.edges[0]!=null)
				{
					nod up = new nod(edi.edges[0],1,costs[edi.edge_cost[0]],n);
					up.prev = n;
					up.d=0;
					up.prev_reached_by = "D";
					up.moved = edi.edge_cost[0];
					Heap.insert(up);
					pm.put(edi.edges[0],up);
				}
		
			if (edi.edges[1]!=null)
				{

				
					nod down = new nod(edi.edges[1],1,costs[edi.edge_cost[1]],n);
					down.prev = n;
					down.u=0;
					down.prev_reached_by = "U";
					down.moved = edi.edge_cost[1];
					Heap.insert(down);
					pm.put(edi.edges[1],down);
				}
			if (edi.edges[2]!=null)
				{
					nod left = new nod(edi.edges[2],1,costs[edi.edge_cost[2]],n);
					left.prev = n;
					left.r=0;
					left.prev_reached_by = "R";
					left.moved = edi.edge_cost[2];
					Heap.insert(left);
					pm.put(edi.edges[2],left);

				}
			if (edi.edges[3]!=null)
				{
					nod right = new nod(edi.edges[3],1,costs[edi.edge_cost[3]],n);
					right.prev = n;
					right.l=0;
					right.prev_reached_by = "L";
					right.moved = edi.edge_cost[3];
					Heap.insert(right);
					pm.put(edi.edges[3],right);
				}

	
			
		nod min = null;
		int i=0;
		while(i<181439)
		{	
			min = Heap.delete();
			
			if (min==null){break;}
			
			if (min.s.equals(dest))
			{
				ostream.println((min.mov + " "+min.price));
			//System.out.println(d.mov + " "+d.price);
				StringBuilder to_print = new StringBuilder();
				to_print.append(min.moved+min.prev_reached_by);
				min=min.prev;
				while (min.prev!=null)
				{
					to_print.insert(0,min.moved+min.prev_reached_by+" ");
					min=min.prev;
				}
				ostream.println((to_print.toString()));
				return;
			}
			found.put(min.s,min);
			dist.put(min.s,min.price);
			Vertice ed = hm.get(min.s);
			if (ed.edges[0]!=null)
			{
				
				if (pm.get(ed.edges[0])==null)
				{
					nod up = new nod(ed.edges[0],min.mov+1,costs[ed.edge_cost[0]]+min.price,min);
					up.prev = min;
					up.d=0;
					up.prev_reached_by = "D";
					up.moved = ed.edge_cost[0];
					Heap.insert(up);
					pm.put(ed.edges[0],up);
						
				}
				else
				{
					if(pm.get(ed.edges[0])!=null)
					{
						if (pm.get(ed.edges[0]).price >= costs[ed.edge_cost[0]]+min.price)
						{
							if (pm.get(ed.edges[0]).price==costs[ed.edge_cost[0]]+min.price)
							{
								if (pm.get(ed.edges[0]).mov>min.mov+1)
								{
									pm.get(ed.edges[0]).mov = min.mov+1;
									pm.get(ed.edges[0]).prev = min;
									pm.get(ed.edges[0]).prev_reached_by = "D";
									pm.get(ed.edges[0]).moved = ed.edge_cost[0];
								}
							}
							else
							{
								pm.get(ed.edges[0]).mov = min.mov+1;
								pm.get(ed.edges[0]).price = costs[ed.edge_cost[0]]+min.price;
								pm.get(ed.edges[0]).prev = min;
								pm.get(ed.edges[0]).prev_reached_by = "D";
								pm.get(ed.edges[0]).moved = ed.edge_cost[0];
							}

						}
					}
				}
			}
			if (ed.edges[1]!=null)
			{
				
				if (pm.get(ed.edges[1])==null && found.get(ed.edges[1])==null)
				{

				
					nod down = new nod(ed.edges[1],min.mov+1,costs[ed.edge_cost[1]]+min.price,min);
					down.prev = min;
					down.u=0;
					down.prev_reached_by = "U";
					down.moved = ed.edge_cost[1];
					Heap.insert(down);
						pm.put(ed.edges[1],down);
					
				}
				else
				{
					if(pm.get(ed.edges[1])!=null)
					{
						if (pm.get(ed.edges[1]).price>=costs[ed.edge_cost[1]]+min.price)
						{
							if (pm.get(ed.edges[1]).price==costs[ed.edge_cost[1]]+min.price)
							{
								if (pm.get(ed.edges[1]).mov>min.mov+1)
								{
									pm.get(ed.edges[1]).mov = min.mov+1;
									pm.get(ed.edges[1]).prev = min;
									pm.get(ed.edges[1]).prev_reached_by = "U";
									pm.get(ed.edges[1]).moved = ed.edge_cost[1];
								}
							}
							else
							{
								pm.get(ed.edges[1]).mov = min.mov+1;
								pm.get(ed.edges[1]).price = costs[ed.edge_cost[1]]+min.price;
								pm.get(ed.edges[1]).prev = min;
								pm.get(ed.edges[1]).prev_reached_by = "U";
									pm.get(ed.edges[1]).moved = ed.edge_cost[1];
							}
						}
					}
				}
			}
			if (ed.edges[2]!=null)
			{
				
				if (pm.get(ed.edges[2])==null &&found.get(ed.edges[2])==null)
				{
					nod left = new nod(ed.edges[2],min.mov+1,costs[ed.edge_cost[2]]+min.price,min);
					left.prev = min;
					left.r=0;
					left.prev_reached_by = "R";
					left.moved = ed.edge_cost[2];
				
						Heap.insert(left);
						pm.put(ed.edges[2],left);
				
					
				}
				else
				{
					if(pm.get(ed.edges[2])!=null)
					{
						if (pm.get(ed.edges[2]).price>=costs[ed.edge_cost[2]]+min.price)
						{
							if (pm.get(ed.edges[2]).price==costs[ed.edge_cost[2]]+min.price)
							{
								if (pm.get(ed.edges[2]).mov>min.mov+1)
								{
									pm.get(ed.edges[2]).mov = min.mov+1;
									pm.get(ed.edges[2]).prev = min;
									pm.get(ed.edges[2]).prev_reached_by = "R";
									pm.get(ed.edges[2]).moved = ed.edge_cost[2];
								}
							}
							else
							{
								pm.get(ed.edges[2]).mov = min.mov+1;
								pm.get(ed.edges[2]).price = costs[ed.edge_cost[2]]+min.price;
								pm.get(ed.edges[2]).prev = min;
								pm.get(ed.edges[2]).prev_reached_by = "R";
									pm.get(ed.edges[2]).moved = ed.edge_cost[2];
							}
						}
					}
				}
			}
			if (ed.edges[3]!=null)
			{
				
				if (pm.get(ed.edges[3])==null &&found.get(ed.edges[3])==null)
				{
					nod right = new nod(ed.edges[3],min.mov+1,costs[ed.edge_cost[3]]+min.price,min);
					right.prev = min;
					right.l=0;
					right.prev_reached_by = "L";
					right.moved = ed.edge_cost[3];
				
						Heap.insert(right);
						pm.put(ed.edges[3],right);
				
				
				}
			
				else
				{
					if(pm.get(ed.edges[3])!=null)
					{
						if (pm.get(ed.edges[3]).price>=costs[ed.edge_cost[3]]+min.price)
						{
							if (pm.get(ed.edges[3]).price==costs[ed.edge_cost[3]]+min.price)
							{
								if (pm.get(ed.edges[3]).mov>min.mov+1)
								{
									pm.get(ed.edges[3]).mov = min.mov+1;
									pm.get(ed.edges[3]).prev = min;
									pm.get(ed.edges[3]).prev_reached_by = "L";
									pm.get(ed.edges[3]).moved = ed.edge_cost[3];
								}
							}
							else
							{
								pm.get(ed.edges[3]).mov = min.mov+1;
								pm.get(ed.edges[3]).price = costs[ed.edge_cost[3]]+min.price;
								pm.get(ed.edges[3]).prev = min;
								pm.get(ed.edges[3]).prev_reached_by = "L";
								pm.get(ed.edges[3]).moved = ed.edge_cost[3];
							}
						}
					}
				}
			}
			i++;
		}
		nod d = pm.get(dest);
		
		if (d==null)
		{
			ostream.println(("-1 -1"));
			ostream.println((" "));
		}
		else
		{
			ostream.println((d.mov + " "+d.price));
			//System.out.println(d.mov + " "+d.price);
			StringBuilder to_print = new StringBuilder();
			to_print.append(d.moved+d.prev_reached_by);
			d=d.prev;
			while (d.prev!=null)
			{
				to_print.insert(0,d.moved+d.prev_reached_by+" ");
				d=d.prev;
			}
			ostream.println((to_print.toString()));

		}


	}

}