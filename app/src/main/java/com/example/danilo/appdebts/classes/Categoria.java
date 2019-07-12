package com.example.danilo.appdebts.classes;

public class Categoria {

    private long mId;
    private String mType;
    private String cat;

    public Categoria() {
    }
    public Categoria(String cat) {
        this.cat = cat;
    }
    public String getTipo() {
        return mType;
    }

    public void setTipo(String tipo) {

        mType = tipo;
    }


    public long getId() {

        return mId;
    }

    public void setId(long id) {

        mId = id;
    }

}
