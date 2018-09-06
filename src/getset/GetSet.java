/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getset;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author pudakdigitan
 */
public class GetSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person();
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String dateInString = "01-09-2018";

        try {

            Date date = formatter.parse(dateInString);
            int usia =  p.hitungUsiaHari(date);
            System.out.println(usia + " Hari");
            

        } catch (ParseException e) {
            e.printStackTrace();
        }

        
        // TODO code application logic here
    }
    
}
