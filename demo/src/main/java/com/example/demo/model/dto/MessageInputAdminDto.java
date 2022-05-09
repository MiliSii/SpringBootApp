package com.example.demo.model.dto;

public class MessageInputAdminDto {
    private String lang;
    private String helloDifLeng;

    public MessageInputAdminDto(String lang, String helloDifLeng) {
        super();
        this.lang = lang;
        this.helloDifLeng = helloDifLeng;
    }

    public MessageInputAdminDto() {
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getHelloDifLeng() {
        return helloDifLeng;
    }

    public void setHelloDifLeng(String helloDifLeng) {
        this.helloDifLeng = helloDifLeng;
    }

    @Override
    public String toString() {
        return "MessageInputAdminDto [helloDifLeng=" + helloDifLeng + ", lang=" + lang + "]";
    }

    
   

}
