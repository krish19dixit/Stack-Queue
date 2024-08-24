import java.util.Arrays;
import java.util.Stack;
public class QueueUsingStackRemove {
    static int QueueUsingStackRemove(int x,int[]a,int[]b){
        return QueueUsingStackRemove(x,a,b,0,0)-1;
    }
    private static int QueueUsingStackRemove(int x, int[]a,int[]b,int sum,int count){
        if(sum>x){
            return count;
        }
        if(a.length==0 || b.length==0){
            return count;
        }
        int ans1=QueueUsingStackRemove(x,Arrays.copyOfRange(a,1,a.length), sum+a[0], count+1));
        int ans2=QueueUsingStackRemove(x, a,Arrays.copyOfRange(b,1,b.length), sum+b[0], count+1));
        return Math.max(ans1,ans2);
    }
}
