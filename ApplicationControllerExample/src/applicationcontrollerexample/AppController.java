
package applicationcontrollerexample;

import java.util.HashMap;

/**
 *
 * @author klsim
 */
class AppController {
 
    private HashMap<String,tvShow> showSort = new HashMap<String,tvShow>();
    
    public AppController(){
        showSort.put("Firefly", new Firefly());
        showSort.put("Dollhouse", new Dollhouse());
        showSort.put("This is Us", new ThisIsUs());
        showSort.put("Chicago P.D.", new ChicagoPD());
        showSort.put("Jamaica Inn", new JamaicaInn());
        showSort.put("Scream", new Scream());
        showSort.put("Helix", new Helix());
        showSort.put("And Then There Were None", new AndThenThereWereNone());
        showSort.put("The Flash", new TheFlash());
        showSort.put("GapDong", new GapDong());
        showSort.put("Goblin", new Goblin());
        showSort.put("Descedants Of The Sun", new DescendantsOfTheSun());
        
    }
    
    public  void processRequest(String show,HashMap selection)  {

        tvShow showName = showSort.get(show);
            showName.request(selection);
    }
}
