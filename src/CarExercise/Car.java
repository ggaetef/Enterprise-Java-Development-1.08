package CarExercise;

abstract class Car {
    //Que el además el método sea extracto (no necesario) significa que
    public abstract void vinNumber();
    public abstract void make();
    public abstract void model();
    public abstract void mileage();
    public void info(){
        System.out.println("Clase abstracta Car");

    }
}
