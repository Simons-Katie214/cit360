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
public class Helix implements tvShow {

    public void request(HashMap selection)  {
	try {
            double listing = (double) selection.get("listing");
            System.out.println("Helix is a Sci-fi tv series that lasted for two seasons. The premise of the show"
                + "follows a group of Scientists that are sent to a secluded international research facility"
                + "isolated in the Arctic, to investigate the possible outbreak of a strange and unknown disease."
                + "They mystery of the disease and the research facility unfold in an intense and thrilling manner"
                + "as the show gets further and further in. Season 1 set a high standard and was exciting. Season 2"
                + "in comparison was more slow paced and boring, and at times confusing, giving it a very choppy feeling"
                + "moving from one season to the next. Which may be one of the reasons there was no season 3.");
        
            }catch (Exception e){
                e.printStackTrace();
                }
    }
    
}
