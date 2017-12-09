/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ksimons
 */
public class OnTheRun {

public static void main(String args[]) {
     
    List firstOne = new List("Favorites List");
    firstOne.start();
    firstOne.run();
        
    List secondOne = new List("Not Favorites List");
    secondOne.start();
    }   
}

class List implements Runnable {
    private Thread thread;
    private String Music;
    
    List( String name){
        Music = name;
     }
    
    public void run() {
        System.out.println("Running My " + Music);
        try {
            for(int i = 1; i <= 6; i++){
                System.out.println(Music + ", Music " + i);
                Thread.sleep(650);
            }
        }catch (InterruptedException e){
            System.out.println(Music + " Oops, we got interuppted.");
        } 
        System.out.println("Thats Enough for now....");
    }
 
    public void start ()
    {
        System.out.println("here is my " + Music );
        if (thread == null){
            thread = new Thread (this, Music);
            thread.start ();
            
        }
        
    }    
}
