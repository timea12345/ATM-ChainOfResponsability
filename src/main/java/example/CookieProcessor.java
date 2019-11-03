package example;

public class CookieProcessor extends AuthenticationProcessor {

    public CookieProcessor (AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    boolean isAuthorized(String auth) {
        if(auth.equals("Cookie")) {
            System.out.println("logged with Cookie");
            return true;
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(auth);
        }
        return false;
    }
}