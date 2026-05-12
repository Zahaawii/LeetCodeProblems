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