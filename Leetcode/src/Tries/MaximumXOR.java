package Tries;

public class MaximumXOR {

    public int findMaximumXOR(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        TrieNodeXOR root = new TrieNodeXOR();
        for(int num: nums) {
            TrieNodeXOR curNode = root;
            for(int i = 31; i >= 0; i--) {
                int curBit = (num >>> i) & 1;
                if(curNode.childrenMap.get(curBit) == null) {
                    curNode.childrenMap.put(curBit, new TrieNodeXOR());
                }
                curNode = curNode.childrenMap.get(curBit);
            }
        }

        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            TrieNodeXOR curNode = root;
            int curSum = 0;
            for(int i = 31; i >= 0; i--) {
                int curBit = (num >>> i) & 1;
                if(curNode.childrenMap.get(curBit) != null) {
                    curSum += (1 << i);
                    curNode = curNode.childrenMap.get(curBit);
                } else {
                    curNode = curNode.childrenMap.get(curBit);
                }
            }
            max = Math.max(curSum, max);
        }
        return max;
    }
}
