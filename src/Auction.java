
public class Auction {
	String auctionId;
	String bookId;
	int startPrice;
	int presentPrice;
	String salesNumber;
	String bidNumber;
	String endTime;
	
	public String getAuctionId() {
		return auctionId;
	}
	public void setAuctionId(String auctionId) {
		this.auctionId = auctionId;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public int getStartPrice() {
		return startPrice;
	}
	public void setStartPrice(int startPrice) {
		this.startPrice = startPrice;
	}
	public int getPresentPrice() {
		return presentPrice;
	}
	public void setPresentPrice(int presentPrice) {
		this.presentPrice = presentPrice;
	}
	public String getSalesNumber() {
		return salesNumber;
	}
	public void setSalesNumber(String salesNumber) {
		this.salesNumber = salesNumber;
	}
	public String getBidNumber() {
		return bidNumber;
	}
	public void setBidNumber(String bidNumber) {
		this.bidNumber = bidNumber;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
}
