/*
  Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
*/

function numIslands(grid: string[][]): number {
  if (grid.length < 1) {
    return 0;
  }

  let numOfIslands = 0;

  for (let i = 0; i < grid.length; i++) {
    for (let j = 0; j < grid[i].length; j++) {
      // 값이 1일 경우만 증가
      if (grid[i][j] == "1") {
        numOfIslands++;
        dfsIslands(grid, i, j);
      }
    }
  }

  return numOfIslands;
}

function dfsIslands(grid: string[][], i: number, j: number) {
  // 행렬 밖 벗어나거나, 행렬 값이 1이 아니면 return
  if (
    i < 0 ||
    i >= grid.length ||
    j < 0 ||
    j >= grid[i].length ||
    grid[i][j] !== "1"
  ) {
    return;
  }

  // grid 값 1 -> -1로 바꾸기 (numOfIslands 카운트 방지)
  grid[i][j] = "-1";

  dfsIslands(grid, i - 1, j); // 위 탐색
  dfsIslands(grid, i + 1, j); // 아래
  dfsIslands(grid, i, j - 1); // 왼쪽
  dfsIslands(grid, i, j + 1); // 아래쪽
}
