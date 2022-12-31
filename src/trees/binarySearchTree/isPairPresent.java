package trees.binarySearchTree;

import java.util.HashSet;
import java.util.Set;

public class isPairPresent {
    Set<Integer> set = new HashSet<>();

    public boolean util(Node root, int sum, Set<Integer> set) {
        if (root == null) return false;
        if (util(root.left, sum, set) == true) {
            return true;
        }
        if (set.contains(sum - root.data)) {
            return true;
        }
        set.add(root.data);
        return util(root.right, sum, set);
    }

}
