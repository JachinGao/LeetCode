package com.example.p173;

import com.example.base.TreeNode;

import java.util.Stack;


public class BSTIterator {
    private final Stack<TreeNode> stack = new Stack<>();
    private TreeNode curNode;

    public BSTIterator(TreeNode root) {
        curNode = root;
    }

    public int next() {
        while (curNode != null) {
            stack.push(curNode);
            curNode = curNode.left;
        }
        TreeNode node = stack.pop();
        curNode = node.right;
        return node.val;
    }

    public boolean hasNext() {
        return curNode != null || !stack.isEmpty();
    }
}