/*
  Given a non-empty array of integers, every element appears twice except for one. Find that single one.
*/

function singleNumber(nums: number[]): number | undefined {
  let existedNum = new Set();
  let answer;

  nums.forEach((num, index) => {
    // 미래에 중복 수 나오면 set에 등록
    if (nums.indexOf(num, index + 1) !== -1) {
      existedNum.add(num);
    } else if (!existedNum.has(num)) {
      // 더 이상 중복 수 없고 set에도 없으면 정답
      answer = num;
    }
  });

  return answer;
}
