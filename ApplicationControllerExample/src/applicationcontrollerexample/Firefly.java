/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontrollerexample;

import java.util.HashMap;

/**
 *
 * @author klsim
 */
public class Firefly implements tvShow {
	
    public void request(HashMap selection)  {
	try {
            double listing = (double) selection.get("listing");
            System.out.println("Firefly is a Sci-fi futuristic tv show combining space travel with a Western feel,"
                + "created by Joss Whedon."
                + "Firefly was a FOX network show that lasted for only one season before being"
                + "cancelled by the Network. In the short time it was on air it became a hit and developed "
                + "a cult following. Unhappy with the cancellation of the show, the fans of Firefly demanded "
                + "a renewal of the show, which never happened, but it sparked a full length feature film called "
                + "Serenity, which completed the story the TV Show started.");
        
            }catch (Exception e){
                e.printStackTrace();
                }
    }
    
}
