package springbootstart.springapp.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class TopicController {
    @Autowired
    private TopicService topicservice;
    @RequestMapping("/topic")
    public List<Topic> getAllTopics()
    {
        return topicservice.getAllTopics();
    }
    @RequestMapping("/topic/{id}")
    public Topic getTopic(@PathVariable String id)
    {
        return topicservice.getTopic(id);
    }

}
