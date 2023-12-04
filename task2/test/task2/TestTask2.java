/**
 * 
 */
package task2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */
public class TestTask2 {
    MyTree tree;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		tree = new MyTree();

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEmptyTree() {
		//MyTree tree = new MyTree();
		assertTrue(tree.isEmpty());
	}

	@Test
	public void testAddValue() {
		tree.addValue(5);
		assertFalse(tree.isEmpty());
		assertTrue(tree.contains(5));
	}

	 @Test
	    public void testRemoveValue() {
	        tree.addValue(5);
	        assertTrue(tree.contains(5));
	        tree.removeValue(5);
	        assertFalse(tree.contains(5));
	    }
	 
	 @Test
	    public void testTreeContainsValue() {
	        tree.addValue(10);
	        assertTrue(tree.contains2(10));
	        assertFalse(tree.contains2(20));
	    }

	  @Test
	    public void testIsSorted() {
	        tree.addValue(10);
	        tree.addValue(5);
	        tree.addValue(15);
	        assertTrue(tree.isSorted());
	    }
	
	
	
}
