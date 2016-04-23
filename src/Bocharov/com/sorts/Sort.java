/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bocharov.com.sorts;

/**
 *
 * @author Дмитрий
 */
public abstract class Sort 
{ 
   protected int[] mas;
   public abstract void sort();

    public Sort(int[] mas) {
        this.mas = mas;
    }
   public void outArray()
   {
       for (int a:mas)System.out.print(a+" ");
       System.out.println();
   }
  
          
}
