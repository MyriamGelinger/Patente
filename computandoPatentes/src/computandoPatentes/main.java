package computandoPatentes;

public class main {

	public static void main(String[] args) {

	 String Nropatente="AB234KA";
	
	int K=6;
	System.out.println("Patente:" +Nropatente);
	System.out.println("la " +K + " patente siguiente es :" );
	Siguiente(Nropatente, K);
	}

	private static void Siguiente(String Nropatente, int k) {
		char[] patente =Nropatente.toCharArray();
		

		for (int i = patente.length - 1; i > 0 && k != 0; i--) {

		    char l = patente[i];

		    if (patente[i] >= 'A' && patente[i] <= 'Z') {                   

		        patente[i] = (char) ('A' + (l - 'A' + k) % 26);
		        k = (l - 'A' + k) / 26;

		    } else if (patente[i] >= '0' && patente[i] <= '9') {            



		        patente[i] = (char) ('0' + (l - '0' + k) % 10);
		        k = (l - '0' + k) / 10;

		    }
		}
	
			String NroPatenteSig = String.valueOf(patente);
			System.out.println(patente);
		
		}
		
	}

	
