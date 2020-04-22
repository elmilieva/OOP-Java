package homework4;

public class CafeMachineTest {

	public static void main(String[] args) {
		CafeMachine m1 = new CafeMachine();

		System.out.println("toString(): ");
		System.out.println(m1);

		System.out.println("checkTotal(): ");
		System.out.println(m1.checkTotal());

		System.out.println("takeResto(637): ");
		m1.takeResto(140);

		System.out.println("takeResto(500): ");
		m1.takeResto(500);

		System.out.println("takeResto(500): ");
		m1.takeResto(500);

		System.out.println("takeResto(500): ");
		m1.takeResto(500);

		System.out.println("takeResto(500): ");
		m1.takeResto(500);
	}
}
