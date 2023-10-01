package com.unittests.asignment10;

import com.unittests.asignment10.qn2.IArrayFlattenerService;

public class ArrayReversor {
	
	private IArrayFlattenerService arrayFlattenerService;
	
	public ArrayReversor(IArrayFlattenerService arrayFlattenerService) {
		this.arrayFlattenerService = arrayFlattenerService;
	}
	
	
	public int[] reverseArray(int [][] a) {
		for(int k=0;k<a.length;k++) {
			if(a.length== 0 || a[k].length==0) {
				return null;
			}
		}
		int[] reverse= arrayFlattenerService.flattenArray(a);
		int[] result = new int[reverse.length];
		int j=0;
		for(int i=reverse.length-1; i>=0;i--) {
			result[j] = reverse[i];
			j++;
		}
		return result;
	}

}
