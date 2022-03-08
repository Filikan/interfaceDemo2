public class SqlServerDal implements ICustomerDal,IRepository{
    @Override
    public void Add() {
        System.out.println("SQL Server eklendi.");
    }
}
