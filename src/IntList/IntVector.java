package IntList;

public class IntVector implements IntList{

    public static final int INITIAL_CAPACITY = 20;
    private int[] array;
    private int indice;


    //Constructor
    public IntVector(){
        this.array = new int[INITIAL_CAPACITY];
        this.indice = 0;
    }


    @Override
    public void add(int item) {
        if (indice == array.length) {
            int newCapacity = (int) (array.length * 2);
            int [] newArray = new int [newCapacity];

            for (int i=0; i< array.length ; i++ ){
                newArray [i] = array [i];
            }
            array = newArray;
        }
        array [indice] = item;
        indice++;
    }

    @Override
    public int get(int id) {
        return array [id];
    }
}
