public class Main {

    public static void main(String[] args) {
        //ICustomerDal customerDal = new OracleCustomerDal(); //polymorphism

         CustomerManager customerManager = new CustomerManager(new SqlServerDal());
//        customerManager.customerDal = new SqlServerDal();

        customerManager.add();
    }
}
