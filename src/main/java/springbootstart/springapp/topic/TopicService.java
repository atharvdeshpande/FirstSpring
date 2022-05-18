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


    public void addTopics(Topic t) {
       topics.add(t);
    }

    public void updateTopics(String id, Topic t) {

        for (int i=0;i<topics.size();i++)
        {
            Topic top=topics.get(i);
            if(top.getId().equals(id))
            {
                topics.set(i,t);
                return;
            }
        }
    }

    public void delTopic(String id) {
        topics.removeIf(t ->t.getId().equals(id));
    }
}
