class Settings {
    private static Settings single = null;
    String theme;

    private Settings(){
        theme = "Light";
        System.out.println("Settings object created");
    }

    public static Settings getInstance(){
        if(single==null){
            single = new Settings();
        }
        return single;
    }

    public void show(){
        System.out.println("Current Theme:"+ theme);
    }
}

public class Q41 {
    public static void main(String args[]){
        Settings s1 = Settings.getInstance();
        s1.show();

        s1.theme = "Dark";

        Settings s2 = Settings.getInstance();
        s2.show();

        System.out.println("s1 == s2 :"+ (s1==s2));
    }
}
