package lab.aikibo.component;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by tamami on 26/06/17.
 */
@Component
public class Sender {

    private RabbitMessagingTemplate template;

    @Autowired
    public Sender(RabbitMessagingTemplate template) {
        this.template = template;
    }

    @Bean
    public Queue queueSearch() {
        return new Queue("SearchQ", false);
    }

    @Bean
    public Queue queueCheckIn() {
        return new Queue("CheckINQ", false);
    }

    public void send(Object message) {
        template.convertAndSend("SearchQ", message);
    }

}
