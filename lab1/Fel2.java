package lab1;

public class Fel2 {

    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Ures argumentum lista");
        }
                
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        
        for(String s:args){
            System.out.println(s);
        }

        
    }
}
