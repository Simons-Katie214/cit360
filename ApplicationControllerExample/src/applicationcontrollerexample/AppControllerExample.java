
package applicationcontrollerexample;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author klsim
 */
public class AppControllerExample {

public static void main (String[] args) {
        
        AppController app = new AppController();
	Scanner input = new Scanner(System.in);
        
        try {
        // Get Selection from user
                System.out.println("1) Firefly");
                System.out.println("2) Dollhouse");
                System.out.println("3) And Then There Were None");
                System.out.println("4) Chicago P.D.");
                System.out.println("5) Jamaica Inn");
                System.out.println("6) Helix");
                System.out.println("7) Scream");
                System.out.println("8) The Flash");
                System.out.println("9) This Is Us");
                System.out.println("10) GapDong");
                System.out.println("11) Goblin");
                System.out.println("12) Descendants Of The Sun");
                System.out.print("Which show would you like info on:");
                String show = input.nextLine();
                System.out.print("please enter the listing number of the show:");
				double listing = input.nextDouble();

                input.close();
            // Create HashMap that stores selection.
                HashMap selection = new HashMap();
                selection.put("Firefly", 1);
                selection.put("Dollhouse", 2);
                selection.put("And Then There Were None", 3);
                selection.put("Chicago P.D.", 4);
                selection.put("Jamaica Inn", 5);
                selection.put("Helix", 6);
                selection.put("Scream", 7);
                selection.put("The Flash", 8);
                selection.put("This Is Us", 9);
                selection.put("GabDong", 10);
                selection.put("Goblin", 11);
                selection.put("Descendants Of The Sun", 12);
                selection.put("listing", listing);
               
               app.processRequest(show, selection);


            } catch (Exception e) {
                System.out.println("Sorry that show and listing is invlaid, try again");
            }
    } 
    
}
