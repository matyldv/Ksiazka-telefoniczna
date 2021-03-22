package com.matylarekawek;

import com.matylarekawek.exceptions.*;

import java.io.*;
import java.util.ArrayList;

public class KsiazkaAdresow {
    private ArrayList<Kontakt> ksiazka_adresow;

    public KsiazkaAdresow() {
        this.ksiazka_adresow = new ArrayList<>();
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
        System.out.println(tabs + "Książka Telefoniczna {");
        for (int i = 0; i < this.ksiazka_adresow.size(); i++){
            System.out.println(tabs + "\t" + "id: " + i);
            this.ksiazka_adresow.get(i).wypisz(tab_num + 2);
        }
        System.out.println(tabs + "}");
    }

    public void dodajKontakt(String imie, String nazwisko, String telefon, String ulica, String nr_domu, String nr_mieszkania, String kod_pocztowy, String miasto, String urzad_pocztowy) throws InvalidNrMieszkaniaException, InvalidImieException, InvalidKodPocztowyException, InvalidMiastoException, InvalidTelefonException, InvalidNazwiskoException, InvalidUrzadPocztowyException, InvalidNrDomuException {
        Kontakt kontakt = new Kontakt(imie, nazwisko, telefon, ulica, nr_domu, nr_mieszkania, kod_pocztowy, miasto, urzad_pocztowy);
        this.ksiazka_adresow.add(kontakt);
    }

    public void usunKontakt(int id) throws InvalidIdException {
        if (id >= this.ksiazka_adresow.size()){
            throw new InvalidIdException();
        }
        this.ksiazka_adresow.remove(id);
    }

    public void modyfikujKontakt(int id, KontaktPoleEnum typPola, String wartosc) throws InvalidImieException, InvalidMiastoException, InvalidNrDomuException, InvalidTelefonException, InvalidNazwiskoException, InvalidKodPocztowyException, InvalidNrMieszkaniaException, InvalidUrzadPocztowyException, InvalidIdException {
        if (id >= this.ksiazka_adresow.size()){
            throw new InvalidIdException();
        }
        Kontakt kontakt = this.ksiazka_adresow.get(id);
        switch (typPola){
            case IMIE:
                kontakt.setImie(wartosc);
                break;
            case ULICA:
                kontakt.setUlica(wartosc);
                break;
            case MIASTO:
                kontakt.setMiasto(wartosc);
                break;
            case NR_DOMU:
                kontakt.setNr_domu(wartosc);
                break;
            case TELEFON:
                kontakt.setTelefon(wartosc);
                break;
            case NAZWISKO:
                kontakt.setNazwisko(wartosc);
                break;
            case KOD_POCZTOWY:
                kontakt.setKod_pocztowy(wartosc);
                break;
            case NR_MIESZKANIA:
                kontakt.setNr_mieszkania(wartosc);
                break;
            case URZAD_POCZTOWY:
                kontakt.setUrzad_pocztowy(wartosc);
                break;
        }
    }

    public void  szukajKontakt(String fraza) throws KontaktNotFoundException {
        for (int i = 0; i < this.ksiazka_adresow.size(); i++){
            if (this.ksiazka_adresow.get(i).getNazwisko().equals(fraza)){
                this.ksiazka_adresow.get(i).wypisz();
            }
        }
        throw new KontaktNotFoundException();
    }

    public void zapiszKsiazke(String fileName){
        try {
            FileOutputStream f = new FileOutputStream(new File(fileName));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(this.ksiazka_adresow);
            o.close();
            f.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }

    public void wczytajksiazke(String fileName){
        try {
            FileInputStream f = new FileInputStream(new File(fileName));
            ObjectInputStream o = new ObjectInputStream(f);
            this.ksiazka_adresow = (ArrayList<Kontakt>) o.readObject();
            o.close();
            f.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
