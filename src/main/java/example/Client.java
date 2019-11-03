package example;

public class Client {

    public static void main(String[] args) {
        AuthenticationProcessor processor = new example.CookieProcessor(new example.OAuthProcessor(new CredentialsProcessor(null)));
        processor.isAuthorized("Credentials");
    }

}