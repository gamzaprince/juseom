
public class Bidder {
	String bidderId;
	String userId;
	String auctionId;
	String bidNumber;
	int bidPrice;
	
	public String getBidderId() {
		return bidderId;
	}
	public void setBidderId(String bidderId) {
		this.bidderId = bidderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAuctionId() {
		return auctionId;
	}
	public void setAuctionId(String auctionId) {
		this.auctionId = auctionId;
	}
	public String getBidNumber() {
		return bidNumber;
	}
	public void setBidNumber(String bidNumber) {
		this.bidNumber = bidNumber;
	}
	public int getBidPrice() {
		return bidPrice;
	}
	public void setBidPrice(int bidPrice) {
		this.bidPrice = bidPrice;
	}
}
