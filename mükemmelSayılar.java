package mükemmelSayı;

public class main {

	public static void main(String[] args) {
		int sayi =  6,i ;
		int toplam = 0;
		
		
		for(i=1;i<sayi;i++) {
			if(sayi % i == 0) {
				toplam = toplam +i;
			}
			
		}
       if(toplam==sayi) {
    	   System.out.println("Sayı mükemmel sayıdır ");
       }
       else {
    	   System.out.println("Sayı mükemmel sayı değildir");
       }
	}

}
