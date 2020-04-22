package homework4;

public class CafeMachine {
	private int amountOfEdnaStotinka;
	private int amountOfDveStotinki;
	private int amountOfPetStotinki;
	private int amountOfDesetStotinki;
	private int amountOfDvadesetStotinki;
	private int amountOfPetdesetStotinki;
	private int amountOfLev;
	private int amountOfDvaLeva;

	public CafeMachine(int amountOfEdnaStotinka, int amountOfDveStotinki, int amountOfPetStotinki,
			int amountOfDesetStotinki, int amountOfDvadesetStotinki, int amountOfPetdesetStotinki, int amountOfLev,
			int amountOfDvaLeva) {
		this.amountOfEdnaStotinka = amountOfEdnaStotinka;
		this.amountOfDveStotinki = amountOfDveStotinki;
		this.amountOfPetStotinki = amountOfPetStotinki;
		this.amountOfDesetStotinki = amountOfDesetStotinki;
		this.amountOfDvadesetStotinki = amountOfDvadesetStotinki;
		this.amountOfPetdesetStotinki = amountOfPetdesetStotinki;
		this.amountOfLev = amountOfLev;
		this.amountOfDvaLeva = amountOfDvaLeva;
	}

	public CafeMachine() {
		this.amountOfDesetStotinki = 10;
		this.amountOfDvadesetStotinki = 1;
		this.amountOfDvaLeva = 1;
		this.amountOfDveStotinki = 10;
		this.amountOfEdnaStotinka = 10;
		this.amountOfLev = 10;
		this.amountOfPetdesetStotinki = 10;
		this.amountOfPetStotinki = 10;
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

	public int checkTotal() {

		return (amountOfEdnaStotinka * 1) + (amountOfDveStotinki * 2) + (amountOfPetStotinki * 5)
				+ (amountOfDesetStotinki * 10) + (amountOfDvadesetStotinki * 20) + (amountOfPetdesetStotinki * 50)
				+ (amountOfLev * 100) + (amountOfDvaLeva * 200);
	}

	public void takeResto(int amount) {
		int tmp;
		if (amount >= 200) {
			tmp = amount / 200;
			if (tmp <= amountOfDvaLeva) {
				System.out.println(tmp + " moneti ot 2 leva");
				amount = amount % 200;
				setAmountOfDvaLeva(amountOfDvaLeva - tmp);
			} else if (amountOfDvaLeva > 0) {
				System.out.println(amountOfDvaLeva + " moneti ot 2 leva");
				amount = amount - amountOfDvaLeva * 200;
				setAmountOfDvaLeva(0);
			}
		}
		if (amount >= 100) {
			tmp = amount / 100;
			if (tmp <= amountOfLev) {
				System.out.println(tmp + " moneti ot 1 lev");
				amount = amount % 100;
				setAmountOfLev(amountOfLev - tmp);
			} else if (amountOfLev > 0) {
				System.out.println(amountOfLev + " moneti ot 1 lev");
				amount = amount - amountOfLev * 100;
				setAmountOfLev(0);
			}
		}
		if (amount >= 50) {
			tmp = amount / 50;
			if (tmp <= amountOfPetdesetStotinki) {
				System.out.println(tmp + " moneti ot 50 stotinki");
				amount = amount % 50;
				setAmountOfPetdesetStotinki(amountOfPetdesetStotinki - tmp);
			} else if (amountOfPetdesetStotinki > 0) {
				System.out.println(amountOfPetdesetStotinki + " moneti ot 50 stotinki");
				amount = amount - amountOfPetdesetStotinki * 50;
				setAmountOfPetdesetStotinki(0);
			}
		}
		if (amount >= 20) {
			tmp = amount / 20;
			if (tmp <= amountOfDvadesetStotinki) {
				System.out.println(tmp + " moneti ot 20 stotinki");
				amount = amount % 20;
				setAmountOfDvadesetStotinki(amountOfDvadesetStotinki - tmp);
			} else if (amountOfDvadesetStotinki > 0) {
				System.out.println(amountOfDvadesetStotinki + " moneti ot 20 stotinki");
				amount = amount - amountOfDvadesetStotinki * 20;
				setAmountOfDvadesetStotinki(0);
			}
		}
		if (amount >= 10) {
			tmp = amount / 10;
			if (tmp <= amountOfDesetStotinki) {
				System.out.println(tmp + " moneti ot 10 stotinki");
				amount = amount % 10;
				setAmountOfDesetStotinki(amountOfDesetStotinki - tmp);
			} else if (amountOfDesetStotinki > 0) {
				System.out.println(amountOfDesetStotinki + " moneti ot 10 stotinki");
				amount = amount - amountOfDesetStotinki * 10;
				setAmountOfDesetStotinki(0);
			}
		}
		if (amount >= 5) {
			tmp = amount / 5;
			if (tmp <= amountOfPetStotinki) {
				System.out.println(tmp + " moneti ot 5 stotinki");
				amount = amount % 5;
				setAmountOfPetStotinki(amountOfPetStotinki - tmp);
			} else if (amountOfPetStotinki > 0) {
				System.out.println(amountOfPetStotinki + " moneti ot 5 stotinki");
				amount = amount - amountOfPetStotinki * 5;
				setAmountOfPetStotinki(0);
			}
		}
		if (amount >= 2) {
			tmp = amount / 2;
			if (tmp <= amountOfDveStotinki) {
				System.out.println(tmp + " moneti ot 2 stotinki");
				amount = amount % 2;
				setAmountOfDveStotinki(amountOfDveStotinki - tmp);
			} else if (amountOfDveStotinki > 0) {
				System.out.println(amountOfDveStotinki + " moneti ot 2 stotinki");
				amount = amount - amountOfDveStotinki * 2;
				setAmountOfDveStotinki(0);
			}
		}
		if (amount >= 1) {
			tmp = amount / 1;
			if (tmp <= amountOfEdnaStotinka) {
				System.out.println(tmp + " moneti ot 1 stotinka");
				amount = amount % 1;
				setAmountOfEdnaStotinka(amountOfEdnaStotinka - tmp);
			} else if (amountOfEdnaStotinka > 0) {
				System.out.println(amountOfEdnaStotinka + " moneti ot 1 stotinka");
				amount = amount - amountOfEdnaStotinka * 1;
				setAmountOfEdnaStotinka(0);
			}
		}
		if (amount > 0) {
			System.out.println("Nqma dostatuchno moneti (" + amount + " stotinki) za vasheto resto");
		}

	}

	@Override
	public String toString() {
		String ednaStotinka = String.format("%d moneti ot 1 stotinka \n", amountOfEdnaStotinka);
		String dveStotinki = String.format("%d moneti ot 2 stotinki \n", amountOfDveStotinki);
		String petStotinki = String.format("%d moneti ot 5 stotinki \n", amountOfPetStotinki);
		String desetStotinki = String.format("%d moneti ot 10 stotinki \n", amountOfDesetStotinki);
		String dvadesetStotinki = String.format("%d moneti ot 20 stotinki \n", amountOfDvadesetStotinki);
		String petdesetStotinki = String.format("%d moneti ot 50 stotinki \n", amountOfPetdesetStotinki);
		String lev = String.format("%d moneti ot 1 lev \n", amountOfLev);
		String dvaLeva = String.format("%d moneti ot 2 leva", amountOfDvaLeva);

		return ednaStotinka + dveStotinki + petStotinki + desetStotinki + dvadesetStotinki + petdesetStotinki + lev
				+ dvaLeva;
	}

}
