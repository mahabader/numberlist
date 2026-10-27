
package numberlist;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class NumberList {
public static void addNumbers(List<? super Number> list){
    list.add(30);
    list.add(40.5);


}
    
    public static void main(String[] args) {
        List<Object> myList = new ArrayList<>(Arrays.asList(10,20.5));
        
        System.out.println("List before adding: "+ myList);

        addNumbers(myList);
        
        System.out.println("List after adding: "+ myList);
        
    }
    
}
