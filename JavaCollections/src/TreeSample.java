
import java.util.TreeSet;

/**
 *
 * @author klsim
 */
public class TreeSample {
 
    public static void main(String[] args){
        TreeSet travelTree = new TreeSet();
        travelTree.add("South Korea");
        travelTree.add("Japan");
        travelTree.add("China");
        travelTree.add("Thailand");
        travelTree.add("Russia");
        travelTree.add("Ireland");
        travelTree.add("Greece");
        travelTree.add("Iceland");
        travelTree.add("Finland");
        System.out.println();
        System.out.println("This is my travel bucket list");
        System.out.println("\t" + travelTree);
    
    }
}
