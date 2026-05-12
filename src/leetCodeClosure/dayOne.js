/**
 * @return {Function}
 * Problem set: Write a function createHelloWorld. It should return a new function that always returns "Hello World".
 * Solution: Simply return "Hello World" everytime this function is called.
 */
var createHelloWorld = function() {

    return function(...args) {
        return "Hello World";
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */

/**
 * @param {number} n
 * @return {Function} counter
 * Problem set:
 * Given an integer n, return a counter function.
 * This counter function initially returns n and then returns 1
 * more than the previous value every subsequent time it is called (n, n + 1, n + 2, etc).
 * Solution: Simply return the counter + 1 everytime function gets called
 */
var createCounter = function(n) {

    return function() {
        return n++
    };
};

/**
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */