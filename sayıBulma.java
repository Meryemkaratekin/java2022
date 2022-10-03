package sayıBulma;

public class main {

	public static void main(String[] args) {
		int sayılar[] = new int [] {1,2,3,4,5,6,7,8,9,8,7,6,5,};
		int aranacak=  74;
		boolean varMı = false ;
		
		for(int sayı : sayılar) {
			
		
			if(sayı==aranacak) {
				 varMı = true ;
				break;
				
				
			}
			
		}
		
		if(varMı) {
			System.out.println("Sayı mevcuttur");
		}
		else {
			System.out.println("Sayı mevcut değildir");
		}
		
		

	}

}
