
public class Main {

	public static void main(String[] args) {
		
		
		
		CustomerManager customermanager=new CustomerManager(new Customer(),new MilitaryCreditManager());
		customermanager.giveCredit();
		

	}

}
