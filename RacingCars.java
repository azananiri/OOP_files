public class RacingCars {

  public static void main(String[] args) {

    // Create grid
    RacingGrid grid = new RacingGrid(10);

    Player p1 = new Player("Player 1", grid.getGrid());
    Player p2 = new Player("Player 2", grid.getGrid());

    p1.showGridWithPlayer();

    for (int i = 0; i < 5; i++) {
      p1.move(p1.dieRoll());
    }

    System.out.println("vhfv");
  }
}