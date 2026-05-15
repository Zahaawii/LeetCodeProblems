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

/**
 * @param {string} val
 * @return {Object}
 * Problem set:
 * Write a function expect that helps developers test their code. It should take in any value val and return an object with the following two functions.
 *
 * toBe(val) accepts another value and returns true if the two values === each other. If they are not equal, it should throw an error "Not Equal".
 * notToBe(val) accepts another value and returns true if the two values !== each other. If they are equal, it should throw an error "Equal".
 *
 * Solution:
 * Return an object to be and not to be that checks whether the input is equal or not eqaul
 */
var expect = function(val) {
    return {
        toBe: function (input) {
            if (val === input) return true
            else throw new Error ("Not Equal")
        },
        notToBe: function (input) {
            if (val !== input) return true;
            else throw new Error ("Equal");
        }
    }
};


/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */