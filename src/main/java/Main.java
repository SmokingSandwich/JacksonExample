import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {
        Dog dog = new Dog("Scar", 5, "Warsaw", 111222333, 1499.99);
        Dog dog2 = new Dog("Scar", 5, 111222333, 1499.99);

        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//        mapper.configure(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES, true);
        System.out.println(mapper.canSerialize(Dog.class));

        mapper.writeValue(new File("result.json"), dog);

        String jsonString = mapper.writeValueAsString(dog);
        System.out.println(jsonString);

        byte[] jsonBytes = mapper.writeValueAsBytes(dog);
        System.out.println(jsonBytes);

        mapper.writeValue(new File("result2.json"), dog2);
        String jsonString2 = mapper.writeValueAsString(dog2);
        System.out.println(jsonString2);

        Dog readDog = mapper.readValue(jsonString, Dog.class);
        System.out.println(readDog.getAddress());

        Dog readDog2 = mapper.readValue(jsonString2, Dog.class);
        System.out.println(readDog2.name);
        System.out.println(readDog2.getAddress());

        System.out.println("////////////////////////////////////////////");

        Cat cat = new Cat(null,2, LocalDate.now());
        System.out.println(mapper.canSerialize(Cat.class));

        mapper.writeValue(new File("cat.json"), cat);

        String catString = mapper.writeValueAsString(cat);
        System.out.println(catString);

        Cat readCat = mapper.readValue(catString, Cat.class);
        System.out.println(readCat.getName());
        System.out.println(readCat.getAge());
        System.out.println(readCat.getDate());


    }
}
