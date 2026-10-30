package com.vitthal.profile;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

public class ProfileApp {
    static String mask(String value, int visible) {
        if (value.length() <= visible) {
            return value;
        }
        return "*".repeat(value.length() - visible) + value.substring(value.length() - visible);
    }

    static Map<String, Object> collect(Object obj) throws IllegalAccessException {
        Map<String, Object> data = new LinkedHashMap<>();

        for (Field field : obj.getClass().getDeclaredFields()) {
            Export export = field.getAnnotation(Export.class);
            if (export == null) {
                continue;
            }

            field.setAccessible(true);
            Object value = field.get(obj);

            Masked masked = field.getAnnotation(Masked.class);
            if (masked != null && value != null) {
                value = mask(value.toString(), masked.visible());
            }

            String key = export.name().isEmpty() ? field.getName() : export.name();
            data.put(key, value);
        }
        return data;
    }

    public static void main(String[] args) throws IllegalAccessException {
        Customer[] customers = {
            new Customer("Vitthal Goel", "Noida", "4111222233334444", "9876543210", "secret123"),
            new Customer("Ananya Rao", "Bengaluru", "5500111122223333", "9123456780", "pa55word")
        };

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        for (Customer c : customers) {
            System.out.println(gson.toJson(collect(c)));
            System.out.println("-------------------------");
        }

        System.out.println("@Export picks the fields and their JSON names, @Masked hides sensitive digits");
        System.out.println("password has no @Export so it never leaves the object");
        System.out.println("Gson was downloaded by Maven from the dependency in pom.xml");
    }
}
