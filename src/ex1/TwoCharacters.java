package ex1;

import java.util.Scanner;

public class TwoCharacters {

	public static void main(String[] args) {

		MyCharacter character = buildCharacter();
		displayCharacter(character);

	}

	private static void displayCharacter(MyCharacter character) {
		System.out.println("Character --- " + character.getName());
		System.out.println("Number of eyes: " + character.getNumberEye());
		System.out.println("Color: " + character.getColor());
		System.out.println("Number of lifes: " + character.getNumberLife());
	}

	public static MyCharacter buildCharacter() {
		MyCharacter character = new MyCharacter();

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Introdu nume:");

		character.setName(keyboard.next());
		System.out.print("Introdu numarul de ochi:");

		character.setNumberEye(keyboard.nextInt());
		System.out.print("Introdu numarul de vieti:");
		character.setNumberLife(keyboard.nextInt());
		System.out.print("Introdu culoarea caracterului:");
		character.setColor(keyboard.next());
		return character;
	}

}
