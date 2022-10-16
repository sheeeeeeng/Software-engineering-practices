import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AVLtreeTest {
	
	@Test
	void AvlNode_check_Coverage_byCoverage() {
		AvlNode st=new AvlNode();
	}
	
	@Test
	void isEmpty_given_non_empty_tree_expectedfortrue_and_check_coverage_byPartition() {
		//give
		AvlTree avlTree = new AvlTree();
		
		//when
		avlTree.insert(5);
		
		//then
		assertFalse(avlTree.isEmpty());
	}
	
	@Test
	void isEmpty_given_empty_tree_expectedfortrue_and_check_coverage_byPartition() {
		//give
		AvlTree avlTree = new AvlTree();
		
		//then
		assertTrue(avlTree.isEmpty());
	}
	
	@Test
	void makeEmpty_give_non_empty_stree_after_makeEmpty_expected_isEmpty_return_true_and_check_Coverage_byPartition() {
		//give
		AvlTree avlTree = new AvlTree();
		
		//when
		avlTree.insert(5);
		avlTree.makeEmpty();
		
		//then
		assertTrue(avlTree.isEmpty());
	}
	
	@Test
	void insert_make_rotation_try_543_567_534_576_four_combine_insert_into_tree_byCoverage() {
		//give
		AvlTree avlTree = new AvlTree();
		avlTree.insert(5);
		avlTree.insert(4);
		avlTree.insert(3);
		avlTree.makeEmpty();
		//give
		avlTree.insert(5);
		avlTree.insert(6);
		avlTree.insert(7);
		avlTree.makeEmpty();
		//give
		avlTree.insert(5);
		avlTree.insert(3);
		avlTree.insert(4);
		avlTree.makeEmpty();
		//give
		avlTree.insert(5);
		avlTree.insert(7);
		avlTree.insert(6);
		avlTree.makeEmpty();
	}
	
	@Test
	void insert_test_LL_rotation_given_543_insert_into_tree_expected_preorder_ouput_435_byPartition() {
		//give
		AvlTree avlTree = new AvlTree();
		//when
		avlTree.insert(5);
		avlTree.insert(4);
		avlTree.insert(3);
		//then
		assertEquals("4 3 5",avlTree.preorder());
		//AVL tree will change as follows 
		//        5            4
		//    4          =>3        5
		//3              
	}
	
	@Test
	void insert_test_LR_rotation_given_534_insert_into_tree_expected_preorder_ouput_345_byPartition() {
		//give
		AvlTree avlTree = new AvlTree();
		//when
		avlTree.insert(5);
		avlTree.insert(3);
		avlTree.insert(4);
		//then
		assertEquals("4 3 5",avlTree.preorder());
		//AVL tree will change as follows 
		//          5            4
		//    3          =>  3        5
		//        4
	}
	
	@Test
	void insert_test_RR_rotation_given_345_insert_into_tree_expected_preorder_ouput_435_byPartition() {
		//give
		AvlTree avlTree = new AvlTree();
		//when
		avlTree.insert(3);
		avlTree.insert(4);
		avlTree.insert(5);
		//then
		assertEquals("4 3 5",avlTree.preorder());
		//AVL tree will change as follows 
		//3                    4
		//    4          =>3        5
		//        5
	}
	
	@Test
	void insert_test_RL_rotation_given_354_insert_into_tree_expected_preorder_ouput_534_byPartition() {
		//give
		AvlTree avlTree = new AvlTree();
		//when
		avlTree.insert(3);
		avlTree.insert(5);
		avlTree.insert(4);
		//then
		assertEquals("4 3 5",avlTree.preorder());
		//AVL tree will change as follows 
		//3                      4
		//      5          =>3        5
		//  4        
	}
	
	@Test
	void countNode_inster_1_node_expect_return_1_and_check_Coverage_byPartition() {
		//give
		AvlTree avlTree = new AvlTree();
		//when
		avlTree.insert(5);
		//then
		assertEquals(1,avlTree.countNodes());
		
	}
	
	@Test
	void search_insert_468_into_tree_try_to_search_4_and_8_expect_true_and_check_Coverage_byPartition() {
		//give
		AvlTree avlTree = new AvlTree();
		//when
		avlTree.insert(4);
		avlTree.insert(6);
		avlTree.insert(8);
		//then
		assertTrue(avlTree.search(4));
		assertTrue(avlTree.search(8));
	}
	
	@Test
	void inorder_give_468_insert_into_tree_expect_output_equal_468_and_check_Coverage_byPartition() {
		//give
		AvlTree avlTree = new AvlTree();
		//when
		avlTree.insert(4);
		avlTree.insert(6);
		avlTree.insert(8);
		//then
		assertEquals("4 6 8",avlTree.inorder());
	}
	
	@Test
	void preorder_give_468_insert_into_tree_expect_output_equal_648_and_check_Coverage_byPartition() {
		//give
		AvlTree avlTree = new AvlTree();
		//when
		avlTree.insert(4);
		avlTree.insert(6);
		avlTree.insert(8);
		//then
		assertEquals("6 4 8",avlTree.preorder());
	}
	
	@Test
	void preorder_give_468_insert_into_tree_expect_output_equal_486_and_check_Coverage_byPartition() {
		//give
		AvlTree avlTree = new AvlTree();
		//when
		avlTree.insert(4);
		avlTree.insert(6);
		avlTree.insert(8);
		//then
		assertEquals("4 8 6",avlTree.postorder());
	}
	
	@Test
	void insert_give_2_same_value_node_expect_ignore_1_byNegative() {
		//give
		AvlTree avlTree = new AvlTree();
		//when
		avlTree.insert(4);
		avlTree.insert(4);
		//then
		assertEquals("4",avlTree.preorder());
	}
	
	@Test
	void search_test_search_value_in_empty_tree_expect_returnfalse_byNegative() {
		//give
		AvlTree avlTree = new AvlTree();
		//then
		assertFalse(avlTree.search(4));
	}
	
	@Test
	void search_test_search_not_exist_value_in_tree_expect_returnfalse_byBoundary() {
		//give
		AvlTree avlTree = new AvlTree();
		//when
		avlTree.insert(4);
		avlTree.insert(5);
		avlTree.insert(6);
		//then
		assertFalse(avlTree.search(7));
	}
	
	@Test
	void countNodes_test_count_empty_tree_expect_return0_byBoundary() {
		//give
		AvlTree avlTree = new AvlTree();
		//then
		assertEquals(0,avlTree.countNodes());
	}
	
	@Test
	void inorder_test_output_empty_tree_inorder_expect_return_empty_string_byBoundary() {
		//give
		AvlTree avlTree = new AvlTree();
		//then
		assertEquals("",avlTree.inorder());
	}
	
	@Test
	void preorder_test_output_empty_tree_inorder_expect_return_empty_string_byBoundary() {
		//give
		AvlTree avlTree = new AvlTree();
		//then
		assertEquals("",avlTree.preorder());
	}
	
	@Test
	void postorder_test_output_empty_tree_inorder_expect_return_empty_string_byBoundary() {
		//give
		AvlTree avlTree = new AvlTree();
		//then
		assertEquals("",avlTree.postorder());
	}
}
