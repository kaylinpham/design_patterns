package structural.facade.exercise;

public class TwitterAPI {
    public RequestToken getRequestToken(User user) {
        return new RequestToken(user);
    }

    public AccessToken exchange(RequestToken requestToken) {
        return new AccessToken();
    }

    public Tweet getRecentTweet(AccessToken accessToken) {
        return new Tweet("Hello World");
    }
}
