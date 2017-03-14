package example;

import com.amazonaws.services.lambda.runtime.Context; 
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class Hello {
    public String myHandler(int myCount, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("received : " + myCount);
        
        //print on the console
        System.out.println("Hello. Welcome. Thanks for uploading..");
        
        
        return String.valueOf(myCount);
        //Added comments
    }
}