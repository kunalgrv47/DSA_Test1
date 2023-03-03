package dsaTest1;

import java.util.Arrays;

public class MaxPriceOfApp {
	
	public static int finalPrice(int arr[]) {
		
		Arrays.sort(arr);
		int maxProfit = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			maxProfit = Math.max(maxProfit, arr[i]*(arr.length-i));
		}
		return maxProfit;
		
//		int maxProfit = 0;
//		for(int i=0; i<arr.length; i++) {
//			int tempPrice = arr[i];
//			int count = 0;
//			for(int j=0; j<arr.length; j++) {
//				if(tempPrice<=arr[j]) {
//					count++;
//				}
//			}
//			int profit = tempPrice*count;
//			maxProfit = Math.max(profit, maxProfit);
//			
//			
//		}
//		return maxProfit;
	}

	public static void main(String[] args) {
		int listOfBudget [] = {34,78,90,15,67};
		System.out.println(finalPrice(listOfBudget));

	}

}
