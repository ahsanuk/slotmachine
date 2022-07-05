


import java.util.*;
 
 class Slotmachine {

	public static void main(String[] args) {
	
	
	int roll1;
	int roll2;
    int roll3;
	int credit = 10;
	int play = 1;
	int input = 0;
	int end = 3;
	
	while( play == 1 ){
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("~~~~~ Slot Machine ~~~~~");
		System.out.println("       Press any number to begin the game ");
		System.out.println("");
		
		System.out.println("         Press '1' TO begin game ");
		System.out.println("         Press '2' for to display your current credits ");
		System.out.println("         Press '3' to exit game ");

		Scanner in = new Scanner(System.in);
		
		input = in.nextInt();

		if (input == 1){
		
		credit--;
		
			Random r = new Random();
			
		roll1 = r.nextInt(7) + 1;
		
			System.out.println(roll1);
			
		roll2 = r.nextInt(7) + 1;
		
			System.out.println(roll2);
		
		roll3 = r.nextInt(7) + 1;
		
			System.out.println(roll3);
			
				
				
				// Triple 7s numbers
				
				if ( roll1 == 7 && roll2 == 7 && roll3 == 7 ){
				    
					System.out.println("");
					System.out.println(" Triple 7s, you have won 150 credits");                                     
					
					  credit = credit + 150;
				       
					   input = 0;
				}
				
				// Any 7 numbers
				
				else if ( roll1 == 7 || roll2 == 7 || roll3 == 7) {
					
					System.out.println("");
					System.out.println(" Any 7 number, You have won 2 credits");
					
					   credit = credit + 2;
					     
						input = 0;
				}
				
				// Any 3 matching numbers
				
				else if ( roll1 == roll2 && roll1 == roll3 && roll2 == roll3 ){
				    
					System.out.println("");
					System.out.println(" Any three matching numbers, You have won 80 credits");                                                
					
					 credit = credit + 80;
				     
					 input = 0;
				}
				
				// For 2 even numbers
				
				else if ( ( roll1 == roll2 && roll2 % 2 == 0 ) || ( roll1  == roll3  && roll3 % 2 == 0 ) || ( roll2 == roll3 && roll3 % 2== 0 )){
                  
				  System.out.println("");
				   System.out.println(" Any two even numbers, You have won 10 credits");			   
				    
					credit = credit + 10;
				      
					  input = 0;
				}
				
				// For 2 odd numbers
				
				else if ( ( roll1 == roll2 && roll2 % 2 == 1 ) || ( roll1  == roll3  && roll3 % 2 == 1 ) || ( roll2 == roll3 && roll3 % 2== 1 )){
					
					System.out.println("");
					System.out.println(" Any two odd numbers, You have won 5 credits");	                    	
					
					 credit = credit + 5;
				      
					  input = 0;
				}
		        
				// sequential number winnings
				
				else if (roll1 == roll2 - 1 && roll3 - 2 == roll1){
					
				   System.out.println("");
				   System.out.println(" Any sequential numbers, You have won 40 credits"); 
					 
					credit = credit + 40;
				     
					 input = 0;
				}
				
				// non sequential winnings
				
				else if (( roll1 == roll3 - 1 && roll2 - 2 == roll1 ) || ( roll2 == roll3 - 1 && roll1 - 2 == roll2 ) || ( roll3 == roll2 - 1 && roll1 - 2 == roll3) || ( roll2 == roll1 - 1 && roll3 - 2 == roll2) || ( roll3 == roll1 - 1 && roll2 - 2 == roll3)) {
					
					System.out.println("");
					System.out.println(" Any non-sequential numbers, You have won 25 credits");	
					
					 credit = credit + 25;
				       
					   input = 0;
				}
				
				
				// Display the credit
				
				   System.out.println("");
                   System.out.println(" Your remainig credits are "  +credit );
					
                // Credit below 1 this will end game	
				
				if (credit < 1){
					
					System.out.println("");
					System.out.println(" GAME OVER");
					
					break;
				}
				
			}
				
				// Display the credit
				
                if (input == 2){
					
					System.out.println("");
					System.out.println(" Your total current credits are "  +credit);
				}
				
				// End Game
				
				if (input == 3) { 
				
					// Display the credit
					
				   System.out.println("");
                   System.out.println(" You have ended the game and your total credits are "  +credit);
				   System.out.println("");
				   System.out.println(" Thanks For Playing");
				   
				   break;
				}
		
		} 
	
	}
	
}// close class
	
	