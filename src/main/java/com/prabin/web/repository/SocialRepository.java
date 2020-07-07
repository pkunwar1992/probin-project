/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prabin.web.repository;

import com.prabin.web.entity.Social;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Prasbin
 */
@Repository
public interface SocialRepository extends JpaRepository<Social, Integer> {
    
}
