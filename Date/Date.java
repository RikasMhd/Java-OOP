public class Date{
	private int year;
	private int month;
	private int day;
	
	public Date(){
		year= 2025;
		month = 05;
		day = 27;
	}
	
	public Date(int day,int month,int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
	
	public void setDay(int day){
		this.day = day;
	}
	public void setMonth(int month){
		this.month  = month;
	}
	public void setYear(int year){
		this.year = year;
	}
	
	public String toString(){
		return "The Date is : "+String.format("%02d",this.getDay())+"/"+String.format("%02d",this.getMonth())+"/"+this.getYear();
	}
}