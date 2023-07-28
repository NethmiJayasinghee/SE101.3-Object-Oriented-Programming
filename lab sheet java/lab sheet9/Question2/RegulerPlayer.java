
    public class RegulerPlayer extends Movements {
        RegulerPlayer(Directions direction) {
          this.direction = direction;
          this.spaces = 1;
        }
      
        @Override
        public void movements() {
          System.out.printf("[%s] : %s\n", direction, getLocation(spaces));
        }
      }

