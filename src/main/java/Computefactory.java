public class Computefactory {

    private static Add add = new Add();
    private static Sub sub = new Sub();

    public static Computable getCompute(String symbol) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return (Computable) Class.forName(symbol).newInstance();
    }
}
