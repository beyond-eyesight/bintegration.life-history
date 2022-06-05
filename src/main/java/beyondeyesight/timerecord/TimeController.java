package beyondeyesight.timerecord;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/times")
public class TimeController {

    @GetMapping
    public ResponseEntity<String> testGet() {
        return ResponseEntity.ok("get success");
    }
}
