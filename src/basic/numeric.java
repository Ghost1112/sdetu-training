package basic;

public class numeric {

	public static void main(String[] args) {

	Printname();
    int numa = 10;
    int numb = 20;
    addnumber(numa,numb);
    delen(30,10);
    System.out.println(vermening(50,50));
	}

	static void Printname(){
		System.out.println("my name is  tom");
	}

	static void addnumber(int numa,int numb){
		int cal = numa + numb;
		System.out.println("the som is " + numa + "+" + numb + " is " + cal);
	}
static void delen(int n1 , int n2){
	int d = n1 / n2;
	System.out.println("de som is " + n1 + "/" + n2 + " is " + d);
}
static int vermening(int n1,int n2){
	
	int ver = n1 * n2;
	return ver;
	
}
}
