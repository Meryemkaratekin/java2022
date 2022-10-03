package multiDimensionalArray;

public class main {

	public static void main(String[] args) {
		
		String şehirler [][] = new String [3][3];
		
		şehirler [0][0] = "İSTANBUL";
		şehirler [0][1] = "BALIKESİR";
		şehirler [0][2] = "BURSA";
		şehirler [1][0] = "İZMİR";
		şehirler [1][1] = "KÜTAHYA";
		şehirler [1][2] = "UŞAK";
		şehirler [2][0] = "VAN";
		şehirler [2][1] = "KARS";
		şehirler [2][2] = "AĞRI";
		


		
		int i,j ;
		for(i=0;i<3;i++) {
			System.out.println("***************************");
			for (j=0;j<3;j++){
				
				
				System.out.println(şehirler[i][j]);
				
			}
			
			
		}

	}

}
