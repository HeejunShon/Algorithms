/**
  Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
  Note that after backspacing an empty text, the text will continue empty.
 */

function backspaceCompare(S: string, T: string): boolean {
  let newS: string[] = [];
  let newT: string[] = [];

  for (let i = 0; i < Math.max(S.length, T.length); i++) {
    removeSharp(S, newS, i);
    removeSharp(T, newT, i);
  }

  // # 제거
  function removeSharp(str: string, arr: string[], idx: number) {
    if (idx < str.length) {
      if (str[idx] !== "#") {
        arr.push(str[idx]);
      } else {
        arr.pop();
      }
    }
  }

  // # 제거 된 두 문자열 비교
  return newS.join() === newT.join();
}
