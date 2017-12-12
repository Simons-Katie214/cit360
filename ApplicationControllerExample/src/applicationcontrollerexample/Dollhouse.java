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
public class Dollhouse implements tvShow {
    
    public void request(HashMap selection)  {
	try {
            double listing = (double) selection.get("listing");
            System.out.println("Dollhouse is another Sci-fi TV series created by Joss Whedon."
                + "This show lasted for 2 seasons, but was another great show that was cut short."
                + "This show is about a company that erases peoples Identities and imprints them with"
                + "temporary personalities/identities that they need in order to fulfill the assignments"
                + "of the clients who ordered them. One young women starts to regain her core identity and "
                + "tries to take down the compnay imprinting them from the inside.");
        
        }catch (Exception e){
            e.printStackTrace();
        }
    }   
}
