
import java.util.Scanner;
import java.util.Random;

public class Lucky7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		
		int randomNumber1;
		int randomNumber2;
		int randomNumber3;
		String pelaa;
		
		//Aloitus saldo
		System.out.println("Saldo: 5€ \r\n");
		
		
		
		//Arvo 3 numeroa väliltä 1-10
		randomNumber1 = random.nextInt(11);		
		randomNumber2 = random.nextInt(11);	
		randomNumber3 = random.nextInt(11);	
			
			
		System.out.println("Pelataanko? (Kyllä, Ei)");
		pelaa = in.nextLine();
			
		if (pelaa.equals("Ei")){
			System.out.println("Peli päättyi");
		}
		
		else if (pelaa.equals("Kyllä")) {
	
			System.out.println("Numero 1 = " + randomNumber1);
			System.out.println("Numero 2 = " + randomNumber2);
			System.out.println("Numero 3 = " + randomNumber3);
			
			
			if (randomNumber1 == 7 || randomNumber2 == 7 || randomNumber3 == 7){
				System.out.println("Voitit!");
			}
			else {
				System.out.println("Hävisit!");
			}
		}
	
			
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
