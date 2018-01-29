package basic;

public class Stringss {

	public static void main(String[] args) {
	String bookTitle;
	String wordchoice = "ring";
	bookTitle= "the lord of the ring";
	if(bookTitle.contains("ring")){
		System.out.println("the book contain the word ring" + wordchoice);
		
		
	}
			
		String browers = "chrome";
		if(browers.equalsIgnoreCase("chrome")){
			System.out.println("the browerser is equal to chrome");
		}
		
		
		String Firstname = "tom";
		String lastname = "short";
		String SNN ="987655728";
		
		System.out.println("the lengst is" + SNN.length());
		
		System.out.print(Firstname.substring(0, 1));
		System.out.print(lastname.substring(0,1));
		System.out.print(SNN.substring(5));
		
	}

}
