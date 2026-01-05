package Arrays;

public class Image {
  public static void main(String[] args) {
    int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
    flipAndInvertImage(image);
  }

  public static void flipAndInvertImage(int[][] image) {
    int len = image.length - 1;
    for (int i = 0; i < image.length; i++) {
      len = image.length - 1;
      for (int j = 0; j <= image.length / 2 - 1; j++, len--) {
        int swap = image[i][j];
        image[i][j] = image[i][len];
        image[i][len] = swap;
        System.out.println(image[i][j]);
      }
    }
    for (int i = 0; i < image.length; i++) {
      for (int j = 0; j < image.length; j++) {
        if (image[i][j] == 0)
          image[i][j] = 1;
        else
          image[i][j] = 0;
      }
    }
    for (int i = 0; i < image.length; i++) {
      for (int j = 0; j < image.length; j++) {
        System.out.print(image[i][j] + " ");
      }
      System.out.println();
    }
  }
}
