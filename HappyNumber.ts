/**
  Write an algorithm to determine if a number n is "happy".

  A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

  Return True if n is a happy number, and False if not.
*/

function isHappy(n: number): boolean {
  let squaredNum = String(n)
    .split("")
    .reduce(
      (acc: any, cur: any): any => Number(acc) + Math.pow(Number(cur), 2),
      0
    );

  let process = 0;

  while (squaredNum != "1") {
    if (process >= 1000) return false;

    squaredNum = String(squaredNum)
      .split("")
      .reduce(
        (acc: any, cur: any): any => Number(acc) + Math.pow(Number(cur), 2),
        0
      );

    process++;
  }

  return true;
}
