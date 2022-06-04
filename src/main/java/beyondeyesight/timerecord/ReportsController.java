package beyondeyesight.timerecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ReportsController {

    @GetMapping(value = "/reports/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getReports(@PathVariable("id") String id) {
        return new ResponseEntity<>("GET Reports API triggered", null, HttpStatus.OK);
    }
    @GetMapping(value = "/report/billing/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getReportBill(@PathVariable("id") String id) {
        return new ResponseEntity<>("GET Report Billing API triggered", null, HttpStatus.OK);
    }
    @DeleteMapping("/reports/{id}")
    public ResponseEntity<Object> deleteReport(@PathVariable String id) {
//        Object response = restTemplate.getForObject("https://localhost:8443/realms/Labaratory/.well-known/uma2-configuration", Object.class);
//        System.out.println(response);
        return new ResponseEntity<>("DELETE Reports API triggered", null, HttpStatus.OK);
    }
}


