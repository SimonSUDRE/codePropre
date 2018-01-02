package demeter.noncorrige;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ETY8
 * class Paper Boy
 */
public class PaperBoy {
	private List<Customer> customers;
	private double funds;

	/**
	 * constructeur par default
	 */
	public PaperBoy() {
		this.customers = new ArrayList<>();
	}

	/**
	 * methode de collecte de payement
	 */
	public void collectPayments() {
		// Le journal coûte 1€
		double payment = 1.0;

		for (Customer customer : customers) {
			if (customer.getWallet().getMoney() >= payment) {
				funds += payment;
				customer.getWallet().setMoney(customer.getWallet().getMoney() - payment);
			}
		}
	}

	/**
	 * Getter for customers
	 * 
	 * @return the customers
	 */
	public List<Customer> getCustomers() {
		return customers;
	}

	/**
	 * Setter
	 * 
	 * @param customers the customers to set
	 */
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	/**
	 * Getter for funds
	 * 
	 * @return the funds
	 */
	public double getFunds() {
		return funds;
	}

	/**
	 * Setter
	 * 
	 * @param funds the funds to set
	 */
	public void setFunds(double funds) {
		this.funds = funds;
	}
}
