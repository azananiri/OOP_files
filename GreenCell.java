public class GreenCell extends Cell implements CellFunction {
  public GreenCell() {
    super("green", 2);
  }

  public void cellFunction(Player player) {
    player.changeFuel(player.getFuel() / 2);
  };
}