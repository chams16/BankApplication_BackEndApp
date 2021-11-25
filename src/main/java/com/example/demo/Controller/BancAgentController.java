package com.example.demo.Controller;

import com.example.demo.Model.Bank_Agent;
import com.example.demo.Service.ServiceImpl.Bank_AgentImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/banque")
public class BancAgentController {

    @Autowired
    private Bank_AgentImpl bankAgent;

    @GetMapping("/all")
    public List<Bank_Agent> getAllBankAgent(){
        return bankAgent.GetAllAgent();
    }

    @PostMapping("signup")
    public Bank_Agent signUp(Bank_Agent agent){
        return bankAgent.SignUp(agent);
    }

    @PostMapping("login")
    public String Login(Bank_Agent agent){
        return bankAgent.Login(agent);
    }
}