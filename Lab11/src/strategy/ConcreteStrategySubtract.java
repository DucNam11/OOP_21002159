package strategy;

public class ConcreteStrategySubtract implements Strategy {

    public int execute(int a, int b) {
        return a - b;
    }
}
