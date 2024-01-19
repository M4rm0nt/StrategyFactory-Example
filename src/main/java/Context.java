public class Context {
    private final Strategy strategy;

    public Context(String type) {
        StrategyFactory factory = new StrategyFactory();
        this.strategy = factory.getStrategy(type);
    }

    public void executeStrategy() {
        if (strategy != null) {
            strategy.execute();
        } else {
            System.out.println("Keine gültige Strategie definiert.");
        }
    }
}
