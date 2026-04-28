import java.util.Scanner;

public class EstruturaCondicional203 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor da variavel X)");

    int x = scanner.nextInt();

    System.out.println("Digite o valor da variavel Y)");

    int y = scanner.nextInt();

    if (x > y) {
      System.out.println("A variavel x é maior que y");
    } else if (y > x) {
      System.out.println(" A variavel y é maior que x");
    } else {
      System.out.println("X igual a Y");
    }
  }
}
