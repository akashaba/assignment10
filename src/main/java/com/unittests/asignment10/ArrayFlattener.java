package com.unittests.asignment10;

public class ArrayFlattener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] flattenArray(int[][] a) {
		for(int i=0;i<a.length;i++) {
		if(a.length== 0 || a[i].length==0) {
			return null;
		}
		}
		
		int totalElements = 0;
        
        // Calculate the total number of elements in the 2D array
        for (int[] subArray : a) {
            totalElements += subArray.length;
        }

        // Create a new 1D array with the total number of elements
        int[] resultArray = new int[totalElements];

        int index = 0;

        // Iterate through the 2D array and add elements to the result array
        for (int[] subArray : a) {
            for (int element : subArray) {
                resultArray[index++] = element;
            }
        }

		return resultArray;
	}

}
