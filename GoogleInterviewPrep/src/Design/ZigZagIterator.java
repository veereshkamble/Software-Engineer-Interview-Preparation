package Design;

import java.util.Iterator;
import java.util.List;

public class ZigZagIterator {

    Iterator<Integer> iFirst;
    Iterator<Integer> iSecond;
    boolean first;

    public ZigZagIterator(List<Integer> v1, List<Integer> v2) {
        iFirst = v1.iterator();
        iSecond = v2.iterator();
        first = true; // please always do null checks
    }

    public boolean hasNext() {
        return iFirst.hasNext() || iSecond.hasNext();
    }

    public int next() {
        int toReturn = 0;
        if (first) {
            toReturn = iFirst.next();
        } else {
            toReturn = iSecond.next();
        }
        if (!iFirst.hasNext()) {
            first = false;
        } else if (!iSecond.hasNext()) {
            first = true;
        } else {
            first = !first;
        }
        return toReturn;
    }
}
