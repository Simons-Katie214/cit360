
package mvcexample;

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author klsim
 */
public class Controller {

    private Model model;
    private View view;

    // The model and view are passed from Main.
    public Controller(Model passedModel, View passedView){
        this.model = passedModel;
        this.view = passedView;
    }

    // String passed to method from main. Passes to model.
    public void setBandName(String BandName){
        model.setBandName(BandName);
    }

    // Int passed to method from main. Passes to model.
    public void setMembersNum(int level){
        model.setMembersNum(level);
    }

    // String passed to method from main. Passes to model.
    public void setCompanyName(String CompanyName){
        model.setCompanyName(CompanyName);
    }  
    
    // String passed to method from main. Passes to model.
    public void setSongName(String SongName){
        model.setSongName(SongName);
    }
    
    
    // This method is called from Main. Parameters retrieved from the model are passed to the view.
    public void updateView(){
        view.printKpopBandDetails(model.getBandName(), model.getMembersNum(), model.getCompanyName(), model.getSongName());
    }

}
