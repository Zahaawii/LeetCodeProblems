
/**
 * @param {Function[]} functions
 * @return {Function}
 *
 * Problem set:
 * Given an array of functions [f1, f2, f3, ..., fn], return a new function fn that is the function composition of the array of functions.
 * The function composition of [f(x), g(x), h(x)] is fn(x) = f(g(h(x))).
 * The function composition of an empty list of functions is the identity function f(x) = x.
 * You may assume each function in the array accepts one integer as input and returns one integer as output.
 *
 * Notes:
 * So for this particular problem, I had some difficulties. I did not know how to access the functions with the value that I wanted to
 * Which gave me some challenges, I tried a lot of different things with the idea that the down below code shows.
 * I could not figure out how to do it, so unfortunately I had to look it up.
 *
 * Solution:
 * For this solution what we are doing is going from right to left, as that is what the problem set wants us to do, simply by
 * decrementing a for loop.
 * Instantiating a variable with the given input
 * Loop through the functions length and give the variable output the return value of the function and the output number.
 * the reason for the output number being in the parameter is because of the value needs to be mulitplied or addition.
 */
var compose = function(functions) {
    return function(x) {
        let output = x;
        for(let i = functions.length - 1; i >= 0; i--) {
            output = functions[i](output)
        }
        return output;
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */


/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 *
 * Problem set:
 * Write a function argumentsLength that returns the count of arguments passed to it.
 *
 * Notes:
 * return args.length; this apparently is slower than the code below. Don't really know why
 *
 * Solution:
 * Take the length of args and return it
 *
 */
var argumentsLength = function(...args) {
    let length = args.length;
    return length;
    /*
    Or simply

    Apparently above method is faster?
    */
};

/**
 * argumentsLength(1, 2, 3); // 3
 */