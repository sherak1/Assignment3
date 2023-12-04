package task2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SecondTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
    public void testEmptyStack() {
        MyStack stack = new MyStack();
        assertTrue(stack.isEmpty());
    }
	//push and pop
	@Test
    public void testPushAndPop() {
        MyStack stack = new MyStack();
        stack.push(35);
        assertFalse(stack.isEmpty());
        assertEquals(35, stack.pop());
        assertTrue(stack.isEmpty());
    }

}
