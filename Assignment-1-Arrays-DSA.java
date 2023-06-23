Assignment 1 Questions & solutions - Arrays | DSA

Q1.  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example:
Input: nums = [2,7,11,15], target = 9
Output0 [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1][

Solution:-    

Approach :

Now I will share two approaches to solving this question :
1. Brute Force Method
In this approach I will iterate the array using two loops to find if the sum is equal to the target.for(int i=0;i<nums.size()-1;i++)
{
    for(int j = i+1;j<nums.size();j++)
        {
          if(nums[i]+nums[j]==target)
          ...
        }
}Time Complexity - O(n*n)
Space Complexity - O(1) 
2. Using Hashmap
In this approach I will use hashmap and a vector to return the index of the elements if the target is found by addition of two elements.Time Complexity - O(n) because I will tarverse the array only once and Hasmap has a time compelexity of O(1) for insertion. 
Space Complexity - O(1) Code is as follows :class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int>ans;                  
        unordered_map<int,int>m;
        
        for(int i=0;i<nums.size();i++)    
        {
            int val = target-nums[i];
            if(m.find(val)!=m.end()) 
            {
                ans.push_back(m.find(val)->second);
                ans.push_back(i);
                break;
            }
            m.insert(pair<int,int>(nums[i],i)); 
        }
        return ans;
    }
};

Q2.  Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

-Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
- Return k.
Example :
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation:Your function should return k = 2, with the first two elements of nums being 2. It does not matter what you leave beyond the returned k (hence they are underscores)[

Solution:-    
                 solution with an example:
Suppose, we have given following an nums array and val.
  index=0   1   2  3
  nums=3    2    2  3
  val= 3
  Now we have to remove all element which contain value: 3 from nums.
1.	We are starting to transverse given array, if element contains value which is same as given val, then we skip it.
 index=0   1   2  3
  nums=3    2    2  3
  val= 3
  i=0;
  count=0;
  for(inti=0;i<nums.length;i++){
        if(nums[i]==val){
            continue;
         }
        nums[count]=nums[i];
        count+=1
       }
}

2. Here, nums[0] → 3 and val → 3, both value are matching so, we are skipping below steps.
index=  0 1 2 3
nums=   3 2 2 3 
val=3
i=0
count=0
   for(inti=0;i<nums.length;i++){
        if(nums[i]==val){
            continue;
         }
        nums[count]=nums[i];
        count+=1
       }
}
3. Now we are moving forward with i = 1 case, here, nums[1] → 2and val → 3, both value are not matching.
 index=  0 1 2 3
nums=   3 2 2 3 
val=3
i=1;
count=0;
for(inti=0;i<nums.length;i++){
    if(nums[i]==val){
        continue;
     }
    nums[count]=nums[i];
    count+=1
   }
}
4. So we are going to replace num’s 0th index (as count → 0) value (which is 3) with num’s 1st index value (which is 2), so result will be like below.
index=  0 1 2 3
nums=   3 2 2 3 
val=3
i=1;
count=0;
for(inti=0;i<nums.length;i++){
    if(nums[i]==val){
        continue;
     }
    nums[count]=nums[i];
    count+=1
   }
}
5. Now we have replaced value, so we are incrementing count variable by 1.
index=  0 1 2 3
nums=   2 2 2 3 
val=3
i=1;
count=1;
for(inti=0;i<nums.length;i++){
    if(nums[i]==val){
        continue;
     }
    nums[count]=nums[i];
    count+=1
   }
}
6. Now, next for loop, i will be incremented by 1, and we repeat the step 1.
index=  0 1 2 3
nums=   2 2 2 3 
val=3
i=2;
count=1;
for(inti=0;i<nums.length;i++){
    if(nums[i]==val){
        continue;
     }
    nums[count]=nums[i];
    count+=1
   }
}
7. As the step 3, we are moving forward with i = 2 case, here, nums[2] → 2 and val → 3, both value are not matching.
index=  0 1 2 3
nums=   2 2 2 3 
val=3
i=2;
count=1;
for(inti=0;i<nums.length;i++){
    if(nums[i]==val){
        continue;
     }
    nums[count]=nums[i];
    count+=1
   }
}
8. As the step 4 and 5, we are going to replace num’s 1st index (as count → 1) value (which is 2) with num’s 3rd index value (which is also 2), and then we increment value of count with 1, so resultant will be like below.
index=  0 1 2 3
nums=   2 2 2 3 
val=3
i=2;
count=2;
for(inti=0;i<nums.length;i++){
    if(nums[i]==val){
        continue;
     }
    nums[count]=nums[i];
    count+=1
   }
}
9. As the step 6, for the next for loop, i will be incremented by 1, and we repeat the step 1.
index=  0 1 2 3
nums=   2 2 2 3 
val=3
i=3;
count=2;
for(inti=0;i<nums.length;i++){
    if(nums[i]==val){
        continue;
     }
    nums[count]=nums[i];
    count+=1
   }
}
10. As the step 2, here, nums[3] → 3 and val → 3, both value are matching so, we are skipping below steps.
index=  0 1 2 3
nums=   2 2 2 3 
val=3
i=3;
count=2;
for(inti=0;i<nums.length;i++){
    if(nums[i]==val){
        continue;
     }
    nums[count]=nums[i];
    count+=1
   }
}
11. Now i will be 4 and for loop condition (i < nums.length) → (4 < 4) will be failed and resultant value count → 2 and array will be like below
index=  0 1 2 3
nums=   2 2 2 3 
count=2;
12. Here we will return count which mean 2 as an answer.
By returning 2 means, resultant array’s first 2 element only will be counted.
nums=   2 2 
count=2;
So, here you can see we got desired result, in this array there is no val → 3.

   Code: 
                 class Solution {
                         public int removeElement(int[] nums, int val) {
                                                         int count = 0;
                                      for(int i = 0; i < nums.length; i++){
                                                      if(nums[i] == val){
                                                             continue;
                                                                      }
                                                 nums[count] = nums[i];
                                                       count++;
                                            }
                                 return count;
    }
                             }


