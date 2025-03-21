package socialMediaAdapter;

import java.util.List;

public class TwitterAdapter implements  SocialMediaAdapter{

    private TwitterAPI twitterAPI;
    public TwitterAdapter(TwitterAPI twitterAPI){
        this.twitterAPI = twitterAPI;
    }

    @Override
    public List<String> fetchPosts() {
        return twitterAPI.getTweets();
    }
}
