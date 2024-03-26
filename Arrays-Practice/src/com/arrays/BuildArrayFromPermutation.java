package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BuildArrayFromPermutation {
	public static void main(String[] args) {
		int[] arr = { 0, 2, 1, 3, 4 };
		int[] ans = new int[arr.length];
		int n = 5;
		String res1 = permutation(arr, ans);
		System.out.println(res1);
		String res2 = shuffleNumbers(n, ans);
		System.out.println(res2);
	}

	static String permutation(int[] arr, int[] ans) {
		int i;
		for (i = 0; i < arr.length; i++) {
			ans[i] = arr[arr[i]];
		}

		String res = Arrays.toString(ans);
		return res;

	}

	static String shuffleNumbers(int n, int[] ans) {
		List<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			b.add(i);
		}
		Collections.shuffle(b);
		for (int i = 0; i < n; i++) {
			ans[i] = b.get(i);
		}
		return Arrays.toString(ans);
	}
}
