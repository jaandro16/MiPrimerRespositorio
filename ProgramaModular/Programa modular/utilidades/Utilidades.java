package utilidades;
import java.util.Scanner;

public class Utilidades {
  
  public static String cadena (String mensaje) {
    Scanner sc = new Scanner(System.in);
    System.out.print(mensaje);
    String a=sc.nextLine();
    return a;
  }

  public static int numero (String mensaje) {
    Scanner sc = new Scanner(System.in);
    System.out.print(mensaje);
    int a=sc.nextInt();
    return a;
  }
}
