public class Calculator {
    public int compute(int num1, int num2, String symbol) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Computable computable = Computefactory.getCompute(symbol);
        int compute = computable.compute(num1, num2);
        return compute;

    }
}
