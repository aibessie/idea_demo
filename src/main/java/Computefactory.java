public class Computefactory {

    private static Add add = new Add();
    private static Sub sub = new Sub();

    public static Computable getCompute(char symbol){
        switch (symbol){
            case '+':
                return add;
            case '-':
                return sub;
            default:
                throw new IllegalArgumentException();
        }
    }
}
