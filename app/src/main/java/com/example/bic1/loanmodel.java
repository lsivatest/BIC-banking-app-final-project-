package com.example.bic1;
class loanmodel
{
    String name,loanrate,purl,mail,address,tp;
    loanmodel() {

    }

    public loanmodel(String name, String loanrate, String purl, String mail, String address, String tp) {
        this.name = name;
        this.loanrate = loanrate;
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

    public String getLoanrate() {
        return loanrate;
    }

    public void setLoanrate(String loanrate) {
        this.loanrate = loanrate;
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

