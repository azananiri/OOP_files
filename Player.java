public class Player {
  private int fuel = 120;
  private String name;

  // Grid
  private Cell[][] grid;
  private int gridSize;

  // Coordinates of player
  private int column = 0;
  private int row;

  // Is player moves straight
  private boolean isStraight = true;

  public Player(String name, Cell[][] grid) {
    this.gridSize = grid.length - 1;
    this.row = gridSize;
    this.grid = grid;
    this.name = name;
  }

  public int dieRoll() {
    int die = Rand.rInt(1, 6);
    System.out.println("Rolling die...");
    System.out.println(die);
    System.out.println();
    return die;
  }

  public int getFuel() {
    return fuel;
  }

  public String getName() {
    return name;
  }

  public void changeFuel(int amount) {
    fuel += amount;
  }

  public void goToStart() {
    this.isStraight = true;
    this.row = gridSize;
    this.column = 0;
  }

  public void move(int steps) {
    // Move player
    for (int i = 0; i < steps; i++) {
      if ((column == 0 && !isStraight) || (column == gridSize && isStraight)) {
        row--;
        isStraight = !isStraight;
      } else {
        if (isStraight) {
          column++;
        } else {
          column--;
        }
        // If cell is empty call cell function
      }
      if (grid[row][column].getCellType() == 1) {
        grid[row][column].cellFunction(this);
      }
    }

    if (grid[row][column].getCellType() != 1) {
      grid[row][column].cellFunction(this);
    }

    showGridWithPlayer();
  }

  public void showGridWithPlayer() {
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (i == row && j == column) {
          System.out.print("P ");
        } else {
          System.out.print(grid[i][j].getValue() + " ");
          // if (grid[i][j].getCellType() == 1) {
          //   System.out.print(grid[i][j].getValue() + " ");
          // } else if (grid[i][j].getCellType() == 2) {
          //   System.out.print("g ");
          // } else {
          //   System.out.print("b ");
          // }
        }
      }

      System.out.println();
    }
    System.out.println("\n" + fuel + "\n");
  }
}
