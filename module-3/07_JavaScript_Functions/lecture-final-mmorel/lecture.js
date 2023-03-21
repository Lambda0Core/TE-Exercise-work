/***************************************************************** */
/***************  Array Functions  ******************************* */
/***************************************************************** */
function arrayFunctions() {
  // Split a string into an array
  let phrase1 = "When in the course of human events it becomes necessary for one people to dissolve the political bands";
  let words = phrase1.split(" ");

  printArray(words);

  // array.slice gets a "sub-array" but does not modify the original
  // array.slice(startElement, nonInclusiveEndElement)
  console.log('*** ***\r\narray.slice gets a "sub-array" but does not modify the original' );
  let arr = words.slice(3, 7);
  printArray(arr);
  printArray(words);


  console.log('*** ***\r\narray.splice get a "sub-array" and removes those elements.');
  arr = words.splice(3, 4, "middle", "of", "the", "day");
  printArray(arr);
  printArray(words);


  // array.concat(arr2)
  // array.concat joins two arrays, and does not modify either.
  console.log('*** ***\r\narray.concat joins two arrays, and does not modify either.' );
  let bigArray = words.concat(arr);
  printArray(words);
  printArray(arr);
  printArray(bigArray);

}

function printArray(arr) {
  console.log(arr);
  console.log(arr.join("-"));
}


/**
 * Scope is defined as where a variable is available to be used.
 *
 * If a variable is declare inside of a block, it will only exist in
 * that block and any block underneath it. Once the block that the
 * variable was defined in ends, the variable disappears.
 */
function scopeTest() {
  // This variable will always be in scope in this function
  let inScopeInScopeTest = true;

  {
    // this variable lives inside this block and doesn't
    // exist outside of the block
    let scopedToBlock = inScopeInScopeTest;
  }

  // scopedToBlock doesn't exist here so an error will be thrown
  if (inScopeInScopeTest && scopedToBlock) {
    console.log("This won't print!");
  }
}

/**
 * JSDoc Example
 *
 * Take the details of a person and create an English readable sentence
 * that uses that information to describe them. We join the quirks together
 * with the separator, or `, ` by default.
 *
 * @param {string} name the name of the person we're describing
 * @param {number} age the age of the person
 * @param {string[]} [listOfQuirks] a list of funny quirks that we'll list out
 * @param {string} [separator=', '] the string to separate the quirks by
 * @returns {string} the full descriptive string
 */
function createSentenceFromUser(name, age, listOfQuirks = [], separator = ', ') {
  let description = `${name} is currently ${age} years old. Their quirks are: `;
  return description + listOfQuirks.join(separator);
}

/***************************************************************** */
/************* Functions and Parameters ************************** */
/***************************************************************** */

/**
 * Write a function called multiplyTogether that multiplies two numbers together. But 
 * what happens if we don't pass a value in? What happens if the value is not a number?
 *
 * @param {number} firstParameter the first parameter to multiply
 * @param {number} secondParameter the second parameter to multiply
 */
function multiplyTogether(firstParameter, secondParameter) {
  return firstParameter * secondParameter;
}

/**
 * This version makes sure that no parameters are ever missing. If
 * someone calls this function without parameters, we default the
 * values to 0. However, it is impossible in JavaScript to prevent
 * someone from calling this function with data that is not a number.
 * Call this function multiplyNoUndefined
 *
 * @param {number} [firstParameter=0] the first parameter to multiply
 * @param {number} [secondParameter=1] the second parameter to multiply
 */
function multiplyNoUndefined(firstParameter = 0, secondParameter = 1) {
  return firstParameter * secondParameter;
}


/**
 * How can I write the multiply function so that it will multiply any number of parameters?
 */
function multiply() {
  if (arguments.length === 0){
    return 0;
  }

  let product = 1;
  for (arg of arguments) {
    if (typeof (arg) === "number") {
      product *= arg;
    }
  }
  return product;
}


// How can we change this so that it can add up zero to three numbers?

/**
 * 
 * @param {number} num1 A number to add
 * @param {number} num2 A number to add
 * @param {number} num3 A number to add
 * @returns {number} The sum of numbers passed in
 */
function add(num1=0, num2=0, num3=0) {
  return num1 + num2 + num3;
}


/**
 * How can I write the add function so that it will add any number of parameters?
 */
function add() {
  let sum = 0;
  for (let i = 0; i < arguments.length; i++) {
    if (typeof (arguments[i]) === "number") {
      sum += arguments[i];
    }
  }
  return sum;
}

/***************************************************************** */
/***************** Anonymous Functions  ************************** */
/***************************************************************** */

/*********************************************************
 * Anonymous Functions
 * 
 * Functions are a "first-class object" in JavaScript.  
 * There are numerous ways to define functions.  We have seen just one 
 * way so far... with the "function" keyword similar to how we define a method in C#.
 */
// Anonymous functions
function doubleIt(n) {
  return n * 2;
}

/***************************
 * There is actually a "variable" called doubleIt now
 */
console.log(`doubleIt is a type ${typeof (doubleIt)}`);
console.log(doubleIt.name);

/************************
 * Now that the function is defined, we can actually "assign" that function to 
 * another variable.
 */
