import java.util.Random;

class DiceGame {
    private Die die1;
    private Die die2;
    
    public void play() {
	die1 = new Die();
	die2 = new Die();

	System.out.println("Rolling the dice...");
	System.out.println("Die 1: " + die1.getFaceValue());
	System.out.println("Die 2: " + die2.getFaceValue());
	int totalValue = die1.getFaceValue()+die2.getFaceValue();
	System.out.println("Total value : "+ totalValue);

	
	if(totalValue> 7){
	    System.out.println("You won!");
	}else {
	    System.out.println("You lost.");
	}
    }

    public static void main(String [] args){
	DiceGame game = new DiceGame();
	game.play();
    }
}

class Die {
    private int faceValue;

    public Die() {
	roll();	
    }
    public int getFaceValue(){
	return faceValue;
    }
    public void roll() {
	Random rnd = new Random();
	faceValue = rnd.nextInt(6) + 1;
    }
}

