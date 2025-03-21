package socialMediaAdapter;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaAggregator {
    private List<SocialMediaAdapter> adapters = new ArrayList<>();

    public void addAdapter(SocialMediaAdapter adapter) {
        adapters.add(adapter);
    }

    public void displayAllPosts() {
        for (SocialMediaAdapter adapter : adapters) {
            System.out.println("Fetching posts...");
            List<String> posts = adapter.fetchPosts();
            for (String post : posts) {
                System.out.println(post);
            }
            System.out.println("---------------------------");
        }
    }
}