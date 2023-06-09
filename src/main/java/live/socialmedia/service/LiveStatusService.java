package live.socialmedia.service;

import live.socialmedia.client.SocialMediaApiStatusClient;
import live.socialmedia.model.LiveStatus;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

@Service
public class LiveStatusService {

    private SocialMediaApiStatusClient socialMediaApiStatus;

    public LiveStatusService(SocialMediaApiStatusClient socialMediaApiStatus) {
        this.socialMediaApiStatus = socialMediaApiStatus;
    }

    @NonNull
    public LiveStatus getLiveStatus() {
        long last = System.currentTimeMillis();
        String apiStatusResponse;
        try {
            apiStatusResponse = socialMediaApiStatus.getApiStatus();
        } catch (Exception e) {
            apiStatusResponse = null;
        }
        if (apiStatusResponse!=null) {
        }
        return new LiveStatus(String.format("%dms", (System.currentTimeMillis() - last)),
                isAvailable(apiStatusResponse));
    }

    private boolean isAvailable(@Nullable String apiStatusResponse) {
        return apiStatusResponse != null && apiStatusResponse.equalsIgnoreCase("RUNNING");
    }
}
