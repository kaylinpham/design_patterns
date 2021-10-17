package structural.facade.exercise;

public class Main {
    public static void main(String[] args) {
        var service = new TwitterService();
        var username = "kaylinpham";
        var tweet = service.getRecentTweet(username);
        System.out.println("Recent tweet of " + username + ": " + tweet);
    }
}
