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

/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 *
 * Problem set:
 * Given an integer array arr and a filtering function fn, return a filtered array filteredArr.
 * The fn function takes one or two arguments:
 *
 * arr[i] - number from the arr
 * i - index of arr[i]
 * filteredArr should only contain the elements from the arr for which the expression fn(arr[i], i) evaluates to a truthy value. A truthy value is a value where Boolean(value) returns true.
 *
 * Please solve it without the built-in Array.filter method.
 *
 * Solution:
 * Instantiate a new empty array
 * Iterate through the given array
 * Use the function to check whether the condition is true or not
 * If its true, take the arr[i] value and add (push) it into the empty array
 * Return the new array
 */

/** So my first idea was to do this because i didnt know we could use built in functions
But the above code runs faster with 8 ms difference
    Kinda same idea instead we are manually incrementing the count if the condition is true
    therefore the true conditions will be met

var filter = function(arr, fn) {
    const number = [];
    let count = 0;
    for(let i = 0; i < arr.length; i++) {
        if(fn(arr[i], i)) {
            number[count] = arr[i];
            ++count
        }
    }
    return number;
};

*/
var filter = function(arr, fn) {
    const number = [];
    for(let i = 0; i < arr.length; i++) {
        if(fn(arr[i], i)) {
            number.push(arr[i])
        }
    }
    return number;
};

