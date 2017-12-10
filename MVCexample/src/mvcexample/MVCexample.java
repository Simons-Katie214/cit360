package mvcexample;

/**
 *
 * @author klsim
 */
public class MVCexample {
public static void main(String[] args) {
  
        Model model = retrieveBandInfo();
        View view = new View();
        Controller controller = new Controller(model, view);

        // Display model. Calls method in view with controller.
        controller.updateView();

        // Update data in model
        controller.setBandName("BigBang");
        controller.setMembersNum(5);
        controller.setCompanyName("YG Entertainment");
        controller.setSongName("Monster");

        // Display model.
        controller.updateView();

        // Update data in model 
        controller.setBandName("Speed");
        controller.setMembersNum(6);
        controller.setCompanyName("MBK Entertainment");
        controller.setSongName("Dont't Tease Me");

        // Display model. 
        controller.updateView();
    }

    // Initial model
    private static Model retrieveBandInfo(){
        Model Band = new Model();

        // Set initial values to model
        Band.setBandName("Day6");
        Band.setMembersNum(6);
        Band.setCompanyName("JYP Entertainmetn");
        Band.setSongName("Congratulations");

        return Band;
    }

}
