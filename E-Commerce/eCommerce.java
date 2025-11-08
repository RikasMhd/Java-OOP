class eCommerce{
    public static void main(String [] args){
        Cart cart=new Cart();

        Electronics e1=new Electronics("Iron Box",1,2000);
        Electronics e2=new Electronics("Kettle",2,2320);

        Clothing c1=new Clothing("Saree", 3, 3000);
        Clothing c2=new Clothing("Cotton", 4, 1000);

        cart.addElectronics(e1);
        cart.addElectronics(e2);
        
        cart.addClothing(c1);
        cart.addClothing(c2);

        cart.showElectronics();
        System.out.println("");
        cart.showClothing();
    }
}
