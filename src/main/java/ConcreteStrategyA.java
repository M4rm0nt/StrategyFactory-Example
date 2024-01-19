public class ConcreteStrategyA implements Strategy {
    @Override
    public boolean isApplicable(String type) {
        return "A".equalsIgnoreCase(type);
    }

    @Override
    public void execute() {
        System.out.println("Ausführung von Strategie A");
    }
}