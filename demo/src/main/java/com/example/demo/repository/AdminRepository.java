package com.example.demo.repository;

import com.example.demo.model.HelloEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<HelloEntity, Long> {
    HelloEntity findByLang(String lang);
}
