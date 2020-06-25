/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclestarter;

import java.util.Random;

/**
 * Starter code for Vehicle application. 
 * This class displays sample output to the console.
 * @author AUTHORNAME
 */
public class VehicleStarter {

    /** Main entry point to the program
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Vehicle[] list = new Vehicle[10];
        Vehicle v = new Vehicle(
                "Holden",
                "Commodore",
                2014,
        "1 ABD 760",
                100294.0,
                20);
        list[0] = v;
        list[1] = v;
        list[2] = v;

		// Vehicle sample distance
        v.addFuel(new Random().nextDouble()*10, 1.3);

        list[0].printDetails();
        System.out.println("\n\n");
        list[1].printDetails();
        System.out.println("\n\n");
        list[2].printDetails();


    }
    
}
