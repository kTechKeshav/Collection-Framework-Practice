package Assignments.assignment2;

import java.util.HashSet;
import java.util.Set;

public class Ques_1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        int[] arr = {4, 6, 8, 9, 4, 8};
        Set<Integer> ans = new HashSet<>();

        for(int e : arr){
            if(!set.contains(e))
                set.add(e);
            else{
                ans.add(e);
            }
        }

        System.out.println(ans);
    }
}
