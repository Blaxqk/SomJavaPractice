package D6_03;

import java.util.Scanner;
import java.util.Stack;

/**
 * 【哪里错了？？】
 * Emacs计算器、后缀表达式
 * https://www.nowcoder.com/questionTerminal/1a92fbc771a54feb9eb5bd9b3ff2d0a9
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.next();
            }
            if(arr.length>=2){
                System.out.println(cal(arr));
            }else {
                System.out.println(arr[arr.length-1]);
            }

        }
    }
    public static int cal(String[] arr){
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
             if(arr[i].equals("+")){
                    res = stack.pop() + stack.pop();
                    stack.push(res);
                }else if(arr[i].equals("-")){
                    int a = stack.pop();
                    int b = stack.pop();
                    res = b-a;
                 stack.push(res);

             }else if(arr[i].equals("*")){
                    res = stack.pop() * stack.pop();
                 stack.push(res);

             }else if(arr[i].equals("/")){
                    int a = stack.pop();
                    int b = stack.pop();
                    if(b!=0){
                        res = b/a;
                        stack.push(res);
                    }else {
                        return 0;
                    }


             }else if(Integer.parseInt(arr[i])<=9 && Integer.parseInt(arr[i])>=0){
                 stack.push(Integer.parseInt(arr[i]));
             }
            }


        return stack.peek();
    }
}
