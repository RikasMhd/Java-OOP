class Restaurant{
	String name;
	Menu menu = new Menu();//composition
	public Restaurant(String name){
		this.name = name;
	}
}