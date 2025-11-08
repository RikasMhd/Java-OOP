public class LoyaltyCard{
	public enum Tier{NONE,SILVER,GOLD}
	private Tier tier;
	private boolean iced;
	
	public LoyaltyCard(Tier tier){
		this.tier=tier;
	}
	
	private double tierMultiplier(){
		switch(tier){
			case SILVER : return 0.05;
			case GOLD : return 0.10;
			default : return 0.0;
			
		}
	}
	@Override
	public String toString(){
		return "Loyal Card { "+"tier = "+tier+"}";
	}
}