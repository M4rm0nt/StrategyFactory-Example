public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context("A");
        context.executeStrategy();

        context = new Context("B");
        context.executeStrategy();

        context = new Context("");
        context.executeStrategy();
    }
}