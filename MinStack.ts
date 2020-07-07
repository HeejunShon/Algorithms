/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
*/

class MinStack {
  stack: number[];

  constructor() {
    this.stack = [];
  }

  push(x: number): void {
    this.stack.push(x);
  }

  pop(): void {
    this.stack.pop();
  }

  top(): number | undefined {
    return [...this.stack].pop();
  }

  getMin(): number {
    return Math.min(...this.stack);
  }
}
