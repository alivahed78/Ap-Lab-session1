/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkprime;

import java.util.Scanner;

/**
 *
 * @author Ali
 */
public class Checkprime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int a, b, gcd = 1;
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();
        
        int min, max;
        min = a;
        if (min > b)
        {
            min = b;
            max = a;
        }
        else
        {
            min = a;
            max = b;
        }
        while (max > min)
        {
            int r = max % min;
            if (r == 0)
            {
                gcd = min;
                break;
            }
            else
            {
                max = min;
                min = r;
            }
        }
        if (gcd == 1)
        {
            System.out.println("nesbat be ham aval hastand");
        }
        else
        {
            System.out.println("nesbat be ham aval nistand");
        
    }
    
}
}
