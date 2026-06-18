public class product {
    int productId;
    String productName;
    int quantity;
    double price;
    public product(int productId,String productName,int quantity,double price){
        this.productId=productId;
        this.productName=productName;
        this.quantity=quantity;
        this.price=price;
    }
    @Override
    public String toString(){
        return productId+" "+productName+" "+quantity+" "+price;
    }
}
