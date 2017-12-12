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
public class Goblin implements tvShow {

    public void request(HashMap selection)  {
	try {
            double listing = (double) selection.get("listing");
            System.out.println("Goblin The Lonely and Great God is a Korean Fantasy Drama based on Korean Folklore."
                + "This show premiered December of 2016 and still a year later is holding steady as a top contender"
                + "in their TV charts."
                + "This story is about a man who, through certain events, was cursed and turned into an Immortal"
                + "Goblin, the only way for his immortality to end and for him to rest in peace is for him to find is Bride."
                + "The story follows the Goblin and other mythical beings and the humans who enter their long unending"
                + "lives, and shows how they change theses immortals."
                + "This was a fun and addictive show, again worth the watch if you are up for reading subtitles. Even those"
                + "who aren't fans of K-dramas, who watched this show raved about it. Highly recommended.");
        
            }catch (Exception e){
                e.printStackTrace();
                }
    }
    
}
