package ex2;

import java.util.Scanner;

public class EventDemo {
	public static void main(String[] args) {

		Event event = buildEvent();

		displayMotto();
		displayEvent(event);
	}

	private static void displayEvent(Event event) {
		// display the details about the event
	}

	private static void displayMotto() {
		// display Moto
	}

	public static Event buildEvent() {
		Event event = new Event();

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Introdu eventNumber:");
		event.setEventNumber(keyboard.next());
		System.out.print("Introdu numarul de participanti:");
		event.setNumberOfPersons(keyboard.nextInt());

		return event;
	}

}
