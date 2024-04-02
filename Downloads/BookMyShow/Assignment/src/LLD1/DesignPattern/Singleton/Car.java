package LLD1.DesignPattern.Singleton;

public class Car {
    private static Car car; //static because we want to use in method

    private Car(){ // private constructor

    }

    public static Car getCar(){ // will make our method static to create an object
        // will create an object of this class
       if(car == null){
           synchronized (Car.class){
               if(car == null){
                   car = new Car();
               }
           }
       }
       return car;
    }
}
