import java.util.Stack;

import javax.management.loading.PrivateClassLoader;

public class leetcode232{
    public static void main(String[] args) {
        
    }
    class MyQueue {

        private Stack<Integer> first;
        private Stack<Integer> second;
        public MyQueue() {
            first=new Stack<>();
            second=new Stack<>();
        }
        
        public void push(int x) {
           first.push(x);
            
        }
        
        public int pop() {
            while(!first.isEmpty()){
                // put it in second
                second.push(first.pop());
            }
            int remove=second.pop();
            while(!second.isEmpty()){
                first.push(second.push());
            }
        }
        
        public int peek() throws Exception {
            while(!first.isEmpty()){
                // put it in second
                second.push(first.pop());
            }
            int peeked=second.peek();
            while(!second.isEmpty()){
                first.push(second.push());
            }
            return peeked;
            
        }
        
        public boolean empty() {
            return first.isEmpty();
        }
    }
}