abstract class TelcoSubscription {
    protected String telcoName;
    protected int dataAllowance;
    protected int promoPrice;
    protected boolean unliCallText;

    // Constructor to initialize telco subscription details
    public TelcoSubscription(String telcoName, int dataAllowance, int promoPrice, boolean unliCallText) {
        this.telcoName = telcoName;
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.unliCallText = unliCallText;
    }

    // Getters for telco properties
    public String getTelcoName() {
        return telcoName;
    }

    public int getPromoPrice() {
        return promoPrice;
    }

    public boolean getUnliCallText() {
        return unliCallText;
    }
}