public class Artist {

	private String fName, lName, stageName, bDate, gender;
	
	public Artist(String fName, String lName, String stageName, String bDate, String gender) {
		this.fName = fName;
		this.lName = lName;
		this.stageName = stageName;
		this.bDate = bDate;
		this.gender = gender;
	}
	
	public void printArtistInfo() {
		System.out.println("Artist information:\nName: " + fName + " " + lName + "\nStage Name: " + stageName + "\nBirthday: " + bDate + "\nGender: " + gender);
	}
}