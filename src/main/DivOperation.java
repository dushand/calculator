import java.math.BigDecimal;

public class DivOperation extends BinaryOperation{

	@Override
	protected BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
		return value1.divide(value2);
	}

}
