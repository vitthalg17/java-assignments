import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String value() default "";
}

class Movie {
    @JsonField("title")
    private String movieTitle;

    @JsonField("release_year")
    private int yearOfRelease;

    @JsonField
    private double rating;

    private String internalCode;

    Movie(String movieTitle, int yearOfRelease, double rating, String internalCode) {
        this.movieTitle = movieTitle;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.internalCode = internalCode;
    }
}

class JsonWriter {
    public static String toJson(Object obj) throws IllegalAccessException {
        StringBuilder json = new StringBuilder("{");
        boolean first = true;

        for (Field field : obj.getClass().getDeclaredFields()) {
            if (!field.isAnnotationPresent(JsonField.class)) {
                continue;
            }

            field.setAccessible(true);
            String name = field.getAnnotation(JsonField.class).value();
            if (name.isEmpty()) {
                name = field.getName();
            }

            Object value = field.get(obj);

            if (!first) {
                json.append(", ");
            }
            json.append("\"").append(name).append("\": ");

            if (value instanceof String) {
                json.append("\"").append(value).append("\"");
            }
            else {
                json.append(value);
            }
            first = false;
        }

        json.append("}");
        return json.toString();
    }
}

public class Q26 {
    public static void main(String[] args) throws IllegalAccessException {
        Movie m1 = new Movie("Interstellar", 2014, 8.7, "INT-2014-X");
        Movie m2 = new Movie("Lagaan", 2001, 8.1, "LGN-2001-Y");

        System.out.println(JsonWriter.toJson(m1));
        System.out.println(JsonWriter.toJson(m2));

        System.out.println("-------------------------");
        System.out.println("movieTitle became \"title\", yearOfRelease became \"release_year\"");
        System.out.println("rating kept its own name and internalCode was skipped since it has no @JsonField");
    }
}
