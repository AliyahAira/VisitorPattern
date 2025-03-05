public class UnliCallTextPackage implements UnliCallsTextOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCalltext) {
       return telcoName + (unliCalltext ? "offers unlimited calls and texts." :  " does not offer unlimited calls and texts.");
        
    }
}