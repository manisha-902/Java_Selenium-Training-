package ass1;

public class Couponsys {
	static String platformName = "ShopX";
    String userId;

    Couponsys(String userId) {
        this.userId = userId;
    }

    void applyCoupon(String code) {
        boolean isEligible = code.equals("SAVE20");
        if (isEligible) {
            System.out.println("Coupon Applied: 20% Off");
        } else {
            System.out.println("Invalid Coupon Code");
        }
    }

    public static void main(String[] args) {
        Couponsys user = new Couponsys("user123");
        user.applyCoupon("SAVE20");
    }

}
