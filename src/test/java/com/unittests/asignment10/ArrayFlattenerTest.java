package com.unittests.asignment10;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayFlattenerTest {
	private ArrayFlattener arrayFlattener;

	@Before
	public void setUp() throws Exception {
		this.arrayFlattener = new ArrayFlattener();
	}

	@After
	public void tearDown() throws Exception {
		this.arrayFlattener = null;
	}

	@Test
	public void testFlattenArray() {
		int[] actual = arrayFlattener.flattenArray(new int[][]{{1,3},{0},{4,5,9}});
		int[] expected = new int[] {1,3,0,4,5,9};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testFlattenArrayNull() {
		int[] actual = arrayFlattener.flattenArray(new int[][]{{1,3},{},{4,5,9}});
		int[] expected = null;
		assertArrayEquals(expected, actual);
	}

}
