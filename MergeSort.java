/** 
 * Copyright(c) 2018 sagarunhale2294@gmail.com
 * All rights reserved.
 */
package com.cs.algo;

/**
 * @author Sagar Unhale  #PassionateJavaDeveloper
 *
 */
public class MergeSort {

	/**
	 * Call for sorting elements using Merge Sort
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={1,5,11,8,3,6};
		int sortedArray[]=domerge(a);
		for(int value:sortedArray){
			System.out.println(value);
		}
	}

	/**
	 * This method divide the array into single value
	 * @param array
	 * @return divided array
	 */
	private static int[] domerge(int[] array) {
		if(array.length<=1){
			return array;
		}
		int mid=array.length/2;
		int left[]=new int[mid];
		int right[]=new int[array.length-mid];
		for(int leftcount=0;leftcount<mid;leftcount++){
			left[leftcount]=array[leftcount];
		}
		for(int rightcount=0;rightcount<(array.length-mid);rightcount++){
			right[rightcount]=array[rightcount+mid];
		}
		return merge(domerge(left),domerge(right));
	}

	/**
	 * This will conquer the divided array into single array
	 * @param left
	 * @param right
	 * @return sorted array
	 */
	private static int[] merge(int[] left, int[] right) {
		int mergedArray[]=new int[left.length+right.length];
		int leftcount=0,rightcount=0,mergecount=0;
		while(leftcount<left.length && rightcount<right.length){
			if(left[leftcount]<right[rightcount]){
				mergedArray[mergecount]=left[leftcount];
				leftcount++;
				mergecount++;
			}
			else{
				mergedArray[mergecount]=right[rightcount];
				rightcount++;
				mergecount++;
			}
		}
		while(leftcount<left.length){
			mergedArray[mergecount]=left[leftcount];
			leftcount++;
			mergecount++;
		}
		while(rightcount<right.length){
			mergedArray[mergecount]=right[rightcount];
			rightcount++;
			mergecount++;
		}
		return mergedArray;
	}

}
