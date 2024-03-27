package com.driver;

import java.util.regex.Pattern;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        if(oldPassword.equals(password))
        {
            boolean validPass = validatePass(newPassword);

            if(validPass)
            {
                this.password = password;
            }
        }
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
    }
    public boolean validatePass(String newPassword)
    {
        int up = 0, lc = 0, di = 0, sp = 0;
//        if(newPassword.length()>=8)
//        {
            char[] nP = newPassword.toCharArray();
//            int up = 0, lc = 0, di = 0, sp = 0;
            for (char ch : nP)
            {
                if(ch >= 'A' && ch <= 'Z')
                {
                    up++;
                } else if (ch >= 'a' && ch <= 'z') 
                {
                    lc++;
                } else if (ch >= '0' && ch <= '9') 
                {
                    di++;    
                }
                else
                {
                    sp++;
                }
            }
//        }
        return up>0 && lc>0 && di>0 && sp>0 && newPassword.length()>=8;
    }
}
