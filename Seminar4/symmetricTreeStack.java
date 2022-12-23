// Учитывая rootдвоичное дерево, проверьте, является ли оно зеркалом самого себя (т. Е. Симметричным вокруг его центра).
// Input: root = [1,2,2,3,4,4,3]
// Output: true

package Seminar4;

import java.util.*;

public class symmetricTreeStack {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);

        while (!stack.isEmpty()) {
            TreeNode l = stack.pop();
            TreeNode r = stack.pop();

            if (r == null && l == null) {
                continue;
            }

            if (l == null || r == null || l.val != r.val) {
                return false;
            }
            stack.push(l.left);
            stack.push(r.right);
            
            stack.push(l.right);
            stack.push(r.left);
        }
        return stack.isEmpty();
    }
}
