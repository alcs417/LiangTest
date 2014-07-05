package d;

import java.util.ArrayList;

class couple
{
	public int front;
	public int back;
	public couple()
	{
		front = 0;
		back = 0;
	}
	public couple(int i ,int j)
	{
		front = i;
		back = j;
	}
}

public class reversal {

	/**
	 * @param args
	 */
	private static int[] addori;
	
	public static void reverse(int pos1,int pos2)
	{
		int[] temp = new int[addori.length];
		
		if(pos1 < pos2)
		{
		    for(int i = 0;i < pos1;i++)
		    {
			    temp[i] = addori[i];
		    }
		    for(int i =  pos2 + 1;i < addori.length;i++)
		    {
			    temp[i] = addori[i];
		    }
		    for(int i = 0;i < pos2 - pos1 + 1;i++)
		    {
			    temp[pos1 + i] = addori[pos2 - i];
		    }
		}
		else
		{
			for(int i = 0;i < pos2;i++)
		    {
			    temp[i] = addori[i];
		    }
		    for(int i =  pos1 + 1;i < addori.length;i++)
		    {
			    temp[i] = addori[i];
		    }
			for(int i = 0;i < pos1 - pos2 + 1;i++)
		    {
			    temp[pos2 + i] = addori[pos1 - i];
		    }
		}
	    addori = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //int[] origin = new int[]{1,4,6,5,7,8,3,2};//数组中不能有小于1的值，且没有重复，并且序列中还必须有adjacency的存在。
        //int[] origin = new int[]{1,2,3,4,5,6,7,8};
		int[] origin = new int[]{1,4,6,5,7,8,3,2};
		//int[] origin = new int[]{1,2,5,6,7,3,4,8};
        //------------给数组加头加尾---------------//
        int max = origin[0];
        for(int i = 0;i < origin.length;i++)
        {
        	if(origin[i] > max)
        	{
        		max = origin[i];
        	}
        }
        addori = new int[origin.length + 2];
        addori[0] = 0;
        addori[addori.length - 1] = max + 1;
        for(int i = 1;i < addori.length - 1;i++)
        {
        	addori[i] = origin[i-1];
        }
        for(int i = 0;i <  addori.length;i++)
        {
        	System.out.print(addori[i] + " ");
        }
        System.out.println("\n" + "------------starting reversal------------");
        //------------完毕---------------//
        //------------寻找序列的adjacency并加入breakpoint---------------//
        int step = 0;
        while(true)
        {
     
        	ArrayList<couple> decrease = new ArrayList<couple>();
            ArrayList<couple> increase = new ArrayList<couple>();
            int tmp = 0,start = 0,end = 1;
            while(tmp < addori.length)
            {
        	    if(tmp == addori.length - 1)
        	    {
        		    increase.add(new couple(tmp,addori.length-1));
        		    break;
        	    }
        	    while(start < addori.length - 1)
        	    {
        	 	    if(addori[start] ==  addori[end] + 1 || addori[start] ==  addori[end] - 1)
        		    {
        			    start++;
        			    end++;
        		    }
        		    else
        		    {
        			    if(tmp == start)//这表示序列中两个相邻的数字有就有breakpoint
        			    {
        				    if(tmp == 0)
        				    {
        					    increase.add(new couple(tmp,start));
        				    }
        				    else
        				    {
        					    decrease.add(new couple(tmp,start));
        				    }
        			    }
        			    else 
        			    {
        				    if(addori[tmp] < addori[start])
        				    {
            				    increase.add(new couple(tmp,start));
            			    }
            			    else if(addori[tmp] > addori[start])
            			    {
            				    decrease.add(new couple(tmp,start));
            			    }
        			    }
        			    tmp = end;
        			    start = end;
        			    end++;
        			    break;
        		    }
        	    }
        	    if(start == addori.length - 1)
        	    {
        	    	if(tmp == start)
        	    	{
        	    		increase.add(new couple(tmp,start));
        	    	}
        	    	else if(addori[tmp] < addori[start])
				    {
    				    increase.add(new couple(tmp,start));
    			    }
    			    else if(addori[tmp] > addori[start])
    			    {
    				    decrease.add(new couple(tmp,start));
    			    }
        		    break;
        	    }
            }
            System.out.println("the increasing strip is : ");
            for(int i = 0;i < increase.size();i++)
            {
            	System.out.println(increase.get(i).front + " " + increase.get(i).back);
            }
            System.out.println("the decreasing strip is : ");
            for(int i = 0;i < decrease.size();i++)
            {
            	System.out.println(decrease.get(i).front + " " + decrease.get(i).back);
            }
            //------------完毕---------------//
            if(increase.size() == 1 && increase.get(0).front == 0 && increase.get(0).back == addori.length - 1)
            {
            	break;//证明序列已经排好了
            }
            //------------如果序列中没有decrease，则要创造decrease---------------//
            //在创造decrease的时候，注意不能选取第一个和最后一个increase进行反转，否则会有问题//
            if(decrease.size() == 0)
            {
            	reverse(increase.get(1).front,increase.get(1).back);//就用第二个做decrease
            	decrease.add(new couple(increase.get(1).front,increase.get(1).back));
            	increase.remove(1);
            }
        
            //------------完毕---------------//
            //找到decrease中最小的值所在的位置k，找到k-1所在的位置，将k到k-1之间的序列进行reverse//
            int pos1 = 0,pos2 = 0,min1 = 100;
            for(int i = 0;i < decrease.size();i++)
            {
            	if(addori[decrease.get(i).back] < min1)
            	{
            		min1 = addori[decrease.get(i).back];
            		pos1 = decrease.get(i).back;
            	}
            }
            for(int i = 0;i < addori.length;i++)
            {
            	if(addori[i] == min1 - 1)
            	{
            		pos2 = i;
            		break;
            	}
            }
            if(pos1 < pos2)
            {
            	pos1 = pos1 + 1;
            }
            else
            {
            	pos2 = pos2 + 1;
            }
            reverse(pos1,pos2);
            //------------完毕---------------//
            step++;
            System.out.println("After the [" + step + "] reversal the order is : ");
            for(int i = 0;i <  addori.length;i++)
            {
            	System.out.print(addori[i] + " ");
            }
            System.out.println("\n" + "------------step[" + step + "] is over-------------");
	    }
        System.out.println("the step is : " + step);
    }
	
}
