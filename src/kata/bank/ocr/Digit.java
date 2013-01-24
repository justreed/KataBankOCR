package kata.bank.ocr;

public class Digit {

	private static String one = 
	"   " +
    "  |" +
	"  |";
	private static String two = 
	 " _ " +
	 " _|" +
	 "|_ ";
	private static String three = 
	 " _ " +
	 " _|" +
	 " _|";
	private static String four = 
	 "   " +
	 "|_|" +
	 "  |";	
	private static String five = 
	 " _ " +
	 "|_ " +
	 " _|";
	private static String six =
	 " _ " +
	 "|_ " +
	 "|_|";
	private static String seven =
	 " _ " +
	 "  |" +
	 "  |";
	private static String eight = 
	 " _ " +
	 "|_|" +
	 "|_|";
	private static String nine = 
	 " _ " +
	 "|_|" +
	 " _|";
	private static String zero = 
	 " _ " +
	 "| |" +
	 "|_|";
	
	public Character toSingleChar(String input) {		
		
		if (one.equals(input)) 
			return '1';
		else if(two.equals(input))
			return '2';
		else if(three.equals(input))
			return '3';
		else if(four.equals(input))
			return '4';	
		else if(five.equals(input))
			return '5';
		else if(six.equals(input))
			return '6';
		else if(seven.equals(input))
			return '7';
		else if(eight.equals(input))
			return '8';
		else if(nine.equals(input))
			return '9';
		else if(zero.equals(input))
			return '0';
		else
			return '?';
	}
	
	
}
