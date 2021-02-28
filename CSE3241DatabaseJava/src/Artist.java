public class Artist {

	private String fName, lName, stageName, bDate, gender;
	
	public Artist(String fName, String lName, String stageName, String bDate, String gender) {
		this.fName = fName;
		this.lName = lName;
		this.stageName = stageName;
		this.bDate = bDate;
		this.gender = gender;
	}
	
	public void updateName(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}
	
	public void updateStageName(String name) {
		this.stageName = name;
	}
	
	public void updateBirthday(String bDay) {
		this.bDate = bDay;
	}
	
	public void updateGender(String gender) {
		this.gender = gender;
	}
	
	public void printArtistInfo() {
		System.out.println("Artist information:\n\nName: " + fName + " " + lName + "\nStage Name: " + stageName + "\nBirthday: " + bDate + "\nGender: " + gender);
	}
}