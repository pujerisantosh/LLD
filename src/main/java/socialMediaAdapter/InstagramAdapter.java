package socialMediaAdapter;

import java.util.List;

public class InstagramAdapter implements SocialMediaAdapter{

    private InstagramAPI instagramAPI;

    public InstagramAdapter(InstagramAPI instagramAPI) {
        this.instagramAPI = instagramAPI;
    }

    @Override
    public List<String> fetchPosts() {
        List<String> posts = instagramAPI.getInstagramPosts();
        if (posts == null || posts.isEmpty()) {
            System.out.println("No Instagram posts available.");
        }
        return posts;
    }
}
