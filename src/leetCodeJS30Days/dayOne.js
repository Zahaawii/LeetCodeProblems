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

/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 * Problem set:
 * Write a function createCounter. It should accept an initial integer init. It should return an object with three functions.
 *
 * The three functions are:
 *
 * increment() increases the current value by 1 and then returns it.
 * decrement() reduces the current value by 1 and then returns it.
 * reset() sets the current value to init and then returns it.
 *
 * Solution:
 * Create a variable that is allowed to be modified
 * Modify the variable based on the function call
 * reset sets the value back to init
 */

var createCounter = function(init) {
    let newVal = init;
    return {
        increment: function() {
            return ++newVal
        },
        decrement: function() {
            return --newVal
        },
        reset: function() {
            newVal = init
            return newVal;
        }
    }

};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */