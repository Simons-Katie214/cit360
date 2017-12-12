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
public class AndThenThereWereNone implements tvShow {

    public void request(HashMap selection)  {
	try {
            double listing = (double) selection.get("listing");
            System.out.println("And Then There Were None (2015) is an Agatha Christie murder mystery novel that was "
                + "adapted for TV and made into a mini-series. "
                + "This series follows 10 strangers that all invited by a mysterious host to a private and"
                + "isolated island, for various reasons. Once there people begin dying one by one. The remaining"
                + "survivors race to find out who the killer is before they become the next victim."
                + "There was an adaptation of this novel in 1945, however this review is on the 2015 adaptation."
                + "This series was very well done, and was very intense and exciting. A great watch for those"
                + "wanting a thrilling and nerve wracking time.");
        
            }catch (Exception e){
                e.printStackTrace();
                }
    }
    
}
