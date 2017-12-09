
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author klsim
 */
public class MapExample {

    public static void main(String[] args){
    	Map bandMap = new HashMap();
    	bandMap.put("BigBang", "1");
    	bandMap.put("Winner", "2");
    	bandMap.put("BAP", "3");
    	bandMap.put("CNBlue", "4");
    	bandMap.put("EXO", "5");
    	bandMap.put("FT Island", "6");
        bandMap.put("Mobb", "7");
        bandMap.put("BTS", "8");
    	System.out.println("These are some Bands I enjoy, shown with HashMap.");
    	System.out.println("\t" + bandMap);
		
	/* remove deletes the item */
	bandMap.remove("Mobb");
	System.out.println("\t" + bandMap);
		
	/* put enables you to add to the list or change the value */
	bandMap.put("f(x)", "20");
	System.out.println("\t" + bandMap);
    }
}
