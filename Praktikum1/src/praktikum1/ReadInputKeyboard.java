/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author Auliya-Oni
 */
public class ReadInputKeyboard {
     public static void main(String[] args) {
       //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         Scanner sc = new Scanner(System.in);
         System.out.println("Masukan karakter apapun, [tekan keluar tekan `q`]: ");
         String input = null;
         do {
             try {
                 input=sc.nextLine();
                 System.out.println(input);
//                 input = (String) br.readLine();
//                 System.out.print("" + input);
             } catch (Exception ex) {
                 Logger.getLogger(ReadInputKeyboard.class.getName()).log(Level.SEVERE, null, ex);
             }
         } while (!input.equals("q"));
    }
}
