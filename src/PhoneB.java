import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.*;

public class PhoneB {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    };

    public void add(String name, Integer phoneNum) {
        ArrayList<Integer> tempPhone = find(name);
        if (tempPhone.isEmpty()){
            tempPhone.add(phoneNum);
            phoneBook.put(name, tempPhone);
        }
        else {
            if(!phoneBook.get(name).contains(phoneNum)){
                phoneBook.get(name).add(phoneNum);
            }
        }
    }


    public ArrayList<Integer> find(String name) {
        if (phoneBook.keySet().contains(name))
        {
            return phoneBook.get(name);
        }
        else {
            return new ArrayList<>();
        }
    }
    public TreeMap<String, ArrayList<Integer>> sorted (){

        TreeMap<String, ArrayList<Integer>> sort = new TreeMap<>();
        sort.putAll(phoneBook);
        return  sort;
    }
}