package structural.facade.exercise;

public class TwitterService {
    public String getRecentTweet(String username) {
        var api = new TwitterAPI();
        var user = new User(username);
        var requestToken = api.getRequestToken(user);
        var accessToken = api.exchange(requestToken);
        return api.getRecentTweet(accessToken).getContent();
    }
}
