package com.amey.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by USER on 08/12/2017.
 */
@RestController
public class LuckyWorldController {

    @Value("${lucky-word}")
    String luckyWord;

    @GetMapping("/lucky-word")
    public String getLucky(){
            return "Here : "+luckyWord;
    }

}
