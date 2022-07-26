package springbootstart.springapp.topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbootstart.springapp.dao.Topicreposiratory;

import java.util.List;

@Service
public class TopicService {
@Autowired
private Topicreposiratory topicreposiratory;

 /*   private List<Topic> topics=new ArrayList<>(Arrays.asList(

            new Topic("12ERQ","spring","springDescription"),
                new Topic("java","java spring","java spring Description"),
                new Topic("java script","java script framework","java script ōDescription")
        ));*/
    public List<Topic> getAllTopics(){
       List<Topic> list=(List<Topic>)this.topicreposiratory.findAll();
        return list;
    }

    public Topic getTopic(int id){
        Topic topic=null;
        try {
           topic= this.topicreposiratory.findById(id);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    return topic;
    }


    public Topic addTopics(Topic t) {
      Topic result=topicreposiratory.save(t);
      return result;
    }

    public void updateTopics(int id, Topic t) {
        t.setId(id);
       topicreposiratory.save(t);
    }

    public void delTopic(int id) {
        topicreposiratory.deleteById(id);
    }
}
