
public class numerber {

	public static void main(String[] args) {
	int numA = 60;
	int numB = 20;
    //addnumber(numA,numB);
    delen(numA,numB);
    malen(numA,numB);
    System.out.println( malen(numA,numB));
	}

	
	
	// static void addnumber(int numa,int numb){
     
		// int sum= numa + numb;
		// System.out.println("number 1 + number 2 = " + numa  + " + " + numb  + " is " + sum);
		
		
//}
static void delen(int numbera,int numberb){
	
	int delen = numbera / numberb;
	System.out.println(delen);
}
 static int malen(int numbera,int numberb){
	 int vermeen= numbera * numberb;
	
	 return vermeen;
	 
 }
}
