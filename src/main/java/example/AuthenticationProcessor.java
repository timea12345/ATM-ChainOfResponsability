package example;

public abstract class AuthenticationProcessor {

    AuthenticationProcessor nextProcessor;


    public AuthenticationProcessor(AuthenticationProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    abstract boolean isAuthorized(String auth);
}
