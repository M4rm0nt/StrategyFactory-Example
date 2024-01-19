import java.util.ArrayList;
import java.util.List;

public class StrategyFactory {
    private final List<Strategy> strategies;

    public StrategyFactory() {
        strategies = new ArrayList<>();
        strategies.add(new ConcreteStrategyA());
        strategies.add(new ConcreteStrategyB());
    }

    public Strategy getStrategy(String type) {
        for (Strategy strategy : strategies) {
            if (strategy.isApplicable(type)) {
                return strategy;
            }
        }
        return null;
    }
}
