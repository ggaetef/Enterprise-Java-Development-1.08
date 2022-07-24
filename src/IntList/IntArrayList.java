package IntList;

public class IntArrayList implements IntList{

    public static final int INITIAL_CAPACITY = 10;
    private int[] array;

    //Constructor crea por defecto 10 elementos
    public IntArrayList(){
        this.array = new int[INITIAL_CAPACITY];

    }
    //Array busca si espacio está disponible (null) y luego avanza.
    // Si no hay espacio debe ampliar el array un 50%.
    //Se puede hacer creando un nuevo array y transferir el primero al segundo.

    @Override
    public void add(int item) {
        for (int i = 0; i < array.length; i++) {

        }
    }

    //Retorna la posición en el array. Se podría ademas comprobar si el id está fuera del array.
    @Override
    public int get(int id) {
        return array [id];
    }
}
