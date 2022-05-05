package springbootstart.springapp.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @RequestMapping("/topic")
    public List<Topic> getAllTopics()
    {
        return Arrays.asList(
                new Topic("12ERQ","spring","springDescription"),
                new Topic("java","java spring","javaspringDescription"),
                new Topic("java script","java script framework","java script ōDescription")
        );
    }
}
