/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bocharov.com;

import Bocharov.com.sorts.*;
import Bocharov.threads.SortThread;



/**
 *
 * @author Дмитрий
 */
public class Start {
    public void start()
    {
        int[] mas={4,5,1,2,5,67,100};
        SortThread thread1=new SortThread(new BubbleSort(mas.clone()));
        SortThread thread2=new SortThread(new InsertionSort(mas.clone()));
        SortThread thread3=new SortThread(new SelectionSort(mas.clone()));
        SortThread thread4=new SortThread(new ShellSort(mas.clone()));
        thread1.run();
        thread2.run();
        thread3.run();
        thread4.run();
        
      
       
    }
    
}
