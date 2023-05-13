function memoize(fn) {
  const cache = {};
  return function(...args) {
    const key = JSON.stringify(args);
    if (key in cache) {
      return cache[key];
    }
    const functionOutput = fn(...args);
    cache[key] = functionOutput;
    return functionOutput;
  }
}