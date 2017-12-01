
package applicationcontrollerexample;

import java.util.Scanner;

public class ApplicationControllerExample {

    public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
            System.out.println("Choose a Show to get more info Firefly, Dollhouse, ThisIsUs, "
                + "ChicagoPD, JamaicaInn, Scream, Helix,AndThenThereWereNone, TheFlash, "
                + "GapDong, Goblin, DescendantsOfTheSun.");
            ApplicationController app = new ApplicationController();
            app.showRequest(input.next());
    }
    
}
