/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 *
 * Problem set:
 * Given an integer array arr and a mapping function fn, return a new array with a transformation applied to each element.
 * The returned array should be created such that returnedArray[i] = fn(arr[i], i).
 * Please solve it without the built-in Array.map method.
 *
 * Solution:
 * Instantiate an empty array
 * Loop through the given array
 * Take the function and array and add it to number at the index
 * return the number.
 *
 *TODO: Since the submission is 64 ms it can be optimized.
 * I will try to look at another way to solve this issue  
 */
var map = function(arr, fn) {
    const number = [];
    for(let i = 0; i < arr.length; i++) {
        number[i] = fn(arr[i], i)
    }
    return number;
};