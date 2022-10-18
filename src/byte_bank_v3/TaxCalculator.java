package byte_bank_v3;

public class TaxCalculator {
	
	private double taxSum;
	
	public void register(Taxable taxable) {
		
		this.taxSum += taxable.getTaxValue();
	}
	
	public double getTaxSum() {
		return taxSum;
	}
}
