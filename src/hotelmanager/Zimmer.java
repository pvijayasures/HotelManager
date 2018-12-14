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
public class Zimmer {
    private final int zimmerNummer;
    private int groesseZimmer;
    private int preisProquadratmeter;
    private int endPreis;
    private Random rnd;
    
    
    
    public Zimmer(int zimmerNummer) {
        this.zimmerNummer=zimmerNummer;
        this.preisProquadratmeter=5;
        rnd=new Random();
        do{            
            groesseZimmer = rnd.nextInt(50);
        }while(groesseZimmer <= 20);
        endPreis=preisProquadratmeter*groesseZimmer;
    }

    
    public int gibZimmernr(){
    
        return zimmerNummer;
    
    }
    
    public int gibZimmerGroesse(){
    
        return this.groesseZimmer;
        
    }
    
    public void gibInfo(){
    
        System.out.println(
                "ZimmerNr."+ gibZimmernr()+ "\t"+
                "Zimmergrösse: " +gibZimmerGroesse()+" m2\t"+
                "Endpreis: "+endPreis+"Fr.");
    }
    
}
