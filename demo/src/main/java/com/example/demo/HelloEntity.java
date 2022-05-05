package com.example.demo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="HELLOWORLD")
public class HelloEntity {
    






    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
   @Column(name="helloDifLeng")
   private String helloDifLeng;

    
    @Column(name="lang")
    private String lang;
    
    public HelloEntity(){
		
	}
    public HelloEntity(Long id, String helloDifLeng, String lang) {
		super();
		this.id = id;
		this.helloDifLeng = helloDifLeng;
		this.lang = lang;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLang() {
		return lang;
	}
    public void setLang(String lang) {
		this.lang = lang;
	}
   
	public String gethelloDifLeng() {
		return helloDifLeng;
	}
    public void sethelloDifLeng(String helloDifLeng) {
		this.helloDifLeng = helloDifLeng;
	}

	@Override
	public String toString() {
		return "HelloEntity [helloDifLeng=" + helloDifLeng + ", id=" + id + ", lang=" + lang + "]";
	}
	

   
}
