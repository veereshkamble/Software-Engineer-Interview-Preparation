package Stacks;
import java.util.*;

public class CloneGraphBFS {

        public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
            if (node == null) return null;

            UndirectedGraphNode newNode = new UndirectedGraphNode(node.label); //new node for return
            HashMap<Integer, UndirectedGraphNode> map = new HashMap(); //store visited nodes

            map.put(newNode.label, newNode); //add first node to HashMap

            LinkedList<UndirectedGraphNode> queue = new LinkedList(); //to store **original** nodes need to be visited
            queue.add(node); //add first **original** node to queue

            while (!queue.isEmpty()) { //if more nodes need to be visited
                UndirectedGraphNode n = queue.pop(); //search first node in the queue
                for (UndirectedGraphNode neighbor : n.neighbors) {
                    if (!map.containsKey(neighbor.label)) { //add to map and queue if this node hasn't been searched before
                        map.put(neighbor.label, new UndirectedGraphNode(neighbor.label));
                        queue.add(neighbor);
                    }
                    map.get(n.label).neighbors.add(map.get(neighbor.label)); //add neighbor to new created nodes
                }
            }

            return newNode;
        }

        public static void main(String[] args) {
            UndirectedGraphNode node1 = new UndirectedGraphNode(1);
            UndirectedGraphNode node2 = new UndirectedGraphNode(2);
            UndirectedGraphNode node3 = new UndirectedGraphNode( 3);

            node1.neighbors.add(node2);
            node1.neighbors.add(node3);

            node2.neighbors.add(node2);

            node3.neighbors.add(node3);
            CloneGraphBFS cloneGraphBFS = new CloneGraphBFS();
            System.out.println(cloneGraphBFS.cloneGraph(node1).label);

        }

}
