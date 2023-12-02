package StackAndQueue.ex3;

import java.util.Arrays;

public class MyStackClient {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        System.out.println(stack.isEmpty());
        int[] arrs = {3, 6, 1, 7, 5};
        for(int i = 0 ; i < arrs.length; i++){
            stack.push(arrs[i]);
        }


        int [] newArrs = new int[stack.size()];
        while (!stack.isEmpty()){
            for(int i = 0; i < newArrs.length; i++){
                newArrs[i] = stack.pop();
            }
        }

        System.out.println(Arrays.toString(newArrs));
    }
}
