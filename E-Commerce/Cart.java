import java.util.*;
class Cart{
    List<Electronics>electronics=new ArrayList<>();
    List<Clothing>clothes=new ArrayList<>();
    void addElectronics(Electronics e){
        electronics.add(e);
    }
    void addClothing(Clothing c){
        clothes.add(c);
    }
    void showElectronics(){
        for(Electronics e:electronics){
            System.out.println(e.toString());
            e.price();
            System.out.println();
        }
    }
     void showClothing(){
        for(Clothing c:clothes){
            System.out.println(c.toString());
            c.price();
            System.out.println();
        }
    }
}