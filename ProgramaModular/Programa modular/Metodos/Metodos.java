package Metodos;
import utilidades.Utilidades;

public class Metodos {

  public static void encabezado (){
    System.out.println("\t======= Menú de Inicio de Sesión =======");
  }


  public static boolean comprueba (){
    String[] usuarios = {"usuario1", "usuario2", "usuario3"};
    String[] contrasenas = {"contrasena1", "contrasena2", "contrasena3"};
    String usuario= "";
    String contrasena="";
    boolean usuarioAutenticado = false;
    int intentos = 0;
    final int MAX_INTENTOS = 4;
    while (!usuarioAutenticado && intentos < MAX_INTENTOS) {
      Metodos.encabezado();
      usuario = Utilidades.cadena("\tIntroduce tu nombre de Usuario: ");
      contrasena = Utilidades.cadena("\tIntroduce tu contraseña: ");
      // Verificar credenciales
      for (int i = 0; i < usuarios.length; i++) {
          // Verificar si las credenciales coinciden con algún usuario
          if (usuarios[i].equals(usuario) && contrasenas[i].equals(contrasena)) {
              Metodos.exito();
              usuarioAutenticado = true;
              break; // Salir del bucle principal
          }
      }
      if (!usuarioAutenticado) {
          Metodos.error(intentos++);
          System.out.println(intentos);
      }
    }
    return usuarioAutenticado;
  }


  public static int error (int intentos){
    //Metodo que establece un maximo de 4 intentos de inicio de sesion. Al cuarto intento el programa finaliza.
    String usuario = "";
    System.out.println("\t========================================");
    System.out.println("\n\tLo sentimos " + usuario + ". Sus credenciales son incorrectas." + "\n\tInténtelo de nuevo.");
    System.out.println();
    return intentos;
  }


  public static void exito (){
    String morado = "\033[31m";  
    String blanco = "\033[37m";
    System.out.println("\t========================================");
    System.out.println("\n\t¡Bienvenido a " + morado + "CyberWise_Academy!");
    System.out.println(blanco + "\t¡Tu seguridad es nuestra mision!");
    System.out.println();
  }


  public static void Cursos (){
    System.out.println("\t===================== 0.- Salir =====================");
    System.out.println("\t======= 1.- Campos de aprendizaje disponibles =======");
    System.out.println("\t======= 2.- Campos de aprendizaje futuros ===========");
    //Switch para elegir que campos visualizar
    Metodos.Switch();
  }


  public static void Campos (){
    System.out.println("\t======= 1.- Seguridad de Redes ===========");
    System.out.println("\t======= 2.- Criptografia =================");
    System.out.println("\t======= 3.- Gestion de Incidentes ========");
    System.out.println("\t======= 4.- Gestion de Riesgos ===========");
    //Switch para elegir el tema que queremos visualizar
    Metodos.SwitchCampos();
  }


  public static void Switch () {
    int opcion = Utilidades.numero("\n\tPor favor elija una opcion: ");
    switch (opcion) {
      case 0:
        System.out.println();
        System.out.println("\tSaliendo...");
        break;
      case 1:
        System.out.println();
        //Si se eligen los campos disponibles, visualizar el menu con loa titulos de los campos
        Metodos.Campos();
        break;
      case 2:
        System.out.println();
        System.out.println("\tActualmente no existen campos de aprendizaje en desarrollo");
        System.out.println();
        //Si se elige l opcion 2, mostraremos que no hay campos y volveremos a mostrar el menu para elegir que tipos de campos ver.
        Metodos.Cursos();
        break;
      default: System.out.println("Error, opcion no valida.");
        //Por defecto, volveremos a mostrar el menú para preguntar que cursos se desean visualizar.
        Metodos.Cursos();
        break;
    }
  }



  public static void SwitchCampos () {
    int opcion = Utilidades.numero("\n\tElije un campo (0 para volver): ");
    switch (opcion) {
      case 0:
        System.out.println();
        //Volveremos a la pagina anterior, es decir a elegir entre campos disponibles o futuros
        Metodos.Cursos();
        break;
      case 1:
        System.out.println("\tNo hay informacion disponible");
        System.out.println();
        //Volvemos a mostrar el menu con los temas a estudiar disponibles
        Metodos.Campos();
        break;
      case 2:
        System.out.println("\tNo hay informacion disponible");
        System.out.println();
        //Volvemos a mostrar el menu con los temas a estudiar disponibles
        Metodos.Campos();
        break;
      case 3:
        System.out.println("\tNo hay informacion disponible");
        System.out.println();
        //Volvemos a mostrar el menu con los temas a estudiar disponibles
        Metodos.Campos();
        break;
      case 4:
        System.out.println("\tNo hay informacion disponible");
        System.out.println();
        //Volvemos a mostrar el menu con los temas a estudiar disponibles
        Metodos.Campos();
        break;
      default: System.out.println("Error, opcion no valida.");
        //Por defecto, volvemos a mostrar el menu con los temas a estudiar disponibles
        Metodos.Campos();
        break;
    }
  }
}