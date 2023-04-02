package lab7.fel2;

import java.util.Iterator;

class TestStack {
   public static void main(String[] args) {
      Stack<String> myStack = new Stack<String>();
      myStack.push("Jane");
      myStack.push("John");
      myStack.push("Bill");

      Iterator itr = myStack.iterator();
      while (itr.hasNext()) {
         String item = (String)itr.next();
         System.out.print(item + " ");
      }

      System.out.println("");
      
      for (String s : myStack) {
         System.out.print(s + " ");
      }
      System.out.println("");
   }
}