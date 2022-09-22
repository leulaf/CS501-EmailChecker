package com.example.email;

public class CheckEmail {
    public static Boolean checkEmail(String email){
        Boolean valid = false;
        for(int i = 0; i < email.length(); i++){
            if(email.charAt(i) == '@'){
                valid = true;
                break;
            }
        }

        return valid;
    }
}
