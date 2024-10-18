package RemoteRepoNexux.GenericsJava;

public class GenericExample <T>{
    //here I'll specify type parameter which help me define the type of object of this class
    T anything;

    public GenericExample(T anything) {
        this.anything = anything;
    }

    public void printNumber () {
        System.out.println(anything);
    }

}
