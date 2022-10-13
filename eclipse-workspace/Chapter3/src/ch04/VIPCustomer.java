package ch04;

public class VIPCustomer extends Customer {

	private int agentID;
	double saleRatio;

	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);

		customerGrade = "VIP";
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int) (price + saleRatio);
		return price;
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
}
