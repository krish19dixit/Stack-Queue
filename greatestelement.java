import java.util.Stack;

public class greatestelement {
    public static void main(String[] args) {

    }

    // public int[] greatestelement(int[] nums) {
    // Stack<Long> st = new Stack<>();
    // int n = nums.length;
    // int[] result = new int[n];
    // for (int i = n - 1; i >= 0; i--) {
    // while (!st.isEmpty() && st.peek() <= nums[i]) {
    // st.pop();
    // }
    // if(st.isEmpty()){
    // result[i]=-1;
    // }else{
    // result[i]=st.peek();
    // }
    // st.push(nums[i]);
    // }
    // return result;
    // }
    // time complexity is O(N)
    public int[] greatestelement(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        // start from end of array and compare element with peek of stack peek;
        for (int i = nums.length - 1; i >= 0; i--) {
            // if empty, no next greater element
            if (!st.isEmpty()) {
                result[i] = -1;
                st.push(nums[i]);
            }
            // if top of the stack is greater ,then it is the next greatest
            if (st.peek() > nums[i]) {
                result[i] = st.peek();
                st.push(nums[i]);
            }
            // remove all smaller then element
            while (st.peek() <= nums[i] && !st.isEmpty()) {
                st.pop();
            }
            // reach to particular point where peek element is greater the current elemnt
            if (st.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = st.peek();
                st.push(nums[i]);
            }
        }
        return result;

    }
}
