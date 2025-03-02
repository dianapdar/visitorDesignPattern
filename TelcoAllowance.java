class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, int promoPrice) {
        return telcoName + " offers data at PHP " + promoPrice + " per month.";
    }
}