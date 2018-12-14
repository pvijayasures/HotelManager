/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanager;
import java.util.Scanner;

/**
 *
 * @author pvijayasures
 */
public class HotelManager {
   
       public static void main(String[] args) {
           int i;
           Scanner eingabewert = new Scanner(System.in);
        System.out.print("Wie viele Stockwerke hat das Hotel?");
        i = eingabewert.nextInt();
        Hotel hotel1 = new Hotel(i);
  

        
    }   
}
