/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jadvalzarb;

/**
 *
 * @author Ali
 */
public class Jadvalzarb {

    public static void multitable(int satr , int sotun){
        
        for(int i =1 ; i <= satr ; i++){
            for (int j = 1; j <= sotun; j++) {
                System.out.printf("  %3d ",i*j);
            }
            
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        multitable(10,10);
    }
    
}
