package com.matylarekawek;

import com.matylarekawek.exceptions.*;

import java.io.Serializable;

public class Adres implements Serializable {
    private String ulica;
    private String nr_domu;
    private String nr_mieszkania;
    private String kod_pocztowy;
    private String miasto;
    private String urzad_pocztowy;

    public Adres() {
    }

    public Adres(String ulica, String nr_domu, String nr_mieszkania, String kod_pocztowy, String miasto, String urzad_pocztowy) throws InvalidNrDomuException, InvalidNrMieszkaniaException, InvalidKodPocztowyException, InvalidMiastoException, InvalidUrzadPocztowyException {
        this.setUlica(ulica);
        this.setNr_domu(nr_domu);
        this.setNr_mieszkania(nr_mieszkania);
        this.setKod_pocztowy(kod_pocztowy);
        this.setMiasto(miasto);
        this.setUrzad_pocztowy(urzad_pocztowy);
    }

    public void wypisz(){
        this.wypisz(0);
    }

    public void wypisz(int tab_num){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tab_num; i++){
            sb.append("\t");
        }
        String tabs = sb.toString();
        System.out.println(tabs + "Adres {");
        System.out.println(tabs + "\t" + "Ulica: " + this.getUlica());
        System.out.println(tabs + "\t" + "Nr domu: " + this.getNr_domu());
        System.out.println(tabs + "\t" + "Nr mieszkania: " + this.getNr_mieszkania());
        System.out.println(tabs + "\t" + "Kod pocztowy: " + this.getKod_pocztowy());
        System.out.println(tabs + "\t" + "Miasto: " + this.getMiasto());
        System.out.println(tabs + "\t" + "Urząd pocztowy: " + this.getUrzad_pocztowy());
        System.out.println(tabs + "}");
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNr_domu() {
        return nr_domu;
    }

    public void setNr_domu(String nr_domu) throws InvalidNrDomuException {
        if(!nr_domu.matches("[0-9]+.*")){
            throw new InvalidNrDomuException();
        }
        this.nr_domu = nr_domu;
    }

    public String getNr_mieszkania() {
        return nr_mieszkania;
    }

    public void setNr_mieszkania(String nr_mieszkania) throws InvalidNrMieszkaniaException {
        if(!nr_mieszkania.matches("[0-9]+.*")){
            throw new InvalidNrMieszkaniaException();
        }
        this.nr_mieszkania = nr_mieszkania;
    }

    public String getKod_pocztowy() {
        return kod_pocztowy;
    }

    public void setKod_pocztowy(String kod_pocztowy) throws InvalidKodPocztowyException {
        if(!kod_pocztowy.matches("[0-9]{2}-[0-9]{3}")){
            throw new InvalidKodPocztowyException();
        }
        this.kod_pocztowy = kod_pocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) throws InvalidMiastoException {
        if(miasto.matches(".*\\d.*")){
            throw new InvalidMiastoException();
        }
        this.miasto = miasto;
    }

    public String getUrzad_pocztowy() {
        return urzad_pocztowy;
    }

    public void setUrzad_pocztowy(String urzad_pocztowy) throws InvalidUrzadPocztowyException {
        if(urzad_pocztowy.matches(".*\\d.*")){
            throw new InvalidUrzadPocztowyException();
        }
        this.urzad_pocztowy = urzad_pocztowy;
    }
}
