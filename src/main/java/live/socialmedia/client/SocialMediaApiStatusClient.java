package live.socialmedia.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "socialMediaApi", url = "${api.baseUrl}",
        fallback = SocialMediaApiStatusClient.SocialMediaApiStatusClientFallback.class)

public interface SocialMediaApiStatusClient {

    @GetMapping("${api.endpoint}")
    String getApiStatus();

    @Component
    final class SocialMediaApiStatusClientFallback implements SocialMediaApiStatusClient {

        @Override
        public String getApiStatus() {
            return null;
        }

    }
}
