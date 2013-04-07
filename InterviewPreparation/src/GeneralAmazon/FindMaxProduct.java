package GeneralAmazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaxProduct
{
	
	//TODO: check Arrays
	//TODO: check collections
	
    private static List<Integer> input_ = new ArrayList<Integer>(Arrays.asList(6,7,8,1,2,3,9,10));    
    private static List<Integer> prodList_ = new ArrayList<Integer>();
    
    public static void main(String[] args) 
    {        
        for(int i=0;i<input_.size();i++) {
            int currentValue = input_.get(i);
            //System.out.println(currentValue);
            Collections.sort(prodList_);
                        
            if (prodList_.size() < 3) {
                prodList_.add(currentValue);
            }
            else {
                if (currentValue >= prodList_.get(0)) {
                    prodList_.set(0, currentValue);
                }
            }
        }
        Collections.sort(prodList_);

        for (int i=0;i<prodList_.size();i++) {
            System.out.println(prodList_.get(i));
        }
    }	
    
}


