package socialMediaAdapter;

public class Main {
    public static void main(String[] args) {
        SocialMediaAggregator aggregator = new SocialMediaAggregator();

        // Add platform adapters
        aggregator.addAdapter(new TwitterAdapter(new TwitterAPI()));
        aggregator.addAdapter(new FacebookAdapter(new FacebookAPI()));
        aggregator.addAdapter(new InstagramAdapter(new InstagramAPI()));

        // Display all posts
        aggregator.displayAllPosts();
    }
}
