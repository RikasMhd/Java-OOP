public class Date1
{
	private int day;
	private int month;
	private int year;
	
	public Date1(int dd,int mm,int yy)
	{
		day = dd;
		month = mm;
		year = yy;
	}
		public int getDay()
	   {
		   return this.day;
	   }
	   public int getMonth()
	   {
		   return this.month;
	   }
	   public int getYear()
	   {
		   return this.year;
	   }
	  
	   public void setDay(int day)
	   {
		   this.day = day;
	   }
	   public void setMonth(int month )
	   {
		   this.month = month;
	   }
	   public void setYear(int year)
	   {
		   this.year = year;
	   }
	    public void findTomorrow()
		{
			int tempDay = this.getDay();
			int tempMonth = this.getMonth();
			int tempYear = this.getYear();
			 
			
		switch(tempMonth){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			{
				if(tempDay==31){
					tempDay=1;
					tempMonth=(tempMonth+1)%12;
					if(tempMonth==1){
						tempYear=tempYear+1;
					}
					
				}
				else{
					tempDay=tempDay+1;
				}
			}
			break;
			
			case 4: case 6: case 9: case 11:
			{
				if(tempDay==30)
				{
					tempDay=1;
					tempMonth=tempMonth+1;
				}
				else{
					tempDay=tempDay+1;
				}
			}
			break;
			
			case 2:
			{
				if(tempYear%400==0 || tempYear%4==0 && tempYear%100!=0){
					if(tempDay==29){
						tempDay=1;
						tempMonth=(tempMonth+1)%12;
						if(tempMonth==1){
							tempYear=tempYear+1;
						}
						
					}
					else{
						tempDay=tempDay+1;
					}
					
				}
				else {
					if(tempDay==28){
					tempDay=1;
					tempMonth=(tempMonth+1)%12;
					if(tempMonth==1){
						tempYear=tempYear+1;
					}
					}
					else{
						tempDay=tempDay+1;
					}
				}
			}
			
			
		}
		System.out.print("Tmrw Date is "+tempDay+"/"+tempMonth+"/"+tempYear);
}

		
		public String thisDay(){
			return (getDay()+"/"+getMonth()+"/"+getYear());
		}
}

// System.out.println("Tomorrow is "+(this.getDay()+1)+"/"+this.getMonth()+"/"+this.getYear());
			
			// switch(tempMonth)
			// {
				// case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				// {
					// if (tempDay == 31)
					// {
						// tempDay = 1;
						// tempMonth = (tempMonth+1)%12;
						// if (tempMonth == 1) 
						// {
							// tempYear = tempYear +1;
						// }
					// }
					// else
					// {
						// tempDay = tempDay + 1;
					// }
				// }
				// break;
				
				// case 4: case 6: case 9: case 11:
				// {
					// if (tempDay == 30)
					// {
						// tempDay = 1;
						// tempMonth = (tempMonth+1)%12;
						
					// }
					// else
					// {
						// tempDay = tempDay + 1;
					// }
				// }
				// break;
				
				// case 2:
				// {
					
				// }
				
				
			// }
			// System.out.println("Tomorrow is "+tempDay+"/"+tempMonth+"/"+tempYear);
		// }
	   
	    // public String thisDay()
		// {
			// return "This date is  "+this.getDay()+"/"+this.getMonth()+"/"+this.getYear();
		// }
		
		
