package springbootstart.springapp.dao;

import org.springframework.data.repository.CrudRepository;
import springbootstart.springapp.topic.Topic;

public interface Topicreposiratory extends CrudRepository<Topic,Integer> {
    public Topic findById(int id);

}
