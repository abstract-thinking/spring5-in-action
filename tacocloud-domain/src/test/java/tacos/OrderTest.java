package tacos;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.Arrays;

public class OrderTest {

    @Test
    public void writeJson() throws JsonProcessingException {

        User user = new User("max", "s3cr3t", "max", "here", "Ka", "BW", "76131", "");

        Ingredient lettuce = new Ingredient("LETC", "Lettuce", Ingredient.Type.VEGGIES);
        Ingredient cheddar = new Ingredient("CHED", "Cheddar", Ingredient.Type.CHEESE);

        Taco taco = new Taco();
        taco.setName("myTaco");
        taco.setIngredients(Arrays.asList(lettuce, cheddar));

        Order order = new Order();
        order.setDeliveryName("Ima Hungry");
        order.setDeliveryStreet("1234 Culinary Blvd.");
        order.setDeliveryCity("Foodsville");
        order.setDeliveryState("CO");
        order.setDeliveryState("81019");
        order.setCcNumber("4111111111111111");
        order.setCcExpiration("10/20");
        order.setCcCVV("123");

        order.setUser(user);
        order.setTacos(Arrays.asList(taco));

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(order);

        System.out.println(json);
    }
}
