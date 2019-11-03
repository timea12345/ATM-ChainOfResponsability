package example;

public class OAuthProcessor extends AuthenticationProcessor {

    public OAuthProcessor(AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    boolean isAuthorized(String auth) {
        if(auth.equals("OAuth")) {
            System.out.println("logged with OAuth");
            return true;
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(auth);
        }
        return false;
    }
}