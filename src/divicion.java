
import java.util.*;
public class divicion {
    
 
   divicion() throws SantiagoException{
        
       this.dividir(0);
       
   }
    
   public void dividir(int x) throws SantiagoException{
       int r ;
       
       if(x==0){
           throw new SantiagoException("error");
       }else{
           r = 5/x;
       }
   }
   }

