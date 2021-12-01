package com.raven.farewell.transactionalTest.algorithm;

public class Solution {
	public static int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return 1;
		}
		int index = 0;
		int beforeLen = nums.length;
		for (int i = 1; i < beforeLen; i++) {
			if (nums[i] != nums[index]) {
				nums[++index] = nums[i];
			}
		}
		return index + 1;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 3 };
		int len = removeDuplicates(nums);
		for (int i = 0; i < len; i++) {
			System.out.println(nums[i]);
		}
	}
}
