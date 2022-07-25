package springbootstart.springapp.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;


@RestController
public class TopicController {
    @Autowired
    private TopicService topicservice;
    @GetMapping("/topic")
    public ResponseEntity<List<Topic>> getAllTopics()
    {
        List<Topic> list=topicservice.getAllTopics();
        if(list.size()<=0)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }
    @GetMapping("/topic/{id}")
    public ResponseEntity<Topic> getTopic(@PathVariable int id)
    {
        Topic t=topicservice.getTopic(id);
        if(t==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
        return ResponseEntity.of(Optional.of(t));
    }
    @PostMapping("/topic")
    public ResponseEntity<Topic> addTopics(@RequestBody Topic t)
    {
        Topic to;
        try
        {
        to=this.topicservice.addTopics(t);
            System.out.println(t);
            return ResponseEntity.of(Optional.of(to));
        }catch (Exception e){
        e.printStackTrace();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/topic/{id}")
    public ResponseEntity<Topic> updateTopics(@RequestBody Topic t,@PathVariable int id)
    {

        try {
            this.topicservice.updateTopics(id,t);
            return ResponseEntity.ok().body(t);
        }
        catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    @DeleteMapping("/topic/{id}")
    public ResponseEntity<Void> delTopic(@PathVariable int id)
    {
        try {
            topicservice.delTopic(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }
}

