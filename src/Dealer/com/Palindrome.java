package Dealer.com;

class Palindrome {

	public static String REGEX = "[^A-Za-z0-9]";
	public static String BLANK = "";
	
	public static Boolean isPalindrome(String input)
	{
		//Strip on non character values(including whitespace) and convert to lowercase
		String cleanInput = input.replaceAll(REGEX, BLANK).toLowerCase();
		char[] inputArray = cleanInput.toCharArray();
		for(int i=0 ; i<inputArray.length/2;i++)
		{
			if(inputArray[i] != inputArray[inputArray.length-i-1])
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(Palindrome.isPalindrome("Ah, Satan sees Natasha"));
	}

}
