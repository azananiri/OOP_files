public abstract class Cell {
  private String color;
  private int cellType;
  public int cellValue;

  public Cell(String color, int cellType) {
    this.cellType = cellType;
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public int getCellType() {
    return cellType;
  }

  public int getValue() {
    return cellValue;
  }

  public void setValue (int value) {
    this.cellValue = value;
  }

  public abstract void cellFunction(Player player);
}
