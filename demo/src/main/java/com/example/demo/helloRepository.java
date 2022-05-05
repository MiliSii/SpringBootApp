package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface helloRepository extends JpaRepository<HelloEntity, Integer>{
 
    HelloEntity findById(int id);
    public List<HelloEntity> findAll();
   // List<HelloEntity> findByEmployeename(String lang);
    
}
