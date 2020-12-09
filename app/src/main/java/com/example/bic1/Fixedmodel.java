package com.example.bic1;
class fixedmodel
{
    String name,fixedrate,purl,mail,address,tp;
    fixedmodel() {

    }

    public fixedmodel(String name, String fixedrate, String purl, String mail, String address, String tp) {
        this.name = name;
        this.fixedrate = fixedrate;
        this.purl = purl;
        this.mail = mail;
        this.address = address;
        this.tp = tp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFixedrate() {
        return fixedrate;
    }

    public void setFixedrate(String fixedrate) {
        this.fixedrate = fixedrate;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }
}

