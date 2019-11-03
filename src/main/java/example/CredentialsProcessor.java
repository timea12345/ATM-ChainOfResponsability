package example;

public class CredentialsProcessor extends AuthenticationProcessor {

    public CredentialsProcessor (AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    boolean isAuthorized(String auth) {
        if(auth.equals("Credentials")) {
            System.out.println("logged with Credentials");
            return true;
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(auth);
        }
        return false;
    }
}
