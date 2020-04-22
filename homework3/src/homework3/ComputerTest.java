package homework3;

public class ComputerTest {

	public static void main(String[] args) {
		Computer testPc = new Computer(235, "HP");
		System.out.println("Created testPc.");
		Computer testPc2 = new Computer(123, "Asus");
		System.out.println("Created testPc2.");

		System.out.println("testPc.startup():");
		testPc.startup();
		System.out.println("testPc2.startup():");
		testPc2.startup();
		System.out.println("testPc.startup():");
		testPc.startup();

		System.out.println("testPc.doWork()");
		testPc.doWork();
		System.out.println("testPc2.doWork()");
		testPc2.doWork();

		System.out.println("testPc.shutdown()");
		testPc.shutdown();
		System.out.println("testPc2.shutdown()");
		testPc2.shutdown();
		System.out.println("testPc2.shutdown()");
		testPc2.shutdown();

		System.out.println("testPc.doWork()");
		testPc.doWork();
	}

}
