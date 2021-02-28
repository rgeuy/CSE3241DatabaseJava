import java.util.Scanner;

public class Main {
	
	public static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		String input;
		printOptions();
		input = s.nextLine();
		
		while (input != "x") {
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
				System.out.println("That is not a selection");
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
		System.out.println("5) Retrieve info about a track by name");
		System.out.println("6) Retrieve info about ordered media");
		System.out.println("7) Edit existing info for an artist");
		System.out.println("8) Delete an existing track");
		System.out.println("Press x to exit");
		System.out.print("Your option: ");
	}
	
	public static void option1() {
		String fName, lName, stageName, bDate, gender;
		System.out.print("Please enter their first name ");
		fName = s.nextLine();
		System.out.print("Please enter their last name ");
		lName = s.nextLine();
		System.out.print("Please enter their stage name ");
		stageName = s.nextLine();
		System.out.print("Please enter their date of birth ");
		bDate = s.nextLine();
		System.out.print("Please enter their gender (M/F) ");
		gender = s.nextLine();
		
		Artist art = new Artist(fName, lName, stageName, bDate, gender);
		System.out.println("Artist added!");
	}
	
	public static void option2() {
		
	}
	
	public static void option3() {
		
	}
	
	public static void option4() {
		
	}
	
	public static void option5() {
		
	}
	
	public static void option6() {
		
	}
	
	public static void option7() {
		
	}
	
	public static void option8() {
		
	}
}
