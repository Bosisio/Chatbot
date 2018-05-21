



public class Chat {

    public static void main(String[] args) {
        
        
        //This is the Bot
        Bot chatBot = new Bot();
        chatBot.mBotName = "Harry";
        
        //This is the User
        User user = new User();
        user.mUserName = "You";
        
       
        
        //the bot introduces him
        chatBot.vorstellen(user.mUserName);
        
        
        user.getInput();
        
        
        
        
        
        
        
        
        
        
    }
}
