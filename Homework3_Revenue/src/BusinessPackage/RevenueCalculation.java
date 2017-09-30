/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ragha
 */
public class RevenueCalculation {
    
     public static void main(String[] args) {
          String csvFile = "details.csv";
        BufferedReader br = null;
        String line = "";
        String DELIMITER = ",";
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                   String[] tokens = line.split(DELIMITER);
               
                   Person person = new Person();
                   Seat seat = person.getSeat();
                   seat.setNumOfSeats(Integer.parseInt(tokens[2]));
                   seat.setNumOfAisle(Integer.parseInt(tokens[3]));
                   seat.setNumOfMiddle(Integer.parseInt(tokens[4]));
                   seat.setNumOfAisle(Integer.parseInt(tokens[5]));
                
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
     }

 