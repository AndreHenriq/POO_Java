package Ex_Aula_162.Entities;

public class ImportedProducts extends Product {
    private double customFee;

    public ImportedProducts(String name, double price, double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(double customFee) {
        this.customFee = customFee;
    }

    @Override
    public String priceTag() {
        return getName()
                + "$"
                + String.format("%.2f", totalPrice())
                +" custom fee: $"
                +String.format("%.2f", customFee)
                +")";
    }

    private double totalPrice() {
        return getPrice() + customFee;
    }
}
