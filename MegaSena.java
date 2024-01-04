import java.util.Random;
import java.util.Scanner;

public class MegaSena {

  static String gerado = "";
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      gerado = "";

      System.out.println("Deseja gerar o sorteio (s/n)");

      char escolha = scan.next().charAt(0);

      if(escolha != 's') return;

      genNumberMegaSena();
      System.out.println(gerado);
      main(args);
  }

 private static void genNumberMegaSena() {
  for(int a = 0; a < 6; a++) {
    int random = new Random().nextInt(60);
    gerado += random + " ";
  }
  }
}