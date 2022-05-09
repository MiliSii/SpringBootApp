package com.example.demo.repository;

//import java.util.Collection;

import com.example.demo.model.HelloEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends JpaRepository<HelloEntity, Long> {

    HelloEntity findByLangIgnoreCase(String lang);

    HelloEntity findByLangStartsWith(String lang, Sort sort);

    HelloEntity findByLangEndsWith(String lang);

    //HelloEntity findByLangContaining(String word);

   // HelloEntity findByLangIn(Collection<HelloEntity> hellos);

}
