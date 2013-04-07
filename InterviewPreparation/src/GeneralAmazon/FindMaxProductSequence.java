package GeneralAmazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMaxProductSequence {
	
	public static List<Integer>	find(List<Integer> input)
	{
		List<Integer> prodList_ = new ArrayList<Integer>();
		int maxProd = 1;
		int index = 0;
		
		for (int i = 0 ; i < input.size()-2;i++)
		{
  		    if(maxProd < findProduct(i, input))
			{
				maxProd = findProduct(i, input);
				index = i ;
			}
		}
	   prodList_.add(input.get(index));
	   prodList_.add(input.get(index+1));
	   prodList_.add(input.get(index+2));
		return prodList_;
	}
	
	private static Integer findProduct(int i,List<Integer>input)
	{
		return input.get(i)*input.get(i+1)*input.get(i+2);
	}
	
	
	public static void main(String[] args) {
	    List<Integer> input_ = new ArrayList<Integer>(Arrays.asList(6,7,8,1,2,3,11,9,10));    
	    List<Integer> out = FindMaxProductSequence.find(input_);
	    for(int i : out)
	    {
	    	System.out.println(i);
	    }
	}

}
