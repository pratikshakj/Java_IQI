public class Lt {
     public static void main(String[] args) {
    int rows = 5;

    for (int i = 1; i <= rows; i++) {
        for(int j=2*(rows-i);j>=0;j--){
            System.out.print(" ");
        }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
