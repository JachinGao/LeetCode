package com.example.p173;

import com.example.base.TreeNode;
import org.junit.Before;
import org.junit.Test;

public class BSTIteratorTest {

    private BSTIterator bstIterator;

    @Before
    public void setUp() {
        TreeNode n3 = new TreeNode(3);
        TreeNode n9 = new TreeNode(9);
        TreeNode n20 = new TreeNode(20);
        TreeNode n15 = new TreeNode(15, n9, n20);
        TreeNode n7 = new TreeNode(7, n3, n15);


        bstIterator = new BSTIterator(n7);

    }

    @Test
    public void output() {
        while (bstIterator.hasNext()){
            int var = bstIterator.next();
            System.out.println(var);
        }
    }
}