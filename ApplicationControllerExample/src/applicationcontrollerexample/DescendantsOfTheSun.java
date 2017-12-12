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
public class DescendantsOfTheSun implements tvShow {

    public void request(HashMap selection)  {
	try {
            double listing = (double) selection.get("listing");
            System.out.println("Descendants of the Sun is another Korean Drama about a Doctor and a Special"
                + "Forces Soldier who meet and develop feeling for one another, but their different career"
                + "choices prove to be a challenge in their developing relationship. Through random events they"
                + "meet again and are given another chance at their relationship and are given opportunities "
                + "to have their views and beliefs expanded as they see first hand the importance of one another's"
                + "work."
                + "This show also has subtitles, but is well worth the watch.");
        
            }catch (Exception e){
                e.printStackTrace();
                }
    }
    
}
