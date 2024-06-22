// Question.java
import java.util.*;

public class Question {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> listRev = new ArrayList<String>();

        list.add("Alice");
        list.add("Bob");
        list.add("Chris");
        list.add("Diana");
        list.add("Elen");

        System.out.println(list.get(2));

        System.out.println(list.size());

        System.out.println("<list>");
        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("<listRev>");
        for(int i = list.size()-1;i>=0;i--){
            String s =list.get(i);
            listRev.add(s);
        }
        for (String name : listRev) {
            System.out.println(name);
        }
    }
}