package homework2;

import javax.swing.JOptionPane;

public class MovieTest {
	public static void main(String args[]) {
		Movie myMovie;
		Movie myMovie2;
		Movie myMovie3;
		Movie myMovie4;

		myMovie = new Movie("Jumanji", 1995, (byte) 0, "Joe Johnston"); // Calls the constructor of Movie
		System.out.println(myMovie);

		String title = JOptionPane.showInputDialog("Title of the movie");
		int year = Integer.parseInt(JOptionPane.showInputDialog("Year of the movie"));
		String oscarCount = JOptionPane.showInputDialog("Number of oscars won");
		String director = JOptionPane.showInputDialog("Director of the movie");
		
		myMovie2 = new Movie(title, year, (byte) Integer.parseInt(oscarCount), director);
		System.out.println(myMovie2);

		myMovie3 = new Movie(args[0], Integer.parseInt(args[1]), (byte) Integer.parseInt(args[2]), args[3]);
		System.out.println(myMovie3);

		myMovie4 = new Movie();
		System.out.println(myMovie4);

	}

}
