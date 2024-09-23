package testDomeNOKIA;

public class MegaStore {

    public enum DiscountType {
        Standard, Seasonal, Weight;
    }

    public static double getDiscountedPrice(double cartWeight, double totalPrice, DiscountType discountType) {
        double discount = 0.0;

        if(discountType.equals(DiscountType.Standard)) {
            /** 6% discount */
            discount = totalPrice * 6/100;
        } else if (discountType.equals(DiscountType.Seasonal)) {
            /** 12% discount */
            discount = totalPrice * 12/100;
        } else if(discountType.equals(DiscountType.Weight)){
            if(cartWeight <= 10) {
                /** 6% discount */
                discount = totalPrice * 6/100;
            } else if (cartWeight > 10) {
                /** 18% discount */
                discount = totalPrice * 18/100;
            } 
        }

        return totalPrice - discount;
    }

    public static void main(String[] args) {
        System.out.println(getDiscountedPrice(12, 100, DiscountType.Weight));
    }
}
