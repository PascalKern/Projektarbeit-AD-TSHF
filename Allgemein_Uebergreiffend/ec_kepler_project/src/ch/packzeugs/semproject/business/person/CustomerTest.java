/**
 * TODO Class description
 * 
 * @name
 * @version
 * @author	PKern and DMarmy
 */
package ch.packzeugs.semproject.business.person;

/**
 * @author pascal
 *
 */
public class CustomerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer custom = new Customer("Pascal","Kern");
		custom.saveCustomer();
		
		String[] customArr = {"David","Marmy"};
		Customer custom2 = new Customer(customArr);
		custom2.saveCustomer();
		
		Customer custom3 = Customer.findCustomer(1);
		System.out.printf("Found Customer (ID=1): %s, %s\n", custom3.getName(), custom3.getSurname());
		
		Customer custom4 = Customer.findCustomer(0);
		System.out.printf("Found Customer (ID=0): %s, %s\n", custom4.getName(), custom4.getSurname());
		
		Customer custom5 = Customer.findCustomer(2);
		System.out.printf("Found Customer (ID=2): %s, %s\n", custom5.getName(), custom5.getSurname());

		
	}

}
