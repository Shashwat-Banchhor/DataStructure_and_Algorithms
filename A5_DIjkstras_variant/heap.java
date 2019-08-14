public class heap
{
	int[] Heap = new int[100];
	int N = 0;
	public int delete()
	{
		int to_ret = Heap[1];
		Heap[1] = Heap[N];
		int k =1;
		while(2*k+1<=N && (Heap[2*k]<Heap[k]||Heap[2*k+1]<Heap[k]))
		{
			if (Heap[2*k]<Heap[2*k+1])
			{
				int tmp = Heap[2*k];
				Heap[2*k]=Heap[k];
				Heap[k]= tmp;
				k=2*k;
			}
			else
			{
				int tmp = Heap[2*k+1];
				Heap[2*k+1]=Heap[k];
				Heap[k]= tmp;
				k=2*k+1;
			}
		}
		if (N==1)
		{
			Heap[N] =0;
		}
		N--;
		return to_ret;
	}
	public void insert(int key)
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
			while(!(k/2==0||Heap[k/2]<=Heap[k]))
			{
				int tmp = Heap[k/2];
				Heap[k/2] = Heap[k];
				Heap[k] = tmp;
				k=k/2;
			}
		}


	}

	public static void main(String args[])
	{
		heap Hip = new heap();
		Hip.insert(1);
		Hip.insert(3);
		Hip.insert(5);
		Hip.insert(2);
		Hip.insert(0);
		Hip.delete();
		Hip.delete();
		Hip.delete();
		Hip.delete();
		Hip.delete();
		for(int i =0;i<Hip.N+1;i++)
			System.out.println(Hip.Heap[i]);

	}
}