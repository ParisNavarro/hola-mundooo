package holamundo;

public class printholamundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SUBO LA CLASE A GITHUB.
	}
// Parte Paris
}

package holamundo;

public class PrintHolaMundo {

    public static void main(String[] args) {
        // Creamos una instancia de la clase Mensaje
        Mensaje mensaje = new Mensaje();
        
        // Imprimimos el mensaje de bienvenida
        mensaje.imprimirMensaje();
        
        // Fin del programa
        System.out.println("El programa ha finalizado correctamente.");
    }
}

class Mensaje {
    
    // Método para imprimir el mensaje de "Hola Mundo"
    public void imprimirMensaje() {
        System.out.println("¡Hola, Mundo!");
    }
}
