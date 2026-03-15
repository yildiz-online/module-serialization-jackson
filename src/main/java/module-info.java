import be.yildizgames.module.serialization.SerializerBuilder;
import be.yildizgames.module.serialization.jackson.JacksonSerializerBuilder;

module be.yildizgames.module.serialization.jackson {

    requires be.yildizgames.module.serialization;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.dataformat.yaml;

    exports be.yildizgames.module.serialization.jackson.json;
    provides SerializerBuilder with JacksonSerializerBuilder;
}