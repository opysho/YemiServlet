package za.co.fnb.Fee;

import java.util.Objects;

public class Fee {

	private String personalNumber;
	private String purposeOfPayment;
	private String dateOfPayment;
	private double initialAmount;
	private double amountPaid;
	private double amountBalance;

	public Fee(String personalNumber, String purposeOfPayment, String dateOfPayment, double initialAmount, double amountPaid, double amountBalance) {
		super();
		this.personalNumber = personalNumber;
		this.purposeOfPayment = purposeOfPayment;
		this.dateOfPayment = dateOfPayment;
		this.initialAmount = initialAmount;
		this.amountPaid = amountPaid;
		this.amountBalance = amountBalance;
	}

	public Fee() {

	}
	
	
	

	public String getPersonalNumber() {
		return personalNumber;
	}

	public void setPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}

	public String getPurposeOfPayment() {
		return purposeOfPayment;
	}

	public void setPurposeOfPayment(String purposeOfPayment) {
		this.purposeOfPayment = purposeOfPayment;
	}

	public double getInitialAmount() {
		return initialAmount;
	}

	public void setInitialAmount(double initialAmount) {
		this.initialAmount = initialAmount;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public double getAmountBalance() {
		return amountBalance;
	}

	public void setAmountBalance(double amountBalance) {
		this.amountBalance = amountBalance;
	}

	public String getDateOfPayment() {
		return dateOfPayment;
	}

	public void setDateOfPayment(String dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}

	@Override
	public String toString() {
		return "Fee [personalNumber=" + personalNumber + ", purposeOfPayment=" + purposeOfPayment + ", dateOfPayment="
				+ dateOfPayment + ", initialAmount=" + initialAmount + ", amountPaid=" + amountPaid + ", amountBalance="
				+ amountBalance + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(amountBalance, amountPaid, dateOfPayment, initialAmount, personalNumber, purposeOfPayment);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fee other = (Fee) obj;
		return Double.doubleToLongBits(amountBalance) == Double.doubleToLongBits(other.amountBalance)
				&& Double.doubleToLongBits(amountPaid) == Double.doubleToLongBits(other.amountPaid)
				&& Objects.equals(dateOfPayment, other.dateOfPayment)
				&& Double.doubleToLongBits(initialAmount) == Double.doubleToLongBits(other.initialAmount)
				&& Objects.equals(personalNumber, other.personalNumber)
				&& Objects.equals(purposeOfPayment, other.purposeOfPayment);
	}

	

	

}
