package com.unittests.asignment10;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.unittests.asignment10.qn2.IArrayFlattenerService;

public class ArrayReversorTest {
	
	private ArrayReversor arrayReversor;
	
	private IArrayFlattenerService arrayFlattenerService = mock(IArrayFlattenerService.class);

	@Before
	public void setUp() throws Exception {
		this.arrayReversor = new ArrayReversor(arrayFlattenerService); 
	}

	@After
	public void tearDown() throws Exception {
		this.arrayReversor = null;
	}

	@Test
	public void testReverseArray() {
		when(arrayFlattenerService.flattenArray(new int[][] {{1,3},{0},{4,5,9}}))
		.thenReturn(new int [] {1,3,0,4,5,9});
		
		int[] reverse = arrayReversor.reverseArray(new int[][]{{1,3},{0},{4,5,9}});
		int[] actual = new int[] {9,5,4,0,3,1};
		
		assertArrayEquals(reverse, actual);
		}
	@Test
	public void testFlattenArrayNull() {
		int[] actual = arrayReversor.reverseArray(new int[][]{{1,3},{},{4,5,9}});
		int[] expected = null;
		assertArrayEquals(expected, actual);
	}

}
