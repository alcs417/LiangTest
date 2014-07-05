package b;

public class QuanPaiLie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] p = new int[]{1,5,3};
		
		//showPermutation(p, p.length);
		
		while(nextPermutation(p, p.length))
	    {
	       showPermutation(p, p.length);
	       System.out.print("\n");
	    }

		

	}
	
	public static boolean nextPermutation(int[] p, int n)
	{
	    int last = n - 1;
	    int i, j, k;
	 
	    //从后向前查找，看有没有后面的数大于前面的数的情况，若有则停在后一个数的位置。
	    i = last;
	    while (i > 0 && p[i] < p[i - 1])
	       i--;
	    //若没有后面的数大于前面的数的情况，说明已经到了最后一个排列，返回false。
	    if (i == 0)
	       return false;
	 
	    //从后查到i，查找大于p[i - 1]的最小的数，记入k
	    k = i;
	    for (j = last; j >= i; j--)
	       if (p[j] > p[i - 1] && p[j] < p[k])
	           k = j;
	    //交换p[k]和p[i - 1]
	    //swap(p[k], p[i - 1]);
	    int temp = p[k];
	    p[k] = p[i-1];
	    p[i-1] = temp;
	    //倒置p[last]到p[i]
	    for (j = last, k = i; j > k; j--, k++)
	    //swap(p[j], p[k]);
	    {
	    	temp = p[j];
		    p[j] = p[k];
		    p[k] = temp;
	    }
	 
	    return true;
	}
	
	public static void swap(int a, int b)
	{
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void showPermutation(int[] p, int n)
	{
	    for (int i = 0; i < n; i++)
	      System.out.print(p[i] + " ");
	}


}
