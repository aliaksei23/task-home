package com.company;

import com.company.model.ConfirmPassword;
import com.company.model.Login;
import com.company.model.Password;
import com.company.util.CredentialUtil;

public class Main {

    public static void main(String[] args) {

        Login login = new Login("Privet");
        Password password = new Password("asdgsadg_45");
        ConfirmPassword confirmPassword = new ConfirmPassword("asdgsadg_45");

        System.out.println(CredentialUtil.checkCredential(login, password,confirmPassword));

        Login login1 = new Login("Privet");
        Password password1 = new Password("asdgsadg_45");
        ConfirmPassword confirmPassword1 = new ConfirmPassword("asdgsadg_45!");

        System.out.println(CredentialUtil.checkCredential(login1, password1,confirmPassword1));
    }
}
