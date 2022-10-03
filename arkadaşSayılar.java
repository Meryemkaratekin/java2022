
public class main {

	public static void main(String[] args) {
	
		int sayı1=220, sayı2=284;
		int toplam1=0, toplam2=0, i;
		
		for(i=1;i<sayı1;i++) {
			if(sayı1 % i == 0) {
				toplam1= toplam1+i;
			}
			
		}
		for(i=1;i<sayı2;i++) {
			if(sayı2 % i == 0) {
				toplam2= toplam2+i;
			}
		}
		if(sayı1==toplam2 || sayı2==toplam1) {
			System.out.println("Bu iki sayı arkadaş sayıdır");}
		else{
				System.out.println("Bu iki sayı arkadaş sayı değildir");
			}
		}

	}

