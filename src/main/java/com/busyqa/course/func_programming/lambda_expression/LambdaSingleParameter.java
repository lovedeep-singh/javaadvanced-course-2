package com.busyqa.course.func_programming.lambda_expression;

interface Sayable2{  
    public String say(String name);  
}  
  
public class LambdaSingleParameter{  
    public static void main(String[] args) {  
      
        // Lambda expression with single parameter.  
        Sayable2 s1=(name)->{  return "Hello, " + name; };  
        System.out.println(s1.say("Sonoo"));  
          
        // You can omit function parentheses    
        Sayable2 s2= name ->{  
            return "Hello, "+name;  
        };  
        System.out.println(s2.say("Sonoo"));  
    }  
} 
