package customer;

public class Customer {

        private String name;
        private Address homeAddress;
        private Address workAddress;

            public Customer(String name, Address homeAddress) {
                this.name = name;
                this.homeAddress = homeAddress;
            }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }
}
