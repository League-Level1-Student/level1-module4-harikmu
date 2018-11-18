package Calculator;
class CalculatorRunner {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		View view = new View();
		Controller controller = new Controller(calculator, view);
	}
}