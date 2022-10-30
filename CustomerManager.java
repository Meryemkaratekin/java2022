
public class CustomerManager {
	// save operayonunda customera ulaşmam mümkün değil çünkü farklı metotda o yüzden yaptık.
	private Customer _customer;
	ICreditManager _creditManager;
	// Customer customer yapmamızın sebebi eğer yapmazak yeni özellik eklendiğiimde bütün müşterlilere tek tek eklemem gerekirdi.
	
public CustomerManager(Customer customer,ICreditManager creditManager) {
	_customer = customer;
    _creditManager = creditManager;	
	}
public void save() {
	// customera burada ulaşmazdım .
	System.out.println("Müşteri kaydedildi");
}
public void delete() {
	System.out.println("Müşteri silindi.");
}
public void giveCredit() {
	_creditManager.Calculete();
	System.out.println("Hesaplandı.");
	
}
}

