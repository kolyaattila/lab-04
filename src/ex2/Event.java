package ex2;

public class Event {

	public final static int EVENT_PRICE_PER_PERSON = 35;
	public final static int MAX_NUMBER_PERSONS = 50;
	private int numberOfPersons;
	private String eventNumber;
	private int price;

	public int getNumberOfPersons() {
		return numberOfPersons;
	}

	public void setNumberOfPersons(int numberOfPersons) {
		this.numberOfPersons = numberOfPersons;
		this.price = numberOfPersons * EVENT_PRICE_PER_PERSON;
	}

	public String getEventNumber() {
		return eventNumber;
	}

	public void setEventNumber(String eventNumber) {
		this.eventNumber = eventNumber;
	}

	public int getPrice() {
		return price;
	}

}
