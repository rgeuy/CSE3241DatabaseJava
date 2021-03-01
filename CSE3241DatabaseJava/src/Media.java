public class Media {
	private String medType, delvDate;
	private int copies;
	private float price;
	
	public Media(String media, int copies, float price, String del) {
		medType = media;
		this.copies = copies;
		this.price = price;
		delvDate = del;
	}
	
	public void printMediaInfo() {
		System.out.println("Ordered Media Information:\n\nMedia Type: " + medType + "\nNumber of copies: " + copies + "\nPrice: " + price + "\nExpected Delivery Date: " + delvDate);
	}
	
	public String getMedType() {
		return medType;
	}
	
	public String getDelvDate() {
		return delvDate;
	}
	
	public int getCopies() {
		return copies;
	}
	
	public float getPrice() {
		return price;
	}
}