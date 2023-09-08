import java.util.Random;

public class Lucky7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random random = new Random();
		
		int randomNumber1;
		int randomNumber2;
		int randomNumber3;
		
		
		//Arvo 3 numeroa väliltä 1-10
		randomNumber1 = random.nextInt(11);	
			System.out.println("Numero 1 = " + randomNumber1);
			
		randomNumber2 = random.nextInt(11);	
			System.out.println("Numero 2 = " + randomNumber2);
			
		randomNumber3 = random.nextInt(11);	
			System.out.println("Numero 3 = " + randomNumber3);
			
			
			if (randomNumber1 == 7 || randomNumber2 == 7 || randomNumber3 == 7){
				System.out.println("Voitit!");
			}
			else 
			{
				System.out.println("Hävisit!");
			}
			
			
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
