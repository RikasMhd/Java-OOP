class Clothing extends Product{
    Clothing(String name,int qty,double amount){
        super(name,qty,amount);
    }
    @Override
    void price(){
        double dis;
        amount*=qty;
        if(amount>=15000){
            dis =amount*0.25;
            amount-=dis;
            System.out.println("Discount :Rs."+dis+" , After Discount Price :Rs."+amount);
        }
        else if(amount<15000 && amount>=8000){
            dis=amount*0.18 ;
            amount-=dis;
            System.out.println("Discount :Rs."+dis+" , After Discount Price :Rs."+amount);
        }
        else if(amount<8000 && amount>=4000) {
            dis=amount*0.12;
            amount-=dis;
            System.out.println("Discount :Rs."+dis+" , After Discount Price :Rs."+amount);
        }
        else{
            dis=0 ;
            amount-=dis;
            System.out.println("Discount :Rs."+dis+" , After Discount Price :Rs."+amount);
        }
        
    }
    @Override
    public String toString(){
        return super.toString();
    }
    /*public static void main(String[] args) {
        Clothing e=new Clothing("Dress",2,1200);
        System.out.println(e.toString()+"\n");
        e.price();
        
    }*/
    
}
