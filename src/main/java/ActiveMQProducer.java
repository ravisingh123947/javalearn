import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jms.*;

public class ActiveMQProducer {

    public static void main(String[] args) {

        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();


        Connection connection = null;
        try {
            connection = connectionFactory.createConnection();
            Session session = connection.createSession(false,
                    Session.AUTO_ACKNOWLEDGE);
            connection.start();
            Queue queue = session.createQueue("vesselPositionUpdate_Q");
            MessageProducer producer = session.createProducer(queue);
            TextMessage message = session.createTextMessage("123455");
            producer.send(message);
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    }

