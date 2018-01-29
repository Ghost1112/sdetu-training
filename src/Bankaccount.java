
public class Bankaccount {

	public static void main(String[] args) {
		Bankaccount acc1 = new Bankaccount("465329874");
		Bankaccount acc2 = new Bankaccount("465329874");
		Bankaccount acc3 = new Bankaccount("465329874");
	}
class bankaccount{
	// properties of a bank
	// internal id
	private String accountnumber;   // ID + 2 random digit + first 2 of SNN
	private String routingnumber;  //
	private String name;
	private String SNN;
	private double balance;
}

public Bankaccount(String SNN){
	System.out.println("new bankaccount created");
;
}

}
