
public class Money {
	private int amountOfEdnaStotinka;
	private int amountOfDveStotinki;
	private int amountOfPetStotinki;
	private int amountOfDesetStotinki;
	private int amountOfDvadesetStotinki;
	private int amountOfPetdesetStotinki;
	private int amountOfLev;
	private int amountOfDvaLeva;
	private static double exchangeRate;

	public Money(int amountOfEdnaStotinka, int amountOfDveStotinki, int amountOfPetStotinki, int amountOfDesetStotinki,
			int amountOfDvadesetStotinki, int amountOfPetdesetStotinki, int amountOfLev, int amountOfDvaLeva) {
		this.amountOfEdnaStotinka = amountOfEdnaStotinka;
		this.amountOfDveStotinki = amountOfDveStotinki;
		this.amountOfPetStotinki = amountOfPetStotinki;
		this.amountOfDesetStotinki = amountOfDesetStotinki;
		this.amountOfDvadesetStotinki = amountOfDvadesetStotinki;
		this.amountOfPetdesetStotinki = amountOfPetdesetStotinki;
		this.amountOfLev = amountOfLev;
		this.amountOfDvaLeva = amountOfDvaLeva;
	}

	public int checkTotal() {
		return (amountOfEdnaStotinka * 1) + (amountOfDveStotinki * 2) + (amountOfPetStotinki * 5)
				+ (amountOfDesetStotinki * 10) + (amountOfDvadesetStotinki * 20) + (amountOfPetdesetStotinki * 50)
				+ (amountOfLev * 100) + (amountOfDvaLeva * 200);
	}

	public static double getExchangeRate() {
		return exchangeRate;
	}

	public static void setExchangeRate(double exchangeRate) {
		Money.exchangeRate = exchangeRate;
	}

	public int getAmountOfEdnaStotinka() {
		return amountOfEdnaStotinka;
	}

	public void setAmountOfEdnaStotinka(int amountOfEdnaStotinka) {
		this.amountOfEdnaStotinka = amountOfEdnaStotinka;
	}

	public int getAmountOfDveStotinki() {
		return amountOfDveStotinki;
	}

	public void setAmountOfDveStotinki(int amountOfDveStotinki) {
		this.amountOfDveStotinki = amountOfDveStotinki;
	}

	public int getAmountOfPetStotinki() {
		return amountOfPetStotinki;
	}

	public void setAmountOfPetStotinki(int amountOfPetStotinki) {
		this.amountOfPetStotinki = amountOfPetStotinki;
	}

	public int getAmountOfDesetStotinki() {
		return amountOfDesetStotinki;
	}

	public void setAmountOfDesetStotinki(int amountOfDesetStotinki) {
		this.amountOfDesetStotinki = amountOfDesetStotinki;
	}

	public int getAmountOfDvadesetStotinki() {
		return amountOfDvadesetStotinki;
	}

	public void setAmountOfDvadesetStotinki(int amountOfDvadesetStotinki) {
		this.amountOfDvadesetStotinki = amountOfDvadesetStotinki;
	}

	public int getAmountOfPetdesetStotinki() {
		return amountOfPetdesetStotinki;
	}

	public void setAmountOfPetdesetStotinki(int amountOfPetdesetStotinki) {
		this.amountOfPetdesetStotinki = amountOfPetdesetStotinki;
	}

	public int getAmountOfLev() {
		return amountOfLev;
	}

	public void setAmountOfLev(int amountOfLev) {
		this.amountOfLev = amountOfLev;
	}

	public int getAmountOfDvaLeva() {
		return amountOfDvaLeva;
	}

	public void setAmountOfDvaLeva(int amountOfDvaLeva) {
		this.amountOfDvaLeva = amountOfDvaLeva;
	}

}
