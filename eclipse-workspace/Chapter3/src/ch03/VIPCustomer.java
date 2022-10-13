package ch03;

public class VIPCustomer extends Customer {

	private int agentID;
	double saleRatio;

	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
}
