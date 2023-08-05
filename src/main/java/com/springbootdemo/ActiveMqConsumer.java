package com.springbootdemo;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Queue;

@EnableJms
public class ActiveMqConsumer {

    @Autowired
    static JmsTemplate jmsTemplate;
    public static void main(String[] args) {

        try {
            Queue queue = new Queue() {
                @Override
                public String getQueueName() throws JMSException {
                    return "vesselPositionUpdate_Q";
                }
            };

            MessageConsumer consumer = jmsTemplate.getConnectionFactory().createConnection().createSession()
                    .createConsumer(queue);

            Message message = consumer.receive();
            if (message != null) {
                // Process the message
                System.out.println("Received message: " + message.toString());
            } else {
                System.out.println("No messages in the queue.");
            }

            consumer.close();
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
    }