Time Complexity

We are scanning the array once, hence the time complexity will be O(n).
    TC=O(n)
Space Complexity
Since we have no used any extra array, the space complexity will be O(1).
    SC=O(1)


Q3.    Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Solution:-    

Approach:

Initialize the start pointer to 0, representing the first index of the array, and the end pointer to nums.size() - 1, representing the last index of the array.
Set the answer variable ans to nums.size(), which is the default answer when the target is greater than all elements in the array.
Enter a while loop while the start pointer is less than or equal to the end pointer.
Calculate the mid index using the formula: mid = start + (end - start) / 2. This formula ensures that the mid index is always rounded down to the nearest integer.
Compare the element at the mid index, nums[mid], with the target:
a. If they are equal, return the mid index because the target is found in the array.
b. If nums[mid] is less than the target, update the start pointer to mid + 1 because the target should be on the right side of the mid index.
c. If nums[mid] is greater than the target, update the answer ans to the current mid index and update the end pointer to mid - 1 because the target should be on the left side of the mid index.
If the while loop exits without finding the target, return the answer ans, which represents the index where the target should be inserted to maintain the sorted order.

Complexity:

The time complexity of this solution is O(log n) because the binary search algorithm divides the search space in half at each step.
The space complexity is O(1) since the algorithm uses only a constant amount of extra space.

TC=O(logn)
SC=O(1)

Code:-

    class Solution {
         public int searchInsert(int[] nums, int target) {
               int start = 0, end = nums.length - 1;
               int ans = nums.length; 
        
          while (start <= end) {
                int mid = start + (end - start) / 2;
            
                if (nums[mid] == target) {
                     return mid;
                 } 
              else if (nums[mid] < target) {
                start = mid + 1;
            } 
              else {
                ans = mid;
                end = mid - 1;
            }
        }
        
        return ans;
    }
}

The Above code implements a binary search algorithm to find the index where a target number should be inserted into a sorted array. If the target number is already present in the array, the function returns its index. If not, it returns the index where the target should be inserted to maintain the sorted order.



Q4.     You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]

Explanation:The array represents the integer 123.

Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Solution: 
    
Complexity
Time complexity:
O(N)
Space complexity:
O(N)
    
Code with explanation

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        // Starting from the least significant digit (i.e., the last element of the array)
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, we can add 1 to it and return the updated array
            if (digits[i] < 9) {
                digits[i]++; // Add 1 to the current digit
                return digits; // Return the updated array
            }
            // If the current digit is 9, we set it to 0 and continue with the next digit
            else {
                digits[i] = 0; // Set the current digit to 0
            }
        }
        // If we reach here, it means all digits were 9, so we need to create a new array with one more element
        int[] result = new int[n + 1]; // Create a new array with length n + 1
        result[0] = 1; // Set the first element to 1, since all other elements are 0 by default
        return result; // Return the new array
    }
}



