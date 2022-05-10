import java.util.Scanner;

public class Adventure
	{
		public static void main(String[] args)
			{
				System.out.println("You are on the start of your Adventure!");
				Scanner userDirection = new Scanner (System.in);
				System.out.println("There are two paths in front of you, do you pick the right or the left?");
				String direction = userDirection.nextLine();
				
				if (direction.equals("Right")) {
					System.out.println("There was a bear! You got attacked.");
					Scanner userChoiceOne = new Scanner (System.in);
					System.out.println("There are two bags you brought with you, do you pick the blue or red?");
					String choice = userChoiceOne.nextLine();
					
						if (choice.equals("Red")) {
							System.out.println("You pick the bag with your lunch in it and the bear came back! You died :(");
						}
						
						else if (choice.equals("Blue")) {
							System.out.println("You picked the first aid kit! You healed yourself and can continue on the adventure.");
						}
				}
				
				else if (direction.equals("Left")) {
					System.out.println("You are safe! Keep exploring!");
				}
			}

	}
