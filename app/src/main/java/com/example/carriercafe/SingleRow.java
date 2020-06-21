package com.example.carriercafe;

public class SingleRow {
    String company;
    String link;
    int image;

    public SingleRow(String company, String link, int image) {
        this.company = company;
        this.link = link;
        this.image = image;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
