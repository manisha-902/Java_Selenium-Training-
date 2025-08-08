package day3;

import java.util.Scanner;

abstract class Game {
	abstract void start();

	abstract void play();

	abstract void end();
}

class Cricket extends Game {
	void start() {
		System.out.println("Cricket game is starting...");
	}

	void play() {
		System.out.println("Cricket game is being played...");
	}

	void end() {
		System.out.println("Cricket game has ended.");
	}
}

class Football extends Game {
	void start() {
		System.out.println("Football match is starting...");
	}

	void play() {
		System.out.println("Football match is being played...");
	}

	void end() {
		System.out.println("Football match has ended.");
	}
}

public class GameFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Choose a game to play:");
	        System.out.println("1. Cricket");
	        System.out.println("2. Football");
	        System.out.print("Enter your choice: ");
	        int choice = sc.nextInt();
	        
	        Game game;
	        
	        if (choice == 1) {
	            game = new Cricket();
	        } else if (choice == 2) {
	            game = new Football();
	        } else {
	            System.out.println("Invalid choice.");
	            sc.close();
	            return;
	        }
	}}
