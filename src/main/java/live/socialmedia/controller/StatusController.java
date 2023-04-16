package live.socialmedia.controller;


import live.socialmedia.model.LiveStatus;
import live.socialmedia.service.LiveStatusService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/devops/api/status")
public class StatusController {

    private LiveStatusService statusService;

    public StatusController(LiveStatusService statusService) {
        this.statusService = statusService;
    }

    @GetMapping
    public ResponseEntity<LiveStatus> liveStatus() {
        return new ResponseEntity<>(statusService.getLiveStatus(), HttpStatus.OK);
    }

}
