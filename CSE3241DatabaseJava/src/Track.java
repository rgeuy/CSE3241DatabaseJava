public class Track {
	private String title, length, year, genre, awards;
	
	public Track(String title, String length, String year, String genre, String awards) {
		this.title = title;
		this.length = length;
		this.year = year;
		this.genre = genre;
		this.awards = awards;
	}
	
	public void printTrackInfo() {
		System.out.println("Track Information:\n\nTitle: " + title + "\nLength: " + length + "\nYear: " + year + "\nGenre: " + genre + "\nAwards: " + awards);
	}
}