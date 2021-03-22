package com.matylarekawek;

import com.matylarekawek.exceptions.*;

import java.io.Serializable;

public class Kontakt extends Adres implements Serializable {
    private String imie;
    private String nazwisko;
    private String telefon;

    public Kontakt() {
    }

    public Kontakt(String imie, String nazwisko, String telefon, String ulica, String nr_domu, String nr_mieszkania, String kod_pocztowy, String miasto, String urzad_pocztowy) throws InvalidUrzadPocztowyException, InvalidMiastoException, InvalidNrDomuException, InvalidNrMieszkaniaException, InvalidKodPocztowyException, InvalidImieException, InvalidNazwiskoException, InvalidTelefonException {
        super(ulica, nr_domu, nr_mieszkania, kod_pocztowy, miasto, urzad_pocztowy);
        this.setImie(imie);
        this.setNazwisko(nazwisko);
        this.setTelefon(telefon);
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
        System.out.println(tabs + "Kontakt {");
        System.out.println(tabs + "\t" + "Imie: " + this.getImie());
        System.out.println(tabs + "\t" + "Nazwisko: " + this.getNazwisko());
        System.out.println(tabs + "\t" + "Telefon: " + this.getTelefon());
        super.wypisz(tab_num + 1);
        System.out.println(tabs + "}");
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) throws InvalidImieException {
        if(imie.matches(".*\\d.*")){
            throw new InvalidImieException();
        }
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) throws InvalidNazwiskoException {
        if(nazwisko.matches(".*\\d.*")){
            throw new InvalidNazwiskoException();
        }
        this.nazwisko = nazwisko;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) throws InvalidTelefonException {
        if(telefon.matches(".*\\D.*")){
            throw new InvalidTelefonException();
        }
        this.telefon = telefon;
    }
}
