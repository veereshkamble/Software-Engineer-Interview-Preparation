package Stacks;


import java.util.HashMap;

public class CloneGraphDFS {


        private HashMap<Integer, UndirectedGraphNode> map = new HashMap<>();
        public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
            return clone(node);
        }

        private UndirectedGraphNode clone(UndirectedGraphNode node) {
            if (node == null) return null;

            if (map.containsKey(node.label)) {
                return map.get(node.label);
            }
            UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
            map.put(clone.label, clone);
            for (UndirectedGraphNode neighbor : node.neighbors) {
                clone.neighbors.add(clone(neighbor));
            }
            return clone;
        }

    public static void main(String[] args) {
        UndirectedGraphNode node1 = new UndirectedGraphNode(1);
        UndirectedGraphNode node2 = new UndirectedGraphNode(2);
        UndirectedGraphNode node3 = new UndirectedGraphNode( 3);

        node1.neighbors.add(node2);
        node1.neighbors.add(node3);

        node2.neighbors.add(node2);

        node3.neighbors.add(node3);
        CloneGraphDFS cloneGraphDFS = new CloneGraphDFS();
        System.out.println(cloneGraphDFS.cloneGraph(node1).label);

    }

}
