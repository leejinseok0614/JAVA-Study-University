package ch02;

public class VIPCustomer extends Customer {

	private int agentID;
	double saleRatio;

	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.5;
		saleRatio = 0.1;

		System.out.println("VIPCustomer() »£√‚");
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
}
