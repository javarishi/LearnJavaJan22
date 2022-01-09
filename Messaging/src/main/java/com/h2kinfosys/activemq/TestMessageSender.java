package com.h2kinfosys.activemq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;

public class TestMessageSender {

	public static void main(String[] args) {
		// ConnectionFactory
		try {
			ConnectionFactory cf = new ActiveMQConnectionFactory("tcp://localhost:61616");
			
			Connection conn = cf.createConnection();
			conn.start();
			
			Session session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
			
			Destination destination = session.createQueue("TEST.H2K.DEST");
			
			MessageProducer producer = session.createProducer(destination);
			
			Message message = session.createTextMessage("This is My First Message from Java");
			
			producer.send(message);
			
			System.out.println("Done!");
			
		}catch(JMSException jex) {
			jex.printStackTrace();
		}

	}

}
