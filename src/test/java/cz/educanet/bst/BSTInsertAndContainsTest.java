package cz.educanet.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BSTInsertAndContainsTest {
    @Test
    public void should_ReturnTrueWhenBSTContainsElement() {
        List<Integer> list = new ArrayList<>(Arrays.asList(20, 30, 25, 1, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 11, 19, 90));

        BinarySearchTree<Integer> bst = new BSTNode<>(10);

        Assertions.assertTrue(bst.contains(10));

        for (Integer i : list) {
            bst.insert(i);
        }

        for (Integer i : list) {
            Assertions.assertTrue(bst.contains(i));
        }

        for (Integer i : list2) {
            Assertions.assertFalse(bst.contains(i));
        }
    }
}
