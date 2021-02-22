package com.tesfai.stack.array;

public class Main{
    public static void main(String[] args){
    	StackArray<String> stack = new StackArray<>();
        
        stack.push("first");
        stack.push("second");
        stack.push("third");
        stack.push("forth");
         
        System.out.println(stack);
         
        System.out.println("1. "+ stack.pop() );
        System.out.println("2. "+  stack.pop() );
        System.out.println("3. "+  stack.peek() );
        System.out.println("4. "+ stack.pop() );
        System.out.println("5. "+ stack.peek() );
        
        System.out.println( stack );
    }
}
