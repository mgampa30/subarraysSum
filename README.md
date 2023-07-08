# subarraysSum

# Algorithm
Iterate over each index i in the array from left to right.

Initialize a variable temp to store the current sum.

Iterate over the array starting from index i to the end of the array.

Add the element at the current index j to temp.

If temp becomes greater than the target sum, exit the inner loop using break.

If temp equals the target sum, print the indices i and j indicating the subarray with the target sum.

Repeat steps 2-6 for each index i in the outer loop.
