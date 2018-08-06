package Queues;

import java.util.*;

public class OpenTheLock {

    public int openLock(String[] deadends, String target) {
        Queue<String> queue = new LinkedList<>();
        Set<String> deads = new HashSet<>(Arrays.asList(deadends));
        Set<String> visited = new HashSet<>();

        queue.offer("0000");
        visited.add("0000");
        int level = 0;

        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size > 0) {
                String s = queue.poll();
                if(deads.contains(s)) {
                    size--;
                    continue;
                }
                if(s.equals(target)) {
                    return level;
                }

                StringBuilder sb = new StringBuilder(s);
                for(int i = 0; i < 4; i++) {
                    char c = sb.charAt(i);
                    String s1 = sb.substring(0, i) + (c == '9' ? 0 : c - '0' + 1) + sb.substring(i+1);
                    String s2 = sb.substring(0, i) + (c == '0' ? 9 : c - '0' - 1) + sb.substring(i+1);

                    if(!visited.contains(s1) && !deads.contains(s1)) {
                        queue.offer(s1);
                        visited.add(s1);
                    }

                }
            }
        }
    }
}
