package live.socialmedia.client;


import live.socialmedia.model.ApiStatusResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "socialMediaApi", url = "${api.baseUrl}",
        fallback = SocialMediaApiStatusClient.SocialMediaApiStatusClientFallback.class)

public interface SocialMediaApiStatusClient {

    @GetMapping("${api.endpoint}")
    ApiStatusResponse getApiStatus();

    @Component
    final class SocialMediaApiStatusClientFallback implements SocialMediaApiStatusClient {

        @Override
        public ApiStatusResponse getApiStatus() {
            return null;
        }

    }
}
