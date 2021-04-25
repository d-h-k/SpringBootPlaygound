package com.example.SpringBootPlaygound;

public class Github {
    private String nikname;
    private String photo;

    public Github(String nikname, String photo) {
        this.nikname = nikname;
        this.photo = photo;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNikname() {
        return nikname;
    }

    public void setNikname(String nikname) {
        this.nikname = nikname;
    }
}
