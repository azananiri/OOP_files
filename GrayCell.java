public class GrayCell extends Cell implements CellFunction {
  public GrayCell() {
    super("gray", 1);
    super.setValue(Rand.rInt(1, 3));
  }

  public void cellFunction(Player player) {
    player.changeFuel(-super.getValue());
  };

  public int getValue() {
    return this.cellValue;
  }
}