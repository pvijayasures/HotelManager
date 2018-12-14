/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanager;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author pvijayasures
 */
public class Stockwerke {

    private Random rnd;
    private final ArrayList<Zimmer> zimmer1;
    int[] liste = {100,200,300,400};
    Hotel hotel;
    Zimmer zimmer2;
    private int etage;
    
    public Stockwerke(int anzahlZimmer, Hotel hotel,int etage){
        
        
        int i=1;
        this.etage=etage;
        this.hotel=hotel;
        zimmer1= new ArrayList<>();
        while(anzahlZimmer>=i){        
            
            zimmer2 = new Zimmer(etage*100+i);
 
            zimmer1.add(zimmer2);
            zimmer2.gibInfo();
            i++;
        }
    }
    
//    public void zeigeZimmerNr(){
//        for(Zimmer zimmer:zimmer1){
//            System.out.println(zimmer.gibZimmernr());
//        
//        }
//    
//    }

    public ArrayList<Zimmer> getZimmer1() {
        return zimmer1;
    }
    
    
}
    
