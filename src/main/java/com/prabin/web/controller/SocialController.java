/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prabin.web.controller;

import com.prabin.web.entity.Social;
import com.prabin.web.repository.SocialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Prasbin
 */
@Controller
@RequestMapping(value = "/socials")
public class SocialController {
    
    @Autowired
    private SocialRepository repository;
    
    @GetMapping
    @ResponseBody
    public String index(){
        repository.save(new Social(0, "Facebook", "FB", true));
        repository.save(new Social(0, "Twitter", "TW", true));
        repository.save(new Social(0, "LinnkedIn", "LN", true));
        repository.save(new Social(0, "Pinterest", "PN", true));
        repository.save(new Social(0, "WordPress", "WP", true));
        return "<h1>CREATED.....</h1>";
    }
    
    @GetMapping(value = "/json")
    public List<Social> json(){
        return repository.findAll();
    }
    
}
