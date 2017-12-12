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
public class JamaicaInn implements tvShow {

    public void request(HashMap selection)  {
	try {
            double listing = (double) selection.get("listing");
            System.out.println("Jamaica Inn is a murder mystery based on the novel of the same name by"
                + "Daphne Du Maurier. "
                + "The story is about a young woman moves in with her aunt and uncle after her mother "
                + "dies and discovers mysterious and unsavory happenings in her new home, the Inn run by "
                + "her aunt and uncle. It follows the young woman as she encounters situations that make "
                + "her question her standards and pushed the bounds of her comfort zone."
                + "This show is a simple and fun show with a bit of thrill to it");
        
            }catch (Exception e){
                e.printStackTrace();
                }
    }
    
}
