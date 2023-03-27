// map, filter, reduce, find
// Those are 3 really powerful array functions:

// map returns an array with the same length,
// filter as the name implies, it returns an array with less items than the original array
// reduce returns a single value (or object)
// find returns the first items in an array that satisfies a condition



// ***  Map ***
// Execute something on every element with map
// A loop would look like this:

const performSomething = (item) => {
  //...
  return item
}

const performSomething2 = (item) => {
  //...
 console.log( item);
}

console.log("FOR EACH");
let items = ['a', 'b', 'c']
items.forEach((item) => {
  console.log(performSomething(item));
})

// With a declarative approach, you tell JavaScript to perform something on every element using:
console.log("Map");
 items = ['a', 'b', 'c'];
let newArray = items.map((item) => console.log(performSomething(item)))
// This generates a new array, without editing the original one (what we call immutability)

// Since we use a single function in the map callback function, we can rewrite the sample as:

console.log("Map with no param");
 items = ['a', 'b', 'c'];
 newArray = items.map(performSomething);

// ** FIND  **
// Sometimes you need to look for a specific item in the array, and return it.

// This is how you would do so with a loop:

 items = [
  { name: 'a', content: { /* ... */ }},
  { name: 'b', content: { /* ... */ }},
  { name: 'c', content: { /* ... */ }}
]
for (const item of items) {
  if (item.name === 'b') {
    console.log( item);
  }
}
// Here is the non-loop version, using find() (ES6+):
console.log("FIND")
let b = items.find((item) => item.name === 'bx')


// Here is the same functionality using filter() (ES5+):

// ****  FILTER *****
console.log("FILTER");
 b = items.filter((item) => item.name === 'b').shift()
 console.log(b);
// *** REDUCE ***
// Use reduce() to get a single value out of an array. For example sum the items content.value property:

 items = [
  { name: 'a', content: { value: 1 }},
  { name: 'b', content: { value: 2 }},
  { name: 'c', content: { value: 3 }}
]
// using a loop:

let count = 0
for (const item of items) {
  count += item.content.value
}

// can written as

let countA = items.reduce((result, item) => result + item.content.value, 0)
let countB = items.reduce((result, { content: { value } }) => result + value, 0)

console.log(countA, ' ', countB)

