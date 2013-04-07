package GeneralGoogle;

import java.util.ArrayList;
import java.util.List;

import GeneralGoogle.helper.Point;

public class RemoteControlSequence {

	/**
	 * ABCDEFGHI 
	 * JKLMNOPQR
	 * STUVWXYZ  
	 */
   public static List<String> sequence(String input)
   {
	   char[] remoteInput = input.toCharArray();
	   List<String> remoteSequence = new ArrayList<String>();
	   Point a = new Point(0,0);
	   for(int i = 0; i < remoteInput.length; i++)
	   {
		  Point inputChar = findPoint(remoteInput[i]);
		  while (a.getX() < inputChar.getX())
		  {
			remoteSequence.add("D");  
			a.setX(a.getX()+1);
		  }
		  while (a.getX() > inputChar.getX())
		  {
			  remoteSequence.add("U");  
			  a.setX(a.getX()-1);
		  }
		  while (a.getY() < inputChar.getY())
		  {
				remoteSequence.add("R");  
				a.setY(a.getY()+1);
		  }
		  while (a.getY() > inputChar.getY())
		  {
				remoteSequence.add("L");  
				a.setY(a.getY()-1);
		  }
			remoteSequence.add("E");

	   }
	   return remoteSequence;
   }
  
   public static Point findPoint(char input)
   {
	   int init = 'A';
	   int inp = input;
	   int location = inp - init ;
	   int x = location/9;
	   int y = location%9;
	   return new Point(x,y);
   }
	
   
	
	public static void main(String[] args) {
		String inputSequence = "PRANAY";
		System.out.println(sequence(inputSequence));
	}
}
