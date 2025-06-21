class GuessGame {
	Player p1;
	Player p2;
	Player p3;

	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;

		boolean p1Right = false;
		boolean p2Right = false;
		boolean p3Right = false;

		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I'm thingking of a number between 0 and 9...");
		
		while(true) {
			System.out.println("Number to guess is " + targetNumber);
			p1.guess();
			p2.guess();
			p3.guess();

			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);

			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2);	

			guessp3 = p3.number;
			System.out.println("Player three guessed " + guessp3);
			
			if (guessp1 == targetNumber) {
				p1Right = true;
			}
			if (guessp2 == targetNumber) {
				p2Right = true;
			}	
			if (guessp3 == targetNumber) {
				p3Right = true;
			}
			
			if (p1Right || p2Right || p3Right) {
				System.out.println("We have a winner!");
				System.out.println("Player one got it right ? " + p1Right);
				System.out.println("Player two got it right ? " + p2Right);
				System.out.println("Player three got it right ? " + p3Right);
				break;
			} else {
				System.out.println("Players will to try again.");
			}	
		}
	
	}
}
