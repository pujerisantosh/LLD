package socialMediaAdapter;

import java.util.List;

public class FacebookAdapter implements SocialMediaAdapter{

    private FacebookAPI facebookAPI;

    public FacebookAdapter(FacebookAPI facebookAPI) {
        this.facebookAPI = facebookAPI;
    }

    @Override
    public List<String> fetchPosts() {
        List<String> posts = facebookAPI.getFacebookPosts();
        if (posts == null || posts.isEmpty()) {
            System.out.println("No Facebook posts available.");
        }
        return posts;
    }
}
