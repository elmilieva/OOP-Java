import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VendingMachine {

	private Money moneyInMachine;
	private Products products;

	public VendingMachine(Money moneyInMachine, Products products) {
		this.moneyInMachine = moneyInMachine;
		this.products = products;
	}

	public Money getMoneyInMachine() {
		return moneyInMachine;
	}

	public void setMoneyInMachine(Money moneyInMachine) {
		this.moneyInMachine = moneyInMachine;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public String takeResto(int amount) {
		StringBuilder result = new StringBuilder();
		result.append("Vasheto resto e: \n");
		int tmp;
		if (amount >= 200) {
			tmp = amount / 200;
			if (tmp <= moneyInMachine.getAmountOfDvaLeva()) {
				result.append(tmp + " moneti ot 2 leva\n");
				amount = amount % 200;
				moneyInMachine.setAmountOfDvaLeva(moneyInMachine.getAmountOfDvaLeva() - tmp);
			} else if (moneyInMachine.getAmountOfDvaLeva() > 0) {
				result.append(moneyInMachine.getAmountOfDvaLeva() + " moneti ot 2 leva\n");
				amount = amount - moneyInMachine.getAmountOfDvaLeva() * 200;
				moneyInMachine.setAmountOfDvaLeva(0);
			}
		}
		if (amount >= 100) {
			tmp = amount / 100;
			if (tmp <= moneyInMachine.getAmountOfLev()) {
				result.append(tmp + " moneti ot 1 lev\n");
				amount = amount % 100;
				moneyInMachine.setAmountOfLev(moneyInMachine.getAmountOfLev() - tmp);
			} else if (moneyInMachine.getAmountOfLev() > 0) {
				result.append(moneyInMachine.getAmountOfLev() + " moneti ot 1 lev\n");
				amount = amount - moneyInMachine.getAmountOfLev() * 100;
				moneyInMachine.setAmountOfLev(0);
			}
		}
		if (amount >= 50) {
			tmp = amount / 50;
			if (tmp <= moneyInMachine.getAmountOfPetdesetStotinki()) {
				result.append(tmp + " moneti ot 50 stotinki\n");
				amount = amount % 50;
				moneyInMachine.setAmountOfPetdesetStotinki(moneyInMachine.getAmountOfPetdesetStotinki() - tmp);
			} else if (moneyInMachine.getAmountOfPetdesetStotinki() > 0) {
				result.append(moneyInMachine.getAmountOfPetdesetStotinki() + " moneti ot 50 stotinki\n");
				amount = amount - moneyInMachine.getAmountOfPetdesetStotinki() * 50;
				moneyInMachine.setAmountOfPetdesetStotinki(0);
			}
		}
		if (amount >= 20) {
			tmp = amount / 20;
			if (tmp <= moneyInMachine.getAmountOfDvadesetStotinki()) {
				result.append(tmp + " moneti ot 20 stotinki\n");
				amount = amount % 20;
				moneyInMachine.setAmountOfDvadesetStotinki(moneyInMachine.getAmountOfDvadesetStotinki() - tmp);
			} else if (moneyInMachine.getAmountOfDvadesetStotinki() > 0) {
				result.append(moneyInMachine.getAmountOfDvadesetStotinki() + " moneti ot 20 stotinki\n");
				amount = amount - moneyInMachine.getAmountOfDvadesetStotinki() * 20;
				moneyInMachine.setAmountOfDvadesetStotinki(0);
			}
		}
		if (amount >= 10) {
			tmp = amount / 10;
			if (tmp <= moneyInMachine.getAmountOfDesetStotinki()) {
				result.append(tmp + " moneti ot 10 stotinki\n");
				amount = amount % 10;
				moneyInMachine.setAmountOfDesetStotinki(moneyInMachine.getAmountOfDesetStotinki() - tmp);
			} else if (moneyInMachine.getAmountOfDesetStotinki() > 0) {
				result.append(moneyInMachine.getAmountOfDesetStotinki() + " moneti ot 10 stotinki\n");
				amount = amount - moneyInMachine.getAmountOfDesetStotinki() * 10;
				moneyInMachine.setAmountOfDesetStotinki(0);
			}
		}
		if (amount >= 5) {
			tmp = amount / 5;
			if (tmp <= moneyInMachine.getAmountOfPetStotinki()) {
				result.append(tmp + " moneti ot 5 stotinki\n");
				amount = amount % 5;
				moneyInMachine.setAmountOfPetStotinki(moneyInMachine.getAmountOfPetStotinki() - tmp);
			} else if (moneyInMachine.getAmountOfPetStotinki() > 0) {
				result.append(moneyInMachine.getAmountOfPetStotinki() + " moneti ot 5 stotinki\n");
				amount = amount - moneyInMachine.getAmountOfPetStotinki() * 5;
				moneyInMachine.setAmountOfPetStotinki(0);
			}
		}
		if (amount >= 2) {
			tmp = amount / 2;
			if (tmp <= moneyInMachine.getAmountOfDveStotinki()) {
				result.append(tmp + " moneti ot 2 stotinki\n");
				amount = amount % 2;
				moneyInMachine.setAmountOfDveStotinki(moneyInMachine.getAmountOfDveStotinki() - tmp);
			} else if (moneyInMachine.getAmountOfDveStotinki() > 0) {
				result.append(moneyInMachine.getAmountOfDveStotinki() + " moneti ot 2 stotinki\n");
				amount = amount - moneyInMachine.getAmountOfDveStotinki() * 2;
				moneyInMachine.setAmountOfDveStotinki(0);
			}
		}
		if (amount >= 1) {
			tmp = amount / 1;
			if (tmp <= moneyInMachine.getAmountOfEdnaStotinka()) {
				result.append(tmp + " moneti ot 1 stotinka\n");
				amount = amount % 1;
				moneyInMachine.setAmountOfEdnaStotinka(moneyInMachine.getAmountOfEdnaStotinka() - tmp);
			} else if (moneyInMachine.getAmountOfEdnaStotinka() > 0) {
				result.append(moneyInMachine.getAmountOfEdnaStotinka() + " moneti ot 1 stotinka\n");
				amount = amount - moneyInMachine.getAmountOfEdnaStotinka() * 1;
				moneyInMachine.setAmountOfEdnaStotinka(0);
			}
		}
		if (amount > 0) {
			result.append("Nqma dostatuchno moneti (" + amount + " stotinki) za vasheto resto\n");
		}
		if (amount < 0) {
			return "";
		}
		return result.toString();
	}

	public void refillProducts(int quantity) {
		for (Product p : products.getProducts()) {
			p.setQuantity(quantity);
		}
	}

	public String buyProduct(Product product, Money inputMoney, boolean euro) {
		if (product.getQuantity() > 0) {

			if (euro) {
				int totalMoneyInLeva = (int) (inputMoney.checkTotal() / Money.getExchangeRate());

				if (totalMoneyInLeva < product.getPrice()) {
					return "Not enough money to buy " + product.getName() + ". You need "
							+ (product.getPrice() - inputMoney.checkTotal()) + " more!";
				}

				product.setQuantity(product.getQuantity() - 1);

				return "Exchange rate is: 1lv. = " + Money.getExchangeRate() + "euro\nYou just bought "
						+ product.getName() + "!";
			} else {

				if (inputMoney.checkTotal() < product.getPrice()) {
					return "Not enough money to buy " + product.getName() + ". You need "
							+ (product.getPrice() - inputMoney.checkTotal()) + " more!";
				}

				moneyInMachine.setAmountOfDesetStotinki(
						moneyInMachine.getAmountOfDesetStotinki() + inputMoney.getAmountOfDesetStotinki());
				moneyInMachine.setAmountOfDvadesetStotinki(
						moneyInMachine.getAmountOfDvadesetStotinki() + inputMoney.getAmountOfDvadesetStotinki());
				moneyInMachine
						.setAmountOfDvaLeva(moneyInMachine.getAmountOfDvaLeva() + inputMoney.getAmountOfDvaLeva());
				moneyInMachine.setAmountOfDveStotinki(
						moneyInMachine.getAmountOfDveStotinki() + inputMoney.getAmountOfDveStotinki());
				moneyInMachine.setAmountOfEdnaStotinka(
						moneyInMachine.getAmountOfEdnaStotinka() + inputMoney.getAmountOfEdnaStotinka());
				moneyInMachine.setAmountOfLev(moneyInMachine.getAmountOfLev() + inputMoney.getAmountOfLev());
				moneyInMachine.setAmountOfPetdesetStotinki(
						moneyInMachine.getAmountOfPetdesetStotinki() + inputMoney.getAmountOfPetdesetStotinki());
				moneyInMachine.setAmountOfPetStotinki(
						moneyInMachine.getAmountOfPetStotinki() + inputMoney.getAmountOfPetStotinki());

				product.setQuantity(product.getQuantity() - 1);

				return "You just bought " + product.getName() + "!";
			}
		} else {
			return "No more " + product.getName() + " left! Wait for restock!";
		}
	}

	public String checkAmountOfCoinsInMachine() {
		String ednaStotinka = String.format("%d moneti ot 1 stotinka \n", moneyInMachine.getAmountOfEdnaStotinka());
		String dveStotinki = String.format("%d moneti ot 2 stotinki \n", moneyInMachine.getAmountOfDveStotinki());
		String petStotinki = String.format("%d moneti ot 5 stotinki \n", moneyInMachine.getAmountOfPetStotinki());
		String desetStotinki = String.format("%d moneti ot 10 stotinki \n", moneyInMachine.getAmountOfDesetStotinki());
		String dvadesetStotinki = String.format("%d moneti ot 20 stotinki \n",
				moneyInMachine.getAmountOfDvadesetStotinki());
		String petdesetStotinki = String.format("%d moneti ot 50 stotinki \n",
				moneyInMachine.getAmountOfPetdesetStotinki());
		String lev = String.format("%d moneti ot 1 lev \n", moneyInMachine.getAmountOfLev());
		String dvaLeva = String.format("%d moneti ot 2 leva", moneyInMachine.getAmountOfDvaLeva());

		return ednaStotinka + dveStotinki + petStotinki + desetStotinki + dvadesetStotinki + petdesetStotinki + lev
				+ dvaLeva;
	}

	public void reloadCoins() {
		moneyInMachine.setAmountOfDesetStotinki(5);
		moneyInMachine.setAmountOfDvadesetStotinki(5);
		moneyInMachine.setAmountOfDvaLeva(5);
		moneyInMachine.setAmountOfDveStotinki(5);
		moneyInMachine.setAmountOfEdnaStotinka(5);
		moneyInMachine.setAmountOfLev(5);
		moneyInMachine.setAmountOfPetdesetStotinki(5);
		moneyInMachine.setAmountOfPetStotinki(5);
	}

	public void exportReportInLatex() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		String totalAmount = (Integer.toString(moneyInMachine.checkTotal() / 100) + "."
				+ moneyInMachine.checkTotal() % 100 + " lv\n");
		String amountString = " x" + Integer.toString(moneyInMachine.getAmountOfEdnaStotinka()) + " & x"
				+ moneyInMachine.getAmountOfDveStotinki() + " & x" + moneyInMachine.getAmountOfPetStotinki() + " & x"
				+ moneyInMachine.getAmountOfDesetStotinki() + " & x" + moneyInMachine.getAmountOfDvadesetStotinki()
				+ " & x" + moneyInMachine.getAmountOfPetdesetStotinki() + " & x" + moneyInMachine.getAmountOfLev()
				+ " & x" + moneyInMachine.getAmountOfDvaLeva() + " \\\\\n";
		String latex = "\\documentclass{article}\n" 
				+ "\\title{Vending Machine report}\n" 
				+ "\\author{Eliza Ilieva}\n"
				+ "\\date{" + formatter.format(date) + "}\n" 
				+ "\\usepackage{tabularx}\n" 
				+ "\\begin{document}\n"
				+ "\\maketitle\n" 
				+ "\\section{Money in machine}\n"
				+ "The following table shows a report of all the money within the vending machine.\\\\\n\n"
				+ "\\begin{tabularx}{0.8\\textwidth} {\n" + "  | >{\\centering\\arraybackslash}X\n"
				+ "  | >{\\centering\\arraybackslash}X\n" + "  | >{\\centering\\arraybackslash}X\n"
				+ "  | >{\\centering\\arraybackslash}X\n" + "  | >{\\centering\\arraybackslash}X\n"
				+ "  | >{\\centering\\arraybackslash}X\n" + "  | >{\\centering\\arraybackslash}X\n"
				+ "  | >{\\centering\\arraybackslash}X | }\n" 
				+ " \\hline\n"
				+ " 1 st & 2 st & 5 st & 10 st & 20 st & 50 st & 1 lv & 2 lv \\\\\n" 
				+ " \\hline\n" + amountString
				+ "\\hline\n" 
				+ "\\end{tabularx}\\\\\\\\\n" 
				+ "Total amount of money in machine: " + totalAmount
				+ "\\centering\n" 
				+ "\\end{document}";

		try {
			FileWriter myWriter = new FileWriter("report.tex");
			myWriter.write(latex);
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
