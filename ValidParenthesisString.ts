function checkValidString(s: string): boolean {
  let leftParenthesis = getIndexes(s, "(");
  let rightParenthesis = getIndexes(s, ")");
  let star = getIndexes(s, "*").length;

  console.log("L ", leftParenthesis);
  console.log("R ", rightParenthesis);
  console.log("S ", star);

  // index 배열 반환
  function getIndexes(arr: string, char: string): number[] {
    let index = -1;
    let indexArr = [];

    do {
      index = arr.indexOf(char, index + 1);
      if (index !== -1) {
        indexArr.push(index);
      }
    } while (index !== -1);

    return indexArr;
  }

  let count = 0;

  // 갯수 불일치 실패
  if (
    leftParenthesis.length - rightParenthesis.length !== 0 &&
    Math.abs(leftParenthesis.length - rightParenthesis.length) !== star
  ) {
    return false;
  }

  // (, ) 비교
  while (count <= leftParenthesis.length) {
    if (leftParenthesis[count] < rightParenthesis[count]) {
      continue;
    } else if (star > 0) {
      star--;
      continue;
    } else {
      return false;
    }

    count++;
  }

  return true;
}
