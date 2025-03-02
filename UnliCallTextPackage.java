class UnliCallTextPackage implements UnliCallOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean hasUnli) {
        return hasUnli ? telcoName + " provides unlimited calls and texts."
                       : telcoName + " does not offer unlimited calls and texts.";
    }
}