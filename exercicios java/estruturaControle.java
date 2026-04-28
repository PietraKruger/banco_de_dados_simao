import java.util.Scanner;

public class estruturaControle {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("=====ROBLOX=====");
    System.out.println("1 - JOGAR");
    System.out.println("2 - CONFIGURAÇÕES");
    System.out.println("3 - SAIR");

    int option = scanner.nextInt();

    switch (option) {
      case 1:
        System.out.println("Iniciando jogo...");
        break;
      case 2:
        System.out.println("Abrindo configurações...");
        break;
      case 3:
        System.out.println("Saindo...");
        break;
      default:
        System.out.println("Opção inválida!");
    }
  }
}