Q5.    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]

Explanation:The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Solution:-
    
Approach:-

From the given constraints, we can say one thing which is length of nums1 is greater than length of nums2.
So one of the straight forward approach will be to store all the elements to an extra space like ArrayList, sort that ArrayList and then put back all the elements to nums1. In this case, we are actually applying sorting which makes **NlogN **complexity where N = m + n.
But let us again recheck, do we actually need an extra space and do additional sorting as we already have 2 sorted array.
More optimised way will be to use 3 variables say i, j, k where
i = m - 1
j = n - 1
k = m + n - 1
Now just have a traversal until i greater than or equal to 0 and j greater than or equal to 0 and do a check for the following :
-> if nums1[i] is greater than nums2[j], store nums1[i] to nums1[k] and decrease i and k.
-> else store nums2[j] to nums1[k] and decrease j and k.
There can be cases where there are some left out elements in nums2. So just make sure we cover all elements with an extra while loop until j ≥ 0 and store those elements to nums[k] as those will be the largest numbers that are remaining with us to be merged.
Time and Space Complexity
Here we are traversing through the arrays of length m and n. So our time complexity will be O(m + n).
We are not making use of any extra space. So our space complexity will be O(1).
Please correct me if I made any mistake.

Code:-

class solution
{
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[k--]=nums1[i--];
            }
            else
            {
               nums1[k--]=nums2[j--];
            }

        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }
    }
}

Q6. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]

Output: true

Solution:- Java Solution (Using Hashset):
Time complexity: O(n)
Space complexity: O(n)

Code with explanation:- 

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create a hashset...
        HashSet<Integer> hset = new HashSet<Integer>();
        // Traverse all the elements through the loop...
        for (int idx = 0; idx < nums.length; idx ++){
            // Searches hashset. if present, it contains duplicate...
            if (hset.contains(nums[idx])){
                return true;
            }
            // if not present it will update hashset...
            hset.add(nums[idx]);
        }
        // Otherwise return false...
        return false;
    }
}

    

Q7.    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Solution:-

The goal of this solution is to move all the zeroes in the input array nums to the end of the array while maintaining the relative order of the non-zero elements

Approach

1.Initialize a variable m to -1, which will keep track of the position of the first zero encountered.
2.Traverse the array nums from left to right: a. If the current element is zero, and m is -1 or the element at position m is non-zero, set m to the current index. b. If the current element is non-zero and m is not -1, swap the current element with the element at position m and increment m.
3.After the traversal, all the zeroes will be at the end of the array, and the relative order of the non-zero elements will be maintained.
    
Complexity

Time complexity:
O(n), where n is the length of the input array nums. The algorithm iterates through the array once
     TC=O(n)
Space complexity:
O(1), as the algorithm only uses a constant amount of extra space to store the variable m and the temporary variable temp used for swapping elements.
    SC=O(1)

Code:-

class Solution {
    public void moveZeroes(int[] nums) {
        int m=-1;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
            {
                if(m==-1 || nums[m]!=0)
                {
                    m=i;
                }
            }
            else
            {
                if(m!=-1)
                {
                    int temp = nums[i];
                    nums[i]=nums[m];
                    nums[m]=temp;
                    m++;
                }
            }
        }
    }
}


Q8.    You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]

Solution:-     

 Since we are supposed to have all the numbers from 1 to n, we can make use of an extra array of sizes n. Let us initialize this array with “-1”.
We will solve the given problem statement in two steps. First, we will look for the duplicate number. We will traverse the array, take each number and place it in its respective index. If the number in that index is not -1, this means it’s a duplicate number and hence we will include it in our output array.
As the second step, we will traverse through the extra array, check for the index that has -1, this means it is missing. Hence we will append this value to our output array.

Let us look into the code:-
    
class ErrorNumsFinder:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        numbers = [-1 for i in range(len(nums)+1)]
        output = []
        for num in nums:
            if numbers[num] == -1:
                numbers[num] = num
            else:
                output.append(num)
        
        for i in range(1,len(numbers)):
            if numbers[i] == -1:
                output.append(i)
        return output
Complexity analysis.
Time Complexity
Since we are traversing through the array twice the time complexity is O(2N) which is equal to O(N).
    TC=O(N)
Space Complexity
Since we are an extra array to store our elements, the space complexity is O(N).
    SC=O(N)
