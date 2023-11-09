package cz.educanet.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BSTDepthTest {

    @Test
    public void should_Return_Depth() {
        BinarySearchTree<Integer> bst = new BSTNode<>(10);
        Assertions.assertEquals(1, bst.depth());
        bst.insert(5);
        bst.insert(15);
        bst.insert(100);
        Assertions.assertEquals(3, bst.depth());
        bst.insert(4);
        bst.insert(3);
        bst.insert(2);
        Assertions.assertEquals(5, bst.depth());
    }
}