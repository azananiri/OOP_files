public class BlackCell extends Cell implements CellFunction {
  public BlackCell() {
    super("black", 3);
  }

  public void cellFunction(Player player) {
    player.goToStart();
  };
}