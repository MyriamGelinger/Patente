package computandoPatentes;

public class Patente {
	
String Nropatente;
int K;


public static void Siguiente(String Nropatente, int k) {

char[] patente =Nropatente.toCharArray();
System.out.println("patente;" +patente);

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
}

}

