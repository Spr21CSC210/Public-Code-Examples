import java.util.ArrayList;
import java.util.List;

/*
 * A small example demonstrating some of the syntax related to arrays and lists.
 * 
 * Arrays rely on [] operators (as well as some methods). Lists rely purely on
 * methods, no brackets! The API is shown below.
 * List API - https://docs.oracle.com/javase/8/docs/api/java/util/List.html
 */

public class ListArraySyntax {

    public static void main(String[] args) {
     // Array
        String[] names = new String[5];            
        names[0] = "Jessica";                      
        String s = names[0];                        
        for (int i = 0; i < names.length; i++) {    
            if (names[i].startsWith("B")) {
                methodExample(42, true);
            }
        } 
        
        
        // List          
        List<String> list = new ArrayList<String>();
        list.add("Jessica");                            
        String str = list.get(0);                           
        for (int i = 0; i < list.size(); i++) {       
            if (list.get(i).startsWith("B")) {
                methodExample(3, false);
            }
        }
    }

    /*
     * An example of a method.
     * 
     * 'public static' you can copy and paste this part for now. We will start
     * to use different terms here in the future
     * 
     * 'void' this method has no return value, so we write void here.
     * 
     * 'methodExample' is the method name. It should start with a lowercase
     * letter and be in camelCase.
     * 
     * Two parameters which are specified with a type and a name.
     */
    public static void methodExample(int x, boolean y) {

    }

}
