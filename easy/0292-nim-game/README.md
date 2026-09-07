# Nim Game

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are playing the following Nim Game with your friend:


	Initially, there is a heap of stones on the table.
	You and your friend will alternate taking turns, and you go first.
	On each turn, the person whose turn it is will remove 1 to 3 stones from the heap.
	The one who removes the last stone is the winner.


Given n, the number of stones in the heap, return true if you can win the game assuming both you and your friend play optimally, otherwise return false.

 
Example 1:

Input: n = 4
Output: false
Explanation: These are the possible outcomes:
1. You remove 1 stone. Your friend removes 3 stones, including the last stone. Your friend wins.
2. You remove 2 stones. Your friend removes 2 stones, including the last stone. Your friend wins.
3. You remove 3 stones. Your friend removes the last stone. Your friend wins.
In all outcomes, your friend wins.


Example 2:

Input: n = 1
Output: true


Example 3:

Input: n = 2
Output: true


 
Constraints:


	1 <= n <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.2 MB  
**Submitted:** 2026-09-05T02:22:57.322Z  

```java
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int l = nums.length;
        int[] max = new int[l];
        int[] min = new int[l];
        int m = nums[0];
        for(int i = 0; i < l; i++) 
        {
            m = Math.max(m, nums[i]);
            max[i] = m;
        }
        int n = nums[l - 1];
        for(int i = l - 1; i >= 0; i--)
        {
            n = Math.min(n, nums[i]);
            min[i] = n;
        }
        int res=-1,com=Integer.MAX_VALUE;
        for(int i = 0; i < l; i++) 
        {
            if(max[i] - min[i] <= k&&i<com)
            {
                com=i;
                res=i;
            }       
        }
        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/nim-game/)