import Metodos.Metodos;

public class Academy {
    public static void main(String[] args) {

        boolean usuarioAutenticado = false;
        Metodos.comprueba();
        // Bucle principal que se ejecutará hasta que el usuario sea autenticado
        if (usuarioAutenticado) {
            System.out.println( "\tHAS ALCANZADO EL MAXIMO DE INTENTOS. \n\tVUELVE MAÑANA!");
        } else {
            //Mostramos menu con campos disponibles o futuros
            Metodos.Cursos();
        }
    }
}