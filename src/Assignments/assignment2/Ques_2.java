package Assignments.assignment2;

import java.util.HashSet;
import java.util.Set;

public class Ques_2 {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 7, 2, 4};
        int[] arr2 = {8, 4, 2, 7, 5};

        Set<Integer> set = new HashSet<>();
        for(int e : arr1){
            set.add(e);
        }
        Set<Integer> ans = new HashSet<>();
        for(int e : arr2){
            if(set.contains(e)){
                ans.add(e);
            }
        }
        System.out.println(ans);
    }
}
