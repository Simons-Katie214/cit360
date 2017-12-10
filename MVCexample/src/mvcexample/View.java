
package mvcexample;

/**
 *
 * @author klsim
 */
public class View {
   
        // method called from the controller.
    public static void printKpopBandDetails(String BandName, int membersNum, String CompanyName, String SongName){
        System.out.println("Band Name: " + BandName);
        System.out.println("Number of Band Members: " + membersNum);
        System.out.println("Entertainment Company: " + CompanyName);
        System.out.println("Song Name: " + SongName);
       
        
    }
}
