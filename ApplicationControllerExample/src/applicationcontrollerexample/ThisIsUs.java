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
public class ThisIsUs implements tvShow {

    public void request(HashMap selection)  {
	try {
            double listing = (double) selection.get("listing");
            System.out.println("This is Us is a new show airing on NBC. So far it's run for two seasons, with"
                + "the hope that it will last for many more. "
                + "This show is a refreshing new series in that it follows the lives of 3 individuals and "
                + "the people in their lives. This show is unique in that it faces real life challenges that"
                + "everyone can relate to, hard and not always pleasant issues in life, but that's what makes it"
                + "so appealing and touching. Real issues that real everyday people face. Here's to hoping it lasts!");
        
            }catch (Exception e){
                e.printStackTrace();
                }
    }
    
}
