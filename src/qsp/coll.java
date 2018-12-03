package qsp;

import java.util.ArrayList;
import java.util.List;

public class coll {

	public static void main(String[] args)
	{
		List<String> a1=new ArrayList();
		a1.add("a");
		a1.add("b");
		a1.add("c");
		a1.add("a");
		
	  int count=a1.size();
	  System.out.println("count:"+count);
	  for(int i=0; i<count; i++)
	  {
		 String s1=a1.get(i);
		 System.out.println("s1:"+s1);
	  }

	}

}
