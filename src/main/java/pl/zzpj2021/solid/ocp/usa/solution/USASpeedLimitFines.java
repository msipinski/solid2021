package pl.zzpj2021.solid.ocp.usa.solution;

public class USASpeedLimitFines {

	public double calcualateSpeedLimitFine(FineCalculatorInterface calculator, int speed) {
		return calculator.calculate(speed);
	}

}
