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
public class ChicagoPD implements tvShow {

    public void request(HashMap selection)  {
	try {
            double listing = (double) selection.get("listing");
            	System.out.println("Chicago PD is a spin off series from Chicago Fire. Chicago Fire follows"
                + "the a firehouse and the firefighters that work there. In that show we are first"
                + "introduced to the characters in Chicago PD. "
                + "Chicago PD follows the Intelligence unit, which is made up of a wide range of "
                + "different types of detectives, lead by Voight. The show is based and filmed in Chicago, "
                + "and is very intense and fast paced and can be violent."
                + "Two more Chicago Spin off shows have been created, Chicago Med and Chicago Justice. The fun"
                + "thing about all theses spin offs is that the story lines cross over and intertwine with the other"
                + "shows, so it's best to watch them them in order for when the story lines do cross. Begin with"
                + "Chicago Fire, then Chicago PD, followed by Chicago Med, and finally Chicago Justice.");
        
            }catch (Exception e){
                e.printStackTrace();
                }
    }
    
}
