class Electronics extends Product{
    Electronics(String name,int qty,double amount){
        super(name,qty,amount);
    }
    @Override
    void price(){
        double dis;
        amount*=qty;
        if(amount>=8500){
            dis =amount*0.25;
            amount-=dis;
            System.out.println("Discount :Rs."+dis+" , After Discount Price :Rs."+amount);
        }
        else if(amount<8500 && amount>=2500){
            dis=amount*0.18 ;
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

   /*  public static void main(String[] args) {
        Electronics e=new Electronics("Owen",2,500);
        System.out.println(e.toString()+"\n");
        e.price();
    }*/
}
