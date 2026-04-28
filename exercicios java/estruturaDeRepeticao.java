public class estruturaDeRepeticao {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int senha;

    System.out.println("Digite a senha:");
    senha = scanner.nextInt();

    while (senha != 1234) {
      System.out.println("Senha incorreta");
      System.out.println("Digite a senha novamente");
      senha = scanner.nextInt();

      System.out.println("Login realizado");
    }
  }
}
