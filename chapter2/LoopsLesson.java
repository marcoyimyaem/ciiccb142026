package chapter2;

public class LoopsLesson {
    public static void main(String[] args) {
        byte a = 1;
        // String goto ="hello";
        while(a<=10)
            System.out.println("a = "+a++);
        do
            System.out.println("do while : a = "+a--);
        while (a<10);
    
        System.out.println("end of program");
        
    
    
    }
}