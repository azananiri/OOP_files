public class RacingGrid {
  private Cell grid[][];
  private int size;

  public RacingGrid() {
    this.size = 10;
  }

  public RacingGrid(int size) {
    this.size = size;
    initGrid();
  }

  public void initGrid() {
    // Create grid
    this.grid = new Cell[size][size];

    // Fill grid
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        grid[i][j] = new GrayCell();
      }
    }

    // Add special cells
    for (int i = 0; i < (size * size) * .15; i++) {
      newCell(new BlackCell());
      newCell(new GreenCell());
    }
  }

  // Add new cell of given type at random position in grid
  public void newCell(Cell cell) {
    int x = Rand.rInt(size - 1);
    int y = Rand.rInt(size - 1);

    if (grid[x][y].getCellType() == 1 && !(x == 0 && y == 0) && !(x == size - 1 && y == 0)) {
      grid[x][y] = cell;
    } else {
      newCell(cell);
    }
  }

  public Cell[][] getGrid() {
    return grid;
  }
}
