package calculator;

@FunctionalInterface
public interface Operation {
	public Double calculate(Double x, Double y);
}
