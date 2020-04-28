package WarmUps;

import java.util.ArrayList;

public class combine_two_String_arrays_into_one_arrayList {
    public static void main(String[] args) {
/*
arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */
        String[]arr1 = {"A", "B", "C"};
        String[]arr2 ={"D", "E", "F", "G"};
        ArrayList<String>list=new ArrayList<>();
        for(String each:arr1){
            list.add(each);
        }
        for (String e:arr2){
            list.add(e);
        }
        System.out.println(list);
    }
}
