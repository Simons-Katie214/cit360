
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author klsim
 */
public class SetExample {
    
    public static void main(String[] args){
    
        Set songSet = new LinkedHashSet();
        songSet.add("Sing for the Day");
        songSet.add("Lorelei");
        songSet.add("Desert Moon");
        songSet.add("Mr. Roboto");
        songSet.add("Come Sail Away");
        songSet.add("Castle Walls");
        songSet.add("Best of Times");
        songSet.add("Grand Illusion");
        songSet.add("Don't Let It End");
        System.out.println();
        System.out.println("Songs by Styx shown using SET");
        System.out.println("\t" + songSet);
        
     		
        System.out.println("removed Mr. Roboto from list");
	songSet.remove("Mr. Roboto");
	System.out.println("\t" + songSet);
		
	System.out.println("Added Lady to song list");
	songSet.add("Lady");
	System.out.println("\t" + songSet);
		
	Iterator iterator = songSet.iterator();
	while(iterator.hasNext()) {
	String myString = (String) iterator.next();
	System.out.println(myString);
	}   
    }
    
}
