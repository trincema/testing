package kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class SimpleKafkaProducer {
    public static void main(String[] args) {
        String bootstrapServers = "localhost:9092";
        String topic = "my_topic";

        // Kafka producer configuration
        Properties properties = new Properties();
        properties.put("bootstrap.servers", bootstrapServers);
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        // Create Kafka producer
        try (Producer<String, String> producer = new KafkaProducer<>(properties)) {
            // Send a simple message to the topic
            String message = "Hello, Kafka!";
            ProducerRecord<String, String> record = new ProducerRecord<>(topic, message);
            producer.send(record);

            System.out.println("Message sent to Kafka topic: " + message);
        }
    }
}
