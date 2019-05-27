/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prof958
 */
public class treeDrafter {

  
    public static void main(String[] args) {

        draw();

    }
    
    
    public static void draw() {
        for (int i = 0; i < 4; i++) {             //Rows
            for (int j = 0; j < 10 - i; j++)     //Spaces
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");        //Stars
            System.out.println();
        }
    }
    
}
