package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
//        int [] heights = {3, 4 , 3, 1 , 5};
//
//        System.out.println(heightChecker(heights));
//        int [] studens = {1,1,1,0,0,1};
//        int [] sandwiches = {1,0,0,0,1,1};
//
//        System.out.println(countStudents(studens, sandwiches));
        String s = "   fly me   to   the moon  ";
        lengthOfLastWord(s);
    }
    public static int heightChecker(int [] heights){
        int [] arr = Arrays.copyOf(heights, heights.length);
             Arrays.sort(arr);
        int count = 0;
        for (int i = 0 ; i < arr.length; i++){
            if(arr[i] != heights[i]){
                count++;
            }
        }
        return count;
    }

    public static int countStudents(int[] students, int[] sandwiches) {
        if (students.length != sandwiches.length) {
            throw new RuntimeException();
        }
        for (int s : students) {
            if (s != 0 && s != 1) {
                throw new RuntimeException();
            }
        }
        for (int sw : sandwiches) {
            if (sw != 0 && sw != 1) {
                throw new RuntimeException();
            }
        }

        int ones = 0;
        int zeros = 0;

        for (int stud : students) {
            if (stud == 0) zeros++;
            else ones++;
        }

        for (int sandwich : sandwiches) {
            if (sandwich == 0) {
                if (zeros == 0) {
                    return ones;
                }
                zeros--;
            } else {  // if sandwich is of type1
                if (ones == 0) {  // if no student want a type1 sandwich
                    return zeros;
                }
                ones--;
            }
        }
        return 0;
    }

    public static int lengthOfLastWord(String s) {
        s = s.replaceAll("\\s\\s+", " ").trim();
        String [] arrStr = s.split(" ");

        String word = arrStr[arrStr.length - 1];
        return word.length();
    }

}