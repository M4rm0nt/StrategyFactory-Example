public class ConcreteStrategyB implements Strategy {
    @Override
    public boolean isApplicable(String type) {
        return "B".equalsIgnoreCase(type);
    }

    @Override
    public void execute() {
        System.out.println("Ausführung von Strategie B");
    }
}