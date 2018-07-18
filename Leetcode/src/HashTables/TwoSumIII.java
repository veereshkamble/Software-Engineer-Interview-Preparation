package HashTables;
import java.util.*;

public class TwoSumIII {
    Set<Integer> sum;
    Set<Integer> num;

    /** Initialize your data structure here. */
    public TwoSumIII() {
        sum = new HashSet<Integer>();
        num = new HashSet<Integer>();
    }

    /** Add the number to an internal data structure.. */
    public void add(int number) {
        if(num.contains(number)){
            sum.add(number * 2);
        }else{
            Iterator<Integer> iter = num.iterator();
            while(iter.hasNext()){
                sum.add(iter.next() + number);
            }
            num.add(number);
        }
    }
}
