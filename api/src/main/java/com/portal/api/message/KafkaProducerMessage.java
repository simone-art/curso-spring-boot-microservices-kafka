package com.portal.api.message;

import com.portal.api.dto.CarPostDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducerMessage {

    @Autowired
    // Kaftkatemplate faz o envio das mensagens pra dentro dos tópicos
    // É um método do Kafka
    private KafkaTemplate<String, CarPostDto> kafkaTemplate;

    private final String KAFKA_TOPIC = "car-post-topic";

    public void sendMessage(CarPostDto carPostDto){
        kafkaTemplate.send(KAFKA_TOPIC, carPostDto);

    }
}
