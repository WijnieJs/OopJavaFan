package customer;

public class AppRunner      {

        public static void main(String[] args) {

            Address homeAddress = new Address("line1" , "hyderabad", "500035");
            Customer customer = new Customer("WijnyJavaJs", homeAddress);

            Address workingAddress = new Address("lin", "dragon", "777");
            customer.setWorkAddress(workingAddress);


            System.out.println(customer);
        }
}
