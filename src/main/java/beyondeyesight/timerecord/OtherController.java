package beyondeyesight.timerecord;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtherController {

    @GetMapping("/other")
    public ResponseEntity<Object> other() {
        return new ResponseEntity<>("DELETE Other API triggered", null, HttpStatus.OK);
    }
}
