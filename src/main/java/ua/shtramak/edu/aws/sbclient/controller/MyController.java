package ua.shtramak.edu.aws.sbclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class MyController {

    @GetMapping("/public")
    public String getByPublic() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://16.170.250.222/stats", String.class);
    }

    @GetMapping("/private")
    public String getByPrivate() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://172.31.36.202/stats", String.class);
    }


}
