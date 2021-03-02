
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static Scanner s;
	public static ArrayList<Media> allMedias = new ArrayList<Media>();
	public static ArrayList<Artist> allArtists = new ArrayList<Artist>();
	public static ArrayList<Track> allTracks = new ArrayList<Track>();

	public static void main(String[] args) {
		s = new Scanner(System.in);
		String input;
		printOptions();
		input = s.nextLine();

		while (!input.equals(("x"))) {
			int option = Integer.parseInt(input);

			switch (option) {
			case 1:
				option1();
				break;
			case 2:
				option2();
				break;
			case 3:
				option3();
				break;
			case 4:
				option4();
				break;
			case 5:
				option5();
				break;
			case 6:
				option6();
				break;
			case 7:
				option7();
				break;
			case 8:
				option8();
				break;
			default:
				System.out.println("That is not a selection.");
				break;
			}

			printOptions();
			input = s.nextLine();
		}

		s.close();
	}

	public static void printOptions() {
		System.out.println("Please select one of the following options:");
		System.out.println("1) Enter a new artist");
		System.out.println("2) Enter a new track/song");
		System.out.println("3) Enter data for a new media item");
		System.out.println("4) Retrieve info about a specific artist");
		System.out.println("5) Retrieve info about a track");
		System.out.println("6) Retrieve info about ordered media");
		System.out.println("7) Edit existing info for an artist");
		System.out.println("8) Delete an existing track");
		System.out.println("Press x to exit");
		System.out.print("Your option: ");
	}

	// Entering data for a new artist (use the data attributes
	// that you defined for that entity)
	public static void option1() {
		String fName, lName, stageName, bDate, gender;
		System.out.print("Please enter their first name ");
		fName = s.nextLine();
		System.out.print("Please enter their last name ");
		lName = s.nextLine();
		System.out.print("Please enter their stage name ");
		stageName = s.nextLine();
		System.out.print("Please enter their date of birth (MM/DD/YYYY) ");
		bDate = s.nextLine();
		System.out.print("Please enter their gender (M/F) ");
		gender = s.nextLine();

		Artist artist = new Artist(fName, lName, stageName, bDate, gender);
		allArtists.add(artist);
		System.out.println("Artist added!");
	}

	// Entering data for a new track/song (use the data attributes that you
	// defined for that entity)
	public static void option2() {
		String title, length, year, genre, awards;
		System.out.print("Please enter the title of the track ");
		title = s.nextLine();
		System.out.print("Please enter the length of the track as XX:XX ");
		length = s.nextLine();
		System.out.print("Please enter the year the track was made ");
		year = s.nextLine();
		System.out.print("Please enter the genre of the track ");
		genre = s.nextLine();
		System.out.print("Please enter any awards the track received, separated by a comma ");
		awards = s.nextLine();

		Track track = new Track(title, length, year, genre, awards);
		allTracks.add(track);
		System.out.println("Track added!");
	}

	// Entering data for new media items ordered: type of media (albums,
	// videos and audiobooks), with number of copies purchase, price and
	// an estimated date of arrival.
	public static void option3() {
		String medType, delvDate;
		int copies;
		float price;

		System.out.print("Please enter the type of media (ALBUM/MOVIE/AUDIOBOOK) ");
		medType = s.nextLine();
		System.out.print("Please enter the delivery date ");
		delvDate = s.nextLine();
		System.out.print("Please enter the number of copies ");
		copies = Integer.parseInt(s.nextLine()); // assume they enter a number
		System.out.print("Please enter the price as XX.XX ");
		price = Float.parseFloat(s.nextLine());

		Media media = new Media(medType, copies, price, delvDate);
		allMedias.add(media);
		System.out.println("Media added!");
	}

	// Retrieve information about one specific artist (provided by the user)
	public static void option4() {

		if (allArtists.size() != 0) {
			String fName, lName, stageName, bDate, gender;
			boolean isFound = false;
			System.out.print("Please enter the artist's first name ");
			fName = s.nextLine();
			System.out.print("Please enter the artist's last name ");
			lName = s.nextLine();
			System.out.print("Please enter the artist's stage name ");
			stageName = s.nextLine();
			System.out.print("Please enter the artist's date of birth (MM/DD/YYYY) ");
			bDate = s.nextLine();
			System.out.print("Please enter the artist's gender M/F ");
			gender = s.nextLine();

			for (Artist a : allArtists) {
				if (stageName.equals(a.getStageName()) && fName.equals(a.getfName()) && lName.equals(a.getlName())
						&& bDate.equals(a.getbDate()) && gender.equals(a.getGender())) {
					a.printArtistInfo();
					isFound = true;
				}
			}
			
			if (isFound == false) {
				System.out.println("That info does not match an artist in this database. ");
			}
		} else {
			System.out.println("Please enter an artist before querying");
		}
	}

	// Retrieve information about a track (provided by the user)
	public static void option5() {

		if (allTracks.size() != 0) {
			String title, length, year, genre, awards;
			boolean isFound = false;
			System.out.print("Please enter the title of the track ");
			title = s.nextLine();
			System.out.print("Please enter the length of the track as XX:XX ");
			length = s.nextLine();
			System.out.print("Please enter the year the track was made ");
			year = s.nextLine();
			System.out.print("Please enter the genre of the track ");
			genre = s.nextLine();
			System.out.print("Please enter an award the track received ");
			awards = s.nextLine();

			for (Track t : allTracks) {
				if (title.equals(t.getTitle()) && length.equals(t.getLength()) && year.equals(t.getYear())
						&& genre.equals(t.getGenre()) && t.getAwards().indexOf(awards) != 0) {
					t.printTrackInfo();
					isFound = true;
				}
			}

			if (isFound == false) {
				System.out.println("That info does not match a track in this database. ");
			}
		} else {
			System.out.println("Please enter a track before querying.");
		}
	}

	// Retrieve information about the media items that are ordered
	// by the library (provided by the user)
	public static void option6() {

		if (allMedias.size() != 0) {
			String medType, delvDate;
			int copies;
			float price;
			boolean isFound = false;
			System.out.print("Please enter the type of media (ALBUM/MOVIE/AUDIOBOOK) ");
			medType = s.nextLine();
			System.out.print("Please enter the delivery date ");
			delvDate = s.nextLine();
			System.out.print("Please enter the number of copies ");
			copies = Integer.parseInt(s.nextLine()); // assume they enter a number
			System.out.print("Please enter the price as XX.XX ");
			price = Float.parseFloat(s.nextLine());

			for (Media m : allMedias) {
				if (medType.equals(m.getMedType()) && delvDate.equals(m.getDelvDate()) && copies == m.getCopies()
						&& price == m.getPrice()) {
					isFound = true;
					m.printMediaInfo();
				}
			}

			if (isFound == false) {
				System.out.println("That info does not match a media in this database. ");
			}
		} else {
			System.out.println("Please enter a media before querying");
		}
	}

	// Editing existing entries for an artist (artist selected by the user)
	public static void option7() {

		if (allArtists.size() != 0) {
			String fName, lName, stageName, bDate, gender;
			boolean found = false;
			System.out.print("Please enter the artist's first name ");
			fName = s.nextLine();
			System.out.print("Please enter the artist's last name ");
			lName = s.nextLine();
			System.out.print("Please enter the artist's stage name ");
			stageName = s.nextLine();
			System.out.print("Please enter the artist's date of birth (MM/DD/YYYY) ");
			bDate = s.nextLine();
			System.out.print("Please enter the artist's gender M/F ");
			gender = s.nextLine();

			Iterator<Artist> i = allArtists.iterator();

			while (i.hasNext()) {
				Artist a = i.next();
				if (stageName.equals(a.getStageName()) && fName.equals(a.getfName()) && lName.equals(a.getlName())
						&& bDate.equals(a.getbDate()) && gender.equals(a.getGender())) {

					found = true;
					System.out.print("Please enter the artist's updated first name ");
					fName = s.nextLine();
					System.out.print("Please enter the artist's updated last name ");
					lName = s.nextLine();
					a.updateName(fName, lName);
					System.out.print("Please enter the artist's updated stage name ");
					a.updateStageName(s.nextLine());
					System.out.print("Please enter the artist's updated date of birth (MM/DD/YYYY) ");
					a.updateBirthday(s.nextLine());
					System.out.print("Please enter the artist's updated gender ");
					a.updateGender(s.nextLine());
					System.out.print("Artist updated!");
					a.printArtistInfo();
				}
			}

			if (found == false) {
				System.out.println("Could not find that artist to update.");
			}

		} else {
			System.out.println("Please enter an artist before trying to update");
		}
	}

	// Deleting an existing track (track selected by the user)
	public static void option8() {

		if (allTracks.size() != 0) {
			String title, length, year, genre, awards;
			boolean isFound = false;
			System.out.print("Please enter the title of the track ");
			title = s.nextLine();
			System.out.print("Please enter the length of the track as XX:XX ");
			length = s.nextLine();
			System.out.print("Please enter the year the track was made ");
			year = s.nextLine();
			System.out.print("Please enter the genre of the track ");
			genre = s.nextLine();
			System.out.print("Please enter any awards the track received, separated by a comma ");
			awards = s.nextLine();

			Iterator<Track> i = allTracks.iterator();
			while (i.hasNext()) {
				Track t = i.next();
				if (title.equals(t.getTitle()) && length.equals(t.getLength()) && year.equals(t.getYear())
						&& genre.equals(t.getGenre()) && t.getAwards().indexOf(awards) != 0) {
					i.remove();
					System.out.println("Removed track!");
					isFound = true;
				}
			}

			if (isFound == false) {
				System.out.println("Could not find that track to delete");
			}

		} else {
			System.out.println("Please enter an track before trying to delete.");
		}
	}
}
