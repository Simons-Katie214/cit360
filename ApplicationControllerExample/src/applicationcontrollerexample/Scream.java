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
public class Scream implements tvShow {

    public void request(HashMap selection)  {
	try {
            double listing = (double) selection.get("listing");
            System.out.println("Scream is a fairly new TV show on MTV. loosely based on the Scream Movie. Its run"
                + "for two seasons so far with season three coming out in the future."
                + "The premise of the show is that of a young girl and her friends who are targeted by a masked"
                + "killer, whose motives are unknown. Just who the killer is is also an ever evolving mystery"
                + "from season to season. A fun show for fans of slashers and horror shows that's not as bloody and gruesome as the"
                + "movies, since it's modified for TV. ");
        
            }catch (Exception e){
                e.printStackTrace();
                }
    }
    
}