let f = doubleIt; // f is now a function
console.log(`f is a type ${typeof (f)}`);
console.log(f.name);

/*****************************
 * Another way to define a function - assign it to a variable directly
 * 
 */
let tripleIt = function (n) {
  return n * 3;
}

/*******************************
 * And finally, a shortcut for the above using lambda (fat arrow)
 * 
 */
let quadrupleIt = (n) => { return n * 4; }

/************************************
 * You may even see a shorter-cut, called an expression-bodied function
 * but I won't use it normally
 */
let quintupleIt = n => n * 5;
console.log(quintupleIt.name);
console.log(quintupleIt);

/************************************
 * Now we can write a function, which takes another function as a parameter.
 * The passed-in function can be called (executed / invoked).
 */
function toAllElements(array, functionToApply) {
  let outArray = [];
  for (let i = 0; i < array.length; i++) {
    outArray.push(functionToApply(array[i]));
  }
  return outArray;
}

/***********************************
 * Define an array of numbers
 */
let myArray = [1, 2, 3, 4, 5];

/**********************************
 * Now in the Console window, call toAllElements, passing in myArray, and a function
 * which will perform an operation on every element
 */
//toAllElements(myArray, doubleIt);


// Now execute these in the console
// toAllElements(myArray, doubleIt)
// toAllElements(myArray, tripleIt)
// toAllElements(myArray, quadrupleIt)
// toAllElements(myArray, (n) => {return n+10;})



// Anonymous functions
/**
 * Transform each element
 * @param {string[]} array An array of strings to call an operation on
 * @param {function(s)} operation Function to apply to each element
 * @returns {string[]} Array of transformed elements
 */
function applyToAllElements(array, operation) {
  let outArray = [];
  for (let i = 0; i < array.length; i++) {
    outArray.push(operation(array[i]));
  }
  return outArray;
}

let arr = ["The", "quick", "brown"];

function upCase(s) {
  return s.toUpperCase();
}

/***

// Now we can call the function, passing in the named array and named function...
applyToAllElements(arr, upCase);

// Or we can call the function, passing in the an un-named array...
applyToAllElements(["Mike", "morel"], upCase);

// Or we can call the function, passing in the an un-named array AND and un-named function...
applyToAllElements(["Mike", "morel"], function (s) {return s.toUpperCase();});

// Or use the shortcut syntax for defining a function
applyToAllElements(["Mike", "morel"], (s) => {return s.toUpperCase();});

***/


/**
 * Takes an array and returns a new array of only numbers that are
 * multiples of 3
 *
 * @param {number[]} numbersToFilter numbers to filter through
 * @returns {number[]} a new array with only those numbers that are
 *   multiples of 3
 */
function allDivisibleByThree(numbersToFilter) {
  return numbersToFilter.filter((number) => {
    return number % 3 === 0;
  });
}

/***************************************************************** */
/********************* Array Functions  ************************** */
/***************************************************************** */

/**
 * Takes an array and, using the power of anonymous functions, generates
 * their sum.
 *
 * @param {number[]} numbersToSum numbers to add up
 * @returns {number} sum of all the numbers
 */
function sumAllNumbers(numbersToSum) {
  return numbersToSum.reduce(
    /**
     * Add each number to the previous sum using reduce
     */
    (sum, number) => {
      return sum + number;
    }
  );
}



let people = [
  { name: "Mike", age: 56, height: 71 },
  { name: "Tyler", age: 28, height: 74 },
  { name: "El", age: 26, height: 60 },
];

// List all the people using foreach
function listAllPeople(people) {
  people.forEach(p => {
    console.log(`${p.name}, age ${p.age}`);
  })
}

// Filter people by height or age
function shortPeople(people) {
  return people.filter(p => {
    return p.height < 65;
  }
  )
}

// Map Name to uppercase
function upperName(people) {
  return people.map(p => {
    return p.name.toUpperCase();
  })
}


// Reduce to total height of all people
function totalHeight(people) {
  return people.reduce((sum, p) => {
    return sum + p.height;
  }, 0);
}

/**
 * Sorts the people array (above) by the specified field (n, a or h)
 * 
 * @param {string} sortBy Character representing field to sort by (a, n, h)
 * @returns {[]} A sorted array of people
 */
function sortPeople(sortBy = "n") {
  switch (sortBy.toLowerCase()) {
    case "n":
      return people.sort((a, b) => {
        return (a.name > b.name ? 1 : (a.name < b.name ? -1 : 0))
      });
    //   if (a.name > b.name)
    //   {
    //     return 1;
    //   } 
    //   else if (a.name < b.name)
    //   {
    //     return -1;
    //   }
    //   else
    //   {
    //     return 0;
    //   }
    // });
    case "a":
      return people.sort((a, b) => {
        return a.age - b.age;
      });
    case "h":
      return people.sort((a, b) => {
        return (a.height > b.height ? 1 : (a.height < b.height ? -1 : 0))
      });
    // return people.sort((a, b) => {
    //   if (a.height > b.height)
    //   {
    //     return 1;
    //   } 
    //   else if (a.height < b.height)
    //   {
    //     return -1;
    //   }
    //   else
    //   {
    //     return 0;
    //   }
    // });
  }
}