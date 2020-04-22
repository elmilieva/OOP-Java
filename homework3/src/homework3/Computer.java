package homework3;

public class Computer {
	private int number;
	private String model;
	private boolean started = false;

	public Computer(int number, String model) {
		this.number = number;
		this.model = model;
	}

	public Computer() {
		this.number = 123;
		this.model = "Dell";
	}

	public void startup() {
		if (!started) {
			System.out.println("Computer " + model + " " + number + " has started.");
			started = true;
		} else {
			System.out.println("ERROR: Computer " + model + " " + number + " is already started!");
		}
	}

	public void shutdown() {
		if (started) {
			System.out.println("Computer " + model + " " + number + " has turned off.");
			started = false;
		} else {
			System.out.println("ERROR: Computer " + model + " " + number + " is not started!");
		}
	}

	public void doWork() {
		if (started) {
			System.out.println("Computer " + model + " " + number + " is doing work!");
		} else {
			System.out.println("ERROR: Computer " + model + " " + number + " is not working!");
		}
	}
}
