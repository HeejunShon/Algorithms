/** 
  Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
*/

function subarraySum(nums: number[], k: number): number {
  let num = 0;
  let sum = 0;

  for (let i = 0; i < nums.length; i++) {
    let sum = nums[i];

    // 자기자신 === k일 경우 증가
    if (sum === k) {
      num++;
    }

    for (let j = i + 1; j < nums.length; j++) {
      sum += nums[j];

      // 다음 원소 더해서 k일 경우 증가
      if (sum === k) {
        num++;
        continue;
      }
    }
  }

  return num;
}
