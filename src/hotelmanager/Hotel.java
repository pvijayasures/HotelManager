/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanager;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author pvijayasures
 */
public final class Hotel {
    
    public  ArrayList<Stockwerke> stockwerke;
    public Stockwerke stockwerk;
    int i =1;
    int etage=1;
    public int anzahlStockwerke;
    
    public Hotel(int anzahlStockwerke) {

        
        Scanner eingabewert = new Scanner(System.in);
        int b;
        System.out.print("Wie viele Zimmer hat ein Stockwerk? ");
        b = eingabewert.nextInt();
                
        stockwerke = new ArrayList<>();
        this.anzahlStockwerke=anzahlStockwerke;
        while(i<=this.anzahlStockwerke){
            anzahlStockwerke();    
            stockwerk = new Stockwerke(b,this,etage);
            i++;
            stockwerke.add(stockwerk);
            etage+=1;
        } 
        System.out.println("Welche ZimmerNr suchen Sie?");
        sucheZimmer(eingabewert.nextInt());
        
    }
    
    public int gibanzahlStockwerke(){
    
        return this.anzahlStockwerke;
    }
    
    public void anzahlStockwerke(){
    
        System.out.println("Das "+(stockwerke.size()+1)+".Stockwerk"); 
    
    }
    
    public void sucheZimmer(int zimmerNr){
        boolean gefunden=false;
            
        for (Stockwerke stockwerke1 : stockwerke) {
            for (Zimmer zimmer : stockwerke1.getZimmer1()) {
               
                if(zimmer.gibZimmernr()==zimmerNr){
                     zimmer.gibInfo();
                     gefunden =true;
                }
            }
        }
        if(!gefunden){
            System.out.println("Diese Zimmernr. gibt es nicht.");        
        }        
    }
    
}