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
public class TheFlash implements tvShow {

    public void request(HashMap selection)  {
	try {
            double listing = (double) selection.get("listing");
            System.out.println("The Flash is a superhero tv series on CW based in the DC Universe. This series"
                + "has run for 4 seasons, and still going strong. This show does a great job of portraying "
                + "the character. This show follows Barry Allen, who gets struck by lightning and develops"
                + "super powers, super speed to be exact, and uses it to fight crime in his city."
                + "Barry Allen aka. The Flash, was introduced in the TV Series Arrow, which is also a character"
                + "in the DC Comics Universe."
                + "Fun show and great representation of the character for fans of the comic hero's.");
        
            }catch (Exception e){
                e.printStackTrace();
                }
    }
    
}
