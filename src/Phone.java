public class Phone {
    final private String name;
    private double price;
    private double discountPrice;
    Phone(String name, double price){
        this.name = name;
        this.price = price;
        discountPrice = price;
    }
    @Override
    public String toString() {
        return "Phone{" +
                "Name = " + name +
                ", Original price = " + price +
                ", Discount price = " + discountPrice +
                '}';
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }
    public void setDiscountPrice(Seasons season) {
        switch (season){
            case Winter:{
                discountPrice = getSeasonPrice((price)-> price - 100);
                break;
            }
            case Spring:{
                discountPrice =  getSeasonPrice((price)-> price * 0.9);
                break;
            }
            case Summer:{
                discountPrice =  getSeasonPrice((price)-> (price * 0.9) - 100);
                break;
            }
            case Autumn:{
                discountPrice =  getSeasonPrice((price)-> price - 150);
                break;
            }
        }
    }
    private double getSeasonPrice(SeasonPrice fun){
        return fun.calcPrice(price);
    }

}
