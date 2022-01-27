package com.company.util;

import com.company.exception.WrongLoginException;
import com.company.exception.WrongPasswordException;
import com.company.model.ConfirmPassword;
import com.company.model.Login;
import com.company.model.Password;

public class CredentialUtil {

    public static boolean checkCredential(Login login, Password password, ConfirmPassword confirmPassword) {
        try {
            checkLogin(login);
            checkPassword(password);
            checkConfirmPassword(password, confirmPassword);
            return true;
        } catch(WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static void checkLogin(Login login) throws WrongLoginException {
        if(login.getLogin().length() > 20) {
            throw new WrongLoginException("Login bigger than 20 symbols");
        }
    }

    private static void checkPassword(Password password) throws WrongPasswordException {
        boolean matches = password.getPassword().matches("^[a-zA-Z0-9_]+$");
        if(!matches) {
            throw new WrongPasswordException("Wrong password");
        }
        if(password.getPassword().length()>20){
            throw new WrongPasswordException("password bigger than 20 symbols");
        }
    }

    private static void checkConfirmPassword(Password password, ConfirmPassword confirmPassword)
            throws WrongPasswordException {
        if(!confirmPassword.getConfirmPassword().equals(password.getPassword())) {
            throw new WrongPasswordException("Confirmation password failed");
        }
    }
}
