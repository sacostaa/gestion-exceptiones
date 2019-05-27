import java.util.*;
public class main {
    
    public static void main(String[] args) {
        divicion d = null;
        try{
            d = new divicion();
        }catch(SantiagoException e){
            System.out.println("divicion por 0 Saa");
        }
        System.out.println("rr");
        
        int r = 0;
        try{
        for (int i = 0; i < 10; i++) {
            
                r= i/0;
                System.out.println(" r");
        }
            }catch(ArithmeticException p){
                System.out.println("division por 0 segundo caso");
            }
            
        }
    }
    

