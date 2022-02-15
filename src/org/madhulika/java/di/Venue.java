package org.madhulika.java.di;

public class Venue {
	private String venueName;
	private int venueId;
	private String hallNo;
	
	public Venue(String venueName, int venueId, String hallNo) {
		this.venueName = venueName;
		this.venueId = venueId;
		this.hallNo = hallNo;
		
	}
	
	public Venue(String venueName, String hallNo) {
		this.venueName = venueName;
		this.hallNo = hallNo;
		
	}
	
	public void displayVenueDetails() {
		System.out.println("venue details are: "+ venueName+" : "+venueId+" : "+hallNo);
		
	}
	
}
