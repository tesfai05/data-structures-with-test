package com.tesfai.stack.linkedlist;

public class Main{
    public static void main(String[] args){
    	StackLinkedList<String> stack = new StackLinkedList<>();
        
        stack.push("ab");
        stack.push("cd");
        stack.push("ef");
        stack.push("gh");
         
        System.out.println(stack);
         
        System.out.println("1. "+ stack.pop() );
        System.out.println("2. "+  stack.pop() );
        System.out.println("3. "+  stack.peek() );
        System.out.println("4. "+ stack.pop() );
        System.out.println("5. "+ stack.peek() );
        System.out.println("6. "+ stack.contains("ab") );
        System.out.println("7. "+ stack.contains("gh") );
        
        System.out.println( stack );
    }
}
