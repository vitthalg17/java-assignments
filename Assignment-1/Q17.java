import java.util.Scanner;

public class Q17 {
    public boolean check(String name){
        if(name.length()==0){
            return false;
        }

        char first = name.charAt(0);
        if(Character.isLetter(first)==false && first!='_' && first!='$'){
            return false;
        }

        for(int i=1; i<name.length(); i++){
            char ch = name.charAt(i);
            if(Character.isLetterOrDigit(ch)==false && ch!='_' && ch!='$'){
                return false;
            }
        }

        if(name.equals("int") || name.equals("class") || name.equals("new") || name.equals("for")){
            return false;
        }

        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Q17 id = new Q17();

        String[] names = {"marks","_total","$price","2ndValue","my name","class","roll_no1"};

        for(int i=0; i<names.length; i++){
            if(id.check(names[i])){
                System.out.println(names[i]+ " is a Valid identifier");
            }
            else{
                System.out.println(names[i]+ " is an Invalid identifier");
            }
        }

        System.out.print("Enter your own identifier to check:");
        String own = sc.nextLine();

        if(id.check(own)){
            System.out.println(own+ " is a Valid identifier");
        }
        else{
            System.out.println(own+ " is an Invalid identifier");
        }

        sc.close();
    }
}
