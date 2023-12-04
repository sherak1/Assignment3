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
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEmptyTree() {
		MyTree tree = new MyTree();
		assertTrue(tree.isEmpty());
	}

	@Test
	public void testAddValue() {
		MyTree tree = new MyTree();
		tree.addValue(5);
		assertFalse(tree.isEmpty());
		assertTrue(tree.contains(5));
	}

	 @Test
	    public void testRemoveValue() {
	        MyTree tree = new MyTree();
	        tree.addValue(5);
	        assertTrue(tree.contains(5));
	        tree.removeValue(5);
	        assertFalse(tree.contains(5));
	    }
	
	
	
	
}
