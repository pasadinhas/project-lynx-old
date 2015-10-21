package pt.ist.syllabus;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/topic")
public class TopicController implements InitializingBean {

    private TopicRepository topicRepository;

    @Autowired
    public TopicController(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    @RequestMapping
    public Collection<Topic> listAll(Model model) {
        //model.addAttribute("topics", topicRepository.findAll());
        //return "topics/list";
        return topicRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public String createTopic(Topic topic) {
        topicRepository.save(topic);
        return "redirect:/topic";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Topic xpto = new Topic();
        xpto.setName("XPTO");
        topicRepository.save(xpto);
    }
}
