package a;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class TestIndexOf {

    //add by LC
	private static ArrayList<FileAtom> fileAtom;
	
	/*public static void ReadFile() //��CLUSTALW�ȶԺõ����ж�����seq��
	{
		seq = new ArrayList<String>();
		try
		{
			String fileName = "input.txt";
			FileReader r = new FileReader(fileName);
			String s = null;
			BufferedReader br = new BufferedReader(r);
			while ((s = br.readLine()) != null) 
			{
				seq.add(s);
			}    
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		}		   
	}*/
	
	public static void ReadCongFile()
	{
		File configuration = new File("configuration");
		
	}
	
	public static void ReadPathFile() //��CLUSTALW�ȶԺõ����ж�����seq��
	{
		
		File directory = new File("C:/Documents and Settings/zhangli/����/BRAliBase II/data-set1/data-set1/g2intron/unaligned");
		if(directory.isDirectory())
		{
			fileAtom = new ArrayList<FileAtom>();
			File[] temp = directory.listFiles();
			/*for(int i = 0;i < temp.length;i++)
			{
				FileAtom fa = new FileAtom();
				fa.fileName =  temp[i].getName();
				try
				{
					FileReader r = new FileReader(temp[i].getAbsoluteFile());
					String s = null;
					BufferedReader br = new BufferedReader(r);
					//boolean status = false;
					String contact = "";
					while ((s = br.readLine()) != null) 
					{
						
						if(s.charAt(0) != '>')
						{
							contact += s;
						}
						else if(contact.length() != 0)
						{
							//status = true;
							fa.seqList.add(contact);
							contact = "";
						}
					}
					fa.seqList.add(contact);
				}
				catch(Exception e)
				{
					e.printStackTrace();		
				}	
				fileAtom.add(fa);
			}*/
			for(int i = 0;i < temp.length;i++)
			{
				FileAtom fa = new FileAtom();
				String sName = "aln" + String.valueOf(i+1) + temp[0].getName().substring(temp[0].getName().lastIndexOf("."));
				String sPath = temp[i].getAbsolutePath().substring(0, temp[i].getAbsolutePath().lastIndexOf("\\")+1);
				//�����ر�ע��String����indexOf��lastIndexOf������ʹ�ã������������ķ���ֵ����int���ͣ���˳������
				//String���substring�������ã���Ϊsubstring����Ρ�indexOf�����ǰ��մ����ҵ�˳�����ַ����н��в��ҵ�
				//lastIndexOf�ǰ��մ��ҵ����˳��(rightmost)���ַ����в��ҵģ���ϸ��һ��JDK�ĵ��Ľ��ͣ�������⡣����
				//ע��substring�����(int begin,int end)�Ա߽��ַ��ǰ����Ļ��ǲ������ġ�
				//String sName = temp[0].getName().substring(temp[0].getName().lastIndexOf("."));
				//String sName = temp[0].getName().substring(0, temp[0].getName().lastIndexOf("."));
				//String sName = temp[0].getName().substring(0, temp[0].getName().lastIndexOf(".")) + String.valueOf(i+1) + temp[0].getName().substring(temp[0].getName().lastIndexOf("."));
				fa.fileName = sName;
				try
				{
					FileReader r = new FileReader(sPath + sName);
					String s = null;
					BufferedReader br = new BufferedReader(r);
					//boolean status = false;
					String contact = "";
					while ((s = br.readLine()) != null) 
					{
						
						if(s.charAt(0) != '>')
						{
							contact += s;
						}
						else if(contact.length() != 0)
						{
							//status = true;
							fa.seqList.add(contact);
							contact = "";
						}
					}
					fa.seqList.add(contact);
				}
				catch(Exception e)
				{
					e.printStackTrace();		
				}	
				fileAtom.add(fa);
			}
		}
		else
		{
			System.out.println("This is not a directory!");
		}
		
		
		/*seq = new ArrayList<String>();
		try
		{
			String fileName = "input.txt";
			FileReader r = new FileReader(fileName);
			String s = null;
			BufferedReader br = new BufferedReader(r);
			while ((s = br.readLine()) != null) 
			{
				seq.add(s);
			}    
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		}*/		   
	}
	
    public static void output()
    {
    	/*try
		{
			String fileName = "output.txt";
			FileOutputStream r = new FileOutputStream(fileName);
			for(int i = 0;i < fileAtom.size();i++)
			{
				r.write(fileAtom.get(i).fileName.getBytes());
				r.write("\n".getBytes());
				r.write("---------------start---------------\n".getBytes());
				for(int j = 0;j < fileAtom.get(i).seqList.size();j++)
				{
					r.write(fileAtom.get(i).seqList.get(j).getBytes());
					r.write("\n".getBytes());
				}
				r.write("------------------end---------------\n".getBytes());
				r.write("\n".getBytes());
			}
			r.close();
			   
		}*/
    	try
		{
			String fileName = "output.txt";
			FileWriter r = new FileWriter(fileName);
			for(int i = 0;i < fileAtom.size();i++)
			{
				r.write(fileAtom.get(i).fileName);
				r.write("\n");
				r.write("---------------start---------------\n");
				for(int j = 0;j < fileAtom.get(i).seqList.size();j++)
				{
					r.write(fileAtom.get(i).seqList.get(j));
					r.write("\n");
				}
				r.write("------------------end---------------\n");
				r.write("\n");
			}
			r.close();
			   
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		}
    }
	
	
	public static void main(String[] args)
	{
		
		ReadPathFile();
		output();
		System.out.println("Run Success!");	
	}
	
	

}


class FileAtom
{
	public String fileName;
	public ArrayList<String> seqList;
	
	public FileAtom()
	{
		fileName = null;
		seqList = new ArrayList<String>();
	}

}
