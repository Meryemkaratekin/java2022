package asalSayıMiniProje1;

public class main {

	public static void main(String[] args) {
		int sayi = 11,i;
		int kalan = sayi % 2;
	   Boolean  asalMı = true;
	 
	
		for(i=2;i<sayi;i++) {
			 if(sayi % i == 0)
			 {
				asalMı = false ;
				
			 }
			 
		}
		if(asalMı) {
			System.out.println("Sayı asaldır");
		}
		else {
			System.out.println("Sayı asal değildir ");
		}
		
		
	
			
		}
		
			
			
				
				
		
			
	



		
	

}
