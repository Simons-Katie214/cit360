/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 *
 * @author ksimons
 */
public class TimeforYourExecution {
    
public static void main(String[] args) throws InterruptedException {
    
    ExecutorService executorExample = Executors.newFixedThreadPool(3);
        for(int i = 1; i<=10; i++){
        executorExample.execute(new Runnable(){
        
        public void run(){
        try {
            System.out.println("Music 1");
            Thread.currentThread().sleep(650);
            System.out.println("Music 2");
            Thread.currentThread().sleep(650);
            }catch (InterruptedException e){
            System.out.println("Oops We Got Interuppted.");
                } 
        System.out.println("You've reached the end");
                }
            });
        }
    }   
}
