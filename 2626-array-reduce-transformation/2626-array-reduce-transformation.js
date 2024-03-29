var reduce = function(arr, fn, initialVal) {
  let accumulator = initialVal;
  for (const element of arr) {
      accumulator = fn(accumulator, element);
  }
  return accumulator;
};