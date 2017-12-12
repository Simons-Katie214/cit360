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
public class GapDong implements tvShow {

    public void request(HashMap selection)  {
	try {
            double listing = (double) selection.get("listing");
            System.out.println("Gap Dong is a Korean Crime Drama about a serial Killer that prowled"
                + "the city of Iltan but was never caught. Years later, the statue of limitations "
                + "on the case has past, but the original detective and a new young detective whose life was "
                + "changed when Gap dong was on the prowl, believe the Gap Dong serial killer is still"
                + "out there. When new evidence about the Gap Dong killer shows up they being to work to find"
                + "the killer."
                + "It's a slow moving show at times but exciting and worth the watch if you're up for reading "
                + "subtitles.");
        
            }catch (Exception e){
                e.printStackTrace();
                }
    }
    
}
