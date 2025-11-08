abstract class Product {
    String name;
    int qty;
    double amount;
    Product(String name,int qty,double amount){
        this.name=name;
        this.qty=qty;
        this.amount=amount;
    }
    String getName(){
        return this.name;
    }
    int getQty(){
        return this.qty;
    }
    double getAmount(){
        return this.amount;
    }
    @Override
    public String toString(){
        return "Product Name : "+getName()+"\nQty : "+getQty()+"\nAmount (Before Discount) :Rs."+getAmount()*getQty();
    }
    abstract void price();
}
