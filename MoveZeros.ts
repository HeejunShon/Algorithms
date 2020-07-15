/**
    Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
    
    Do not return anything, modify nums in-place instead.
*/

function moveZeroes(nums: number[]): void {
  let numOfZero = 0;

  // 0 갯수 찾기
  nums.forEach((num) => {
    if (num === 0) {
      numOfZero++;
    }
  });

  // 0 갯수 만큼 0 삭제, 끝에 0 추가
  while (numOfZero-- > 0) {
    nums.splice(nums.indexOf(0), 1);
    nums.push(0);
  }
}
