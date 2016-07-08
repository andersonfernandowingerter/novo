package prova;

import java.util.ArrayList;

public class ExeProva1 {
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<Comida> Cesta = new ArrayList<Comida>();
         Bebida refri = new Bebida("refri",500.0,"seilaqueisso");
         Fruta maca = new Fruta("maça",10,2000);
         Cesta.add(maca);
         Cesta.add(refri);
            
        for(Comida obj : Cesta){
           System.out.println(obj);
        }
        
    }
    
}
