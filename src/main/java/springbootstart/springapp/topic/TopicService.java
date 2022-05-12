package springbootstart.springapp.topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class TopicService {

    private List<Topic> topics=new ArrayList<>(Arrays.asList(
            new Topic("12ERQ","spring","springDescription"),
                new Topic("java","java spring","java spring Description"),
                new Topic("java script","java script framework","java script ōDescription")
        ));
    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){

        return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
    }


}
