
import java.util.*;
/**
 *
 * @author klsim
 */
public class ListExample {
    
    public static void main(String[] args) { 
        List firstList = new ArrayList<>();
            firstList.add("BigBang");
            firstList.add("Epik Hight");
            firstList.add("EXO");
            firstList.add("BTS");
            firstList.add("Winner");
            firstList.add("FT Island");
            firstList.add("f(x)");
            System.out.println();
            System.out.println("Here's an array list of some Band names");
            System.out.println("\t" + firstList);
		
            firstList.add("CNBlue");
            System.out.println("Added the band CNBlue");
            System.out.println("\t" + firstList);
		
            firstList.remove("f(x)");
            System.out.println("Subtracted f(x) from list of Bands");
            System.out.println("\t" + firstList);
		
            Iterator iterator = firstList.iterator();
            while(iterator.hasNext()) {
            	String myString = (String) iterator.next();
                System.out.println(myString);
            }
            
            
        List secondList = new LinkedList<>();            
            secondList.add("G-Dragon");
            secondList.add("Tablo");
            secondList.add("Xumin");
            secondList.add("Suga");
            secondList.add("Minho");
            secondList.add("HongKi");
            secondList.add("Amber");
            System.out.println();
            System.out.println("These are some pretty GIRL names! (Using an ArrayList)");
            System.out.println("\t" + secondList);
		
            secondList.add("YoungHwa");
            System.out.println("Added the name YoungHwa");
            System.out.println("\t" + secondList);
		
            firstList.remove("Suga");
            System.out.println("Subtracted the name Suga");
            System.out.println("\t" + secondList);
		
            Iterator secondIterator = secondList.iterator();
            while(secondIterator.hasNext()) {
            	String myString = (String) secondIterator.next();
                System.out.println(myString);
            }            
    }
}
