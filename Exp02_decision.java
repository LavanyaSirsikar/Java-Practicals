public class Exp02_decision{
    public static void main(String []args){
        int a=10; int b=7; int c=6;
        if(a >=b && a>=c){
            System.out.println("Largest element is:a");
        }
        else if(b >=a && b>=c){
            System.out.println("Largest element is:b");
        }
        else{
            System.out.println("Largest element is:c");
        }

        int day=1;
        switch(day){
            case 1:System.out.println("monday");break;
            case 2:System.out.println("tuesday");break;
            case 3:System.out.println("wednesday");break;
        }
    }
}