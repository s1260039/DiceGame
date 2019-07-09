import java.util.Random;
import java.util.Scanner;

class DiceGame {
    private Die die1;
    private Die die2;
    
    public void play() {

	System.out.println("What is your name?");
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	System.out.println("Hello, " + str + "!" );

	die1 = new Die();
	die2 = new Die();


	System.out.println("Rolling the dice...");
	System.out.println("Die 1: " + die1.getFaceValue());
	System.out.println("Die 2: " + die2.getFaceValue());
	int totalValue = die1.getFaceValue()+die2.getFaceValue();
	System.out.println("Total value : "+ totalValue);

	
	if(totalValue> 7){
	    System.out.println(str +" won!");
	}else {
	    System.out.println(str+" lost.");
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

