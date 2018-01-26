import java.util.ArrayList;
import java.util.List; //This is actually an interface and not a class
import java.util.Scanner;
import java.lang.Integer;
/**
 * Write a description of class WordList here.
 *
 * @author Robert McCloskey
 * @version 1.21.18
 */
public class WordList
{
    private ArrayList<String> myList;

    public WordList(){
        myList = new ArrayList<String>();
        myList.add("cat");
        myList.add("mouse");
        myList.add("frog");
        myList.add("dog");
        myList.add("dog");
    }

    public int numWordsOfLength(int len){
        int length = 0;
        for (String i: myList){
            if (i.length() == len){
                length++;
            }
        }
        return length;
    }

    public void removeWordsOfLength(int len){
        for (int i = myList.size() - 1; i >= 0; i--){
            if (myList.get(i).length() == len){
                myList.remove(myList.get(i));
            }
        }
    }
}
