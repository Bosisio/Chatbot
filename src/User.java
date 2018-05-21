import java.util.Scanner;

public class User {
    
    String mUserName;
    
    String setInput(){
        
        Scanner chatInput = new Scanner(System.in);
        
        String userInput = chatInput.nextLine();
        
        return userInput;
        
    }
    
    void getInput(){
        
        System.out.println(mUserName + ": " + setInput() + "\n");
        
    }
    
}
