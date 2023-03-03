package FlightResv;

public class Flight {
	private int FlightNo;
	private boolean Aclass;
	private int capacity;

	Flight(int no, boolean Aclass, int cap){
		   this.FlightNo = no;
		   this.Aclass = Aclass;
		   this.capacity = cap;

	}
	public int getFlightNo() {
		return FlightNo;
	}
	public boolean isAclass() {
		return Aclass;
		
	}
	public int getCapacity() {
		return capacity;
		
	}
	public void setAclass(boolean val) {
		Aclass = val;
	}
	
	public void setCapacity(int cap) {
		capacity = cap;
	}
	 public void displayFlightInfo(){
		 System.out.println("Flight No:"+ "Aclass:" +Aclass +"Total Capacity:"+ capacity);
	 }
}