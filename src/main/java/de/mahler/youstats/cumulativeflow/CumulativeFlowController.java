package de.mahler.youstats.cumulativeflow;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@RequestMapping("/cumulativeflow")
@RestController
public class CumulativeFlowController {

    private RestTemplate restTemplate;

    @Autowired
    public CumulativeFlowController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("/show")
    public Map<String, Object> showCumulativeFlowData() {
        HashMap<String, Object> map = Maps.newHashMap();
        map.put("hello", "world");
        return map;
    }

}
