package ecmainterface;
public interface ConsumerInterface {
    final double Tax =0.04;
    public void calculate_BillWithTax();
    public boolean check_ConsumerType();
    public void calculate_BillWithServiceCharge();
    public boolean check_Discount();
    public void calculate_BillWithDiscount();
}
