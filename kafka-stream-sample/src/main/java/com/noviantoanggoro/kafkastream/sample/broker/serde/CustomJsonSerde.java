package com.noviantoanggoro.kafkastream.sample.broker.serde;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

public class CustomJsonSerde<T> implements Serde<T> {

    private CustomJsonSerializer<T> serializer;
    private CustomJsonDeserialize<T> deserialize;

    public CustomJsonSerde(CustomJsonSerializer<T> serializer, CustomJsonDeserialize<T> deserialize) {
        this.serializer = serializer;
        this.deserialize = deserialize;
    }

    @Override
    public Serializer<T> serializer() {
        return serializer;
    }

    @Override
    public Deserializer<T> deserializer() {
        return deserialize;
    }
}
