/*
输入描述:
给定一个字符串S，请检查该字符串的括号是否配对，只含有"[", "]", "(", ")"

输出描述:
配对，返回true
不配对，返回false
示例1
输入
abcd(])[efg
输出
false
*/
package lianxi0629;

import java.util.Scanner;
import java.util.Stack;

public class Test0629 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '['){
                stack.push(str.charAt(i));
            }else if(str.charAt(i) == ')' ){
                if( !stack.empty() && stack.peek() == '(' ){
                    stack.pop();
                }else{
                    System.out.println(false);
                    return ;
                }
            }else if(str.charAt(i) == ']'){
                if(!stack.empty() && stack.peek() == '['){
                    stack.pop();
                }else{
                    System.out.println(false);
                    return ;
                }
            }
        }
        System.out.println(stack.empty());
    }
}
