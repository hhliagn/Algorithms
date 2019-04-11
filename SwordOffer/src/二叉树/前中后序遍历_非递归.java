package 二叉树;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class 前中后序遍历_非递归 {

    static class TreeNode{
        Integer val;
        TreeNode left;
        TreeNode right;
    }

    //非递归前序遍历
    //前序：根-左-右
    public List<Integer> preOrder(TreeNode root) {

        List<Integer> ret=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()){

            TreeNode node = stack.pop();

            if (node==null){
                continue;
            }

            ret.add(node.val);

            stack.push(node.right);
            stack.push(node.left);
        }

        return ret;
    }


    //非递归后序遍历
    //后序：左-右-根  ==  根-右-左 的反转 (类比前序)
    public List<Integer> postOrder(TreeNode root) {

        List<Integer> ret=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()){

            TreeNode node = stack.pop();

            if (node==null){
                continue;
            }

            ret.add(node.val);

            stack.push(node.left);
            stack.push(node.right);
        }

        Collections.reverse(ret);  //反转List
        return ret;
    }
}
