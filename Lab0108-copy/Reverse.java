import java.util.*;
/**
 * Reverses a list without destroying persistent data
 *
 * @author Tal Dickman
 * @version 8 January 2020
 */
public class Reverse
{
    public Reverse(){

    }

    public static ArrayList<String> reverseList(ArrayList<String> list){
        ArrayList<String> newlist = new ArrayList<String>();
        for(int i = 0; i<list.size(); i++){
            newlist.add(list.get(list.size() - i - 1));
        }
        return newlist;
    }
    
    public static void printArr(ArrayList<String> arr){
        System.out.print("[");
        for(String p : arr){
            System.out.print(p + "  ");
        }
        System.out.println("]");
    }
    
    public static String[] reverseArr(String[] list){
        String[] newlist = new String[list.length];
        for(int i = 0; i<list.length; i++){
            newlist[i] = list[list.length - i - 1];
        }
        return newlist;
    }
    
    public static void printArr(String[] arr){
        System.out.print("[");
        for(String p : arr){
            System.out.print(p + "  ");
        }
        System.out.println("]");
    }
    
    public static void main(){
        ArrayList<String> arrlist = new ArrayList<String>();
        arrlist.add("aa");
        arrlist.add("bb");
        arrlist.add("cc");
        arrlist.add("dd");
        arrlist.add("ee");
        String[] strlist = new String[5];
        strlist[0] = "11";
        strlist[1] = "22";
        strlist[2] = "33";
        strlist[3] = "44";
        strlist[4] = "55";
        System.out.println();
        printArr(arrlist);
        printArr(reverseList(arrlist));
        printArr(strlist);
        printArr(reverseArr(strlist));
    }

    
}
