public class EchoTestDrive {
  public static void main(String [] args) {
    Echo e1 = new Echo();
    Echo e2 = new Echo();
    int x = 0;
    while ( x < 4 ) {
      e1.hello();
      e1.count = e1.count + 1;
      if ( x > 0 ) {
        e2.count = e2.count + 1;
      }
      if ( x > 1 ) {
        e2.count = e2.count + e1.count;
      }
      x = x + 1;
    }
    System.out.println(e2.count);
  }
}

// prints
// helloooo....
// helloooo....
// helloooo....
// helloooo....
// 10 change to 24
// x = 0 e1 = 1 e2 = 0, x = 1 e1 = 2 e2 = 1, x = 2 e1 = 3 e2 = 5, x = 3 e1 = 4 e2 = 10
