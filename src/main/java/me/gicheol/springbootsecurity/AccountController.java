package me.gicheol.springbootsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/create")
    public Account create() {
        Account account = new Account();
        account.setEmail("leegicheolgc@gmail.com");
        account.setPassword("password");

        accountService.save(account);

        return account;
    }
}
