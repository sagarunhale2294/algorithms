/** 
 * Copyright(c) 2018 sagarunhale2294@gmail.com
 * All rights reserved.
 */

package com.cs.algo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Sagar Unhale  #PassionateJavaDeveloper
 *
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[]={1,2,3,4,5,6,7};
		Scanner scanner=new Scanner(System.in);
		int noToBeSearch=Integer.parseInt(scanner.next());
		scanner.close();
		boolean result=binarySearch(array,noToBeSearch);
		if(result==true){
			System.out.println("Found");
		}else{
			System.out.println("Not Found");
		}
	}

	/**
	 * It will search element in given list by dividing list into two parts
	 * complexity: O(log n)
	 * @param array
	 * @param noToBeSearch number which is to be searched
	 * @return status(true/false) if its found or not 
	 */
	private static boolean binarySearch(int[] array, int noToBeSearch) {
		int low=0,high=array.length,mid=0;
		Arrays.sort(array);
		while(low<=high){
			mid=(low+high)/2;
			if(array[mid]==noToBeSearch){
				System.out.println("No Founds at "+mid);
				return true;
			}
			if(noToBeSearch<array[mid]){
				high=mid-1;
			}
			else if(noToBeSearch>array[mid]){
				low=mid+1;
			}
		}
		return false;
	}

}
