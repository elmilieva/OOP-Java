package homework2;

public class Movie {
	private String title;
	private int year;
	private byte oscarCount;
	private String director;

	public Movie(String title, int year, byte oscarCount, String director) {
		this.title = title;
		this.year = year;
		this.oscarCount = oscarCount;
		this.director = director;

	}

	public Movie() {
		this.title = "Jumanji";
		this.year = 1995;
		this.oscarCount = 0;
		this.director = "Joe Johnson";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public byte getOscarCount() {
		return oscarCount;
	}

	public void setOscarCount(byte oscarCount) {
		this.oscarCount = oscarCount;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Movie{" + "title=" + title + ", year=" + year + ", oscarCount=" + oscarCount + ", director=" + director
				+ '}';
	}

}
