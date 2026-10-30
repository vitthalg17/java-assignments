import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Command {
    String name();
    String help() default "";
}

class ChatBot {
    @Command(name = "hello", help = "greets the user")
    public void greet() {
        System.out.println("Bot : Hey there! How can I help?");
    }

    @Command(name = "time", help = "tells the current time")
    public void time() {
        System.out.println("Bot : It is " + java.time.LocalTime.now().withNano(0));
    }

    @Command(name = "joke", help = "tells a programming joke")
    public void joke() {
        System.out.println("Bot : Why do Java developers wear glasses? Because they don't C#.");
    }

    public void secret() {
        System.out.println("Bot : This should never run");
    }
}

public class Q28 {
    static void handle(Object bot, String input) throws Exception {
        System.out.println("You : " + input);

        for (Method m : bot.getClass().getDeclaredMethods()) {
            Command cmd = m.getAnnotation(Command.class);
            if (cmd != null && cmd.name().equals(input)) {
                m.invoke(bot);
                return;
            }
        }
        System.out.println("Bot : Sorry, I don't know \"" + input + "\"");
    }

    public static void main(String[] args) throws Exception {
        ChatBot bot = new ChatBot();

        System.out.println("Commands found using reflection");
        for (Method m : ChatBot.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Command.class)) {
                Command cmd = m.getAnnotation(Command.class);
                System.out.println("  " + cmd.name() + " -> " + cmd.help() + " (method " + m.getName() + ")");
            }
        }

        System.out.println("-------------------------");

        String[] inputs = {"hello", "joke", "time", "secret", "dance"};
        for (String in : inputs) {
            handle(bot, in);
        }
    }
}
