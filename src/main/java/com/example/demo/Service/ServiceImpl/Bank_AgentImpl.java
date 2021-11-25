package com.example.demo.Service.ServiceImpl;

import com.example.demo.Model.Bank_Agent;
import com.example.demo.Repository.BankAgentRepository;
import com.example.demo.Service.Bank_AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Bank_AgentImpl implements Bank_AgentService {

    @Autowired
    private BankAgentRepository bankAgentRepository;


    @Override
    public Bank_Agent SignUp(Bank_Agent bankAgent) {
        return bankAgentRepository.save(bankAgent);
    }

    @Override
    public Bank_Agent Login(Bank_Agent bankAgent) {

        return null;
    }

    @Override
    public List<Bank_Agent> GetAllAgent() {
        return bankAgentRepository.findAll();
    }
}