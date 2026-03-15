package be.yildizgames.module.serialization.jackson;

import be.yildizgames.module.serialization.SerializationType;
import be.yildizgames.module.serialization.Serializer;
import be.yildizgames.module.serialization.SerializerBuilder;
import be.yildizgames.module.serialization.jackson.json.JacksonJsonSerializer;
import be.yildizgames.module.serialization.jackson.yaml.JacksonYamlSerializer;

import java.util.List;

public class JacksonSerializerBuilder implements SerializerBuilder {


    @Override
    public Serializer<String> buildText(SerializationType type) {
        if(type.equals(SerializationType.JSON)) {
            return new JacksonJsonSerializer();
        } else if (type.equals(SerializationType.YAML)) {
            return new JacksonYamlSerializer();
        }
        throw new IllegalArgumentException("Unsupported type: " + type);
    }

    public Serializer<Object> buildBinary(SerializationType type) {
        throw new IllegalArgumentException("Unsupported type: " + type);
    }

    @Override
    public List<SerializationType> supportedTypes() {
        return List.of(SerializationType.JSON, SerializationType.YAML);
    }
}
