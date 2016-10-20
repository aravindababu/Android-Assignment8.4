/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vowels;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aravind.Babu
 */
public class Vowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        //Creating a File Object and Adding the path to the text File i have created
        File file = new File("C:\\Users\\Aravind.Babu\\Desktop\\\\Vowels.txt");

        //Creating a scanner object to read from file
        Scanner S1 = new Scanner(file);
        
        //Creating the content String
        String Content = " ";
        
        //Reading from the file
        while(S1.hasNext()){
            Content += S1.next() +"";
        }
        
        //Close the file
        S1.close();
        
        //Converting the string from the file to character Array
        char[] Array = Content.toCharArray();
        
        //looping through every character in the counter
        int loop = 0;
        for(char c : Array){
            
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y')
                loop++;
        }
        System.out.println("Number of Vowels : "+loop);

    }
}
