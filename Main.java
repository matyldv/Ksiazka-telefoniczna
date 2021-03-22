package com.matylarekawek;

import com.matylarekawek.exceptions.*;
import org.omg.CORBA.DynAnyPackage.Invalid;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean program = true;

        KsiazkaAdresow ksiazkaAdresow = new KsiazkaAdresow();


        while (program)
        {
            String imie = new String();
            String nazwisko = new String();
            String telefon = new String();
            String ulica  = new String();
            String nr_domu = new String();
            String nr_mieszkania = new String();
            String kod_pocztowy = new String();
            String miasto = new String();
            String urzad_pocztowy = new String();

            System.out.println("Książka telefoniczna: \n1. Wyświetl książkę \n2. Wyszukaj po nazwisku");
            System.out.println("3. Dodaj kontakt \n4. Usuń kontakt \n5. Modyfikuj kontakt");
            System.out.println("6. Odczyt z pliku \n7. Zapis do pliku \n0. Koniec \n");

            System.out.print("Opcja : ");
            int wybor = new Scanner(System.in).nextInt();

            switch (wybor){
                case 0:
                    program = false;
                    break;
                case 1:
                    ksiazkaAdresow.wypisz();
                    break;
                case 2:
                    System.out.print("Podaj nazwisko: ");
                    nazwisko = new Scanner(System.in).nextLine();
                    System.out.println(nazwisko);
                    try {
                        ksiazkaAdresow.szukajKontakt(nazwisko);
                    }
                    catch (KontaktNotFoundException e) {
                        System.out.println("Nie odnaleziono kontaktu o takim nazwisku.");
                    }

                    break;
                case 3:
                    boolean error;
                    do {
                        error = false;
                        if (imie.isEmpty()) {
                            System.out.print("Podaj imię: ");
                            imie = new Scanner(System.in).nextLine();
                        }
                        if (nazwisko.isEmpty()) {
                            System.out.print("Podaj nazwisko: ");
                            nazwisko = new Scanner(System.in).nextLine();
                        }
                        if (telefon.isEmpty()) {
                            System.out.print("Podaj numer telefonu: ");
                            telefon = new Scanner(System.in).nextLine();
                        }
                        if (ulica.isEmpty()) {
                            System.out.print("Podaj ulicę: ");
                            ulica = new Scanner(System.in).nextLine();
                        }
                        if (nr_domu.isEmpty()) {
                            System.out.print("Podaj numer domu: ");
                            nr_domu = new Scanner(System.in).nextLine();
                        }
                        if (nr_mieszkania.isEmpty()) {
                            System.out.print("Podaj numer mieszkania: ");
                            nr_mieszkania = new Scanner(System.in).nextLine();
                        }
                        if (kod_pocztowy.isEmpty()) {
                            System.out.print("Podaj kod pocztowy: ");
                            kod_pocztowy = new Scanner(System.in).nextLine();
                        }
                        if (miasto.isEmpty()) {
                            System.out.print("Podaj miasto: ");
                            miasto = new Scanner(System.in).nextLine();
                        }
                        if (urzad_pocztowy.isEmpty()) {
                            System.out.print("Podaj urząd pocztowy: ");
                            urzad_pocztowy = new Scanner(System.in).nextLine();
                        }

                        try {
                            ksiazkaAdresow.dodajKontakt(imie, nazwisko, telefon, ulica, nr_domu, nr_mieszkania, kod_pocztowy, miasto, urzad_pocztowy);
                        }catch(InvalidImieException e){
                            System.out.println("Nie prawidłowy format imienia!");
                            imie = new String();
                            error = true;
                        }catch (InvalidNazwiskoException e){
                            System.out.println("Nie prawidłowy format nazwiska!");
                            nazwisko = new String();
                            error = true;
                        }catch (InvalidTelefonException e){
                            System.out.println("Nie prawidłowy format telfonu!");
                            telefon = new String();
                            error = true;
                        }catch (InvalidNrDomuException e){
                            System.out.println("Nie prawidłowy format numeru domu!");
                            nr_domu = new String();
                            error = true;
                        }catch (InvalidNrMieszkaniaException e){
                            System.out.println("Nie prawidłowy format numeru mieszkania!");
                            nr_mieszkania = new String();
                            error = true;
                        }catch (InvalidKodPocztowyException e){
                            System.out.println("Nie prawidłowy format kodu pocztowego!");
                            kod_pocztowy = new String();
                            error = true;
                        }catch (InvalidMiastoException e){
                            System.out.println("Nie prawidłowy format miasta!");
                            miasto = new String();
                            error = true;
                        }catch (InvalidUrzadPocztowyException e){
                            System.out.println("Nie prawidłowy format urzędu pocztowego!");
                            urzad_pocztowy = new String();
                            error = true;
                        }
                        } while (error);
                    break;
                case 4:
                    System.out.print("Podaj ID do usunięcia: ");
                    int id = new Scanner(System.in).nextInt();
                    try {
                        ksiazkaAdresow.usunKontakt(id);
                    }catch (InvalidIdException e){
                        System.out.println("Nie ma kontaktu o takim ID!");
                    }
                    break;
                case 5:
                    System.out.print("Podaj ID do zmodyfikowania: ");
                    id = new Scanner(System.in).nextInt();
                    System.out.print("Podaj pole do zmodyfikowania: ");
                    int mod = new Scanner(System.in).nextInt();
                    KontaktPoleEnum pole;
                    switch (mod){
                        case 1:
                            pole = KontaktPoleEnum.IMIE;
                            break;
                        case 2:
                            pole = KontaktPoleEnum.NAZWISKO;
                            break;
                        case 3:
                            pole = KontaktPoleEnum.TELEFON;
                            break;
                        case 4:
                            pole = KontaktPoleEnum.ULICA;
                            break;
                        case 5:
                            pole = KontaktPoleEnum.NR_DOMU;
                            break;
                        case 6:
                            pole = KontaktPoleEnum.NR_MIESZKANIA;
                            break;
                        case 7:
                            pole = KontaktPoleEnum.KOD_POCZTOWY;
                            break;
                        case 8:
                            pole = KontaktPoleEnum.MIASTO;
                            break;
                        case 9:
                            pole = KontaktPoleEnum.URZAD_POCZTOWY;
                            break;
                        default:
                            System.out.println("Błędne pole");
                            continue;
                    }
                    System.out.print("Podaj nową wartość: ");
                    String nowa = new Scanner(System.in).nextLine();
                    try {
                        ksiazkaAdresow.modyfikujKontakt(id, pole, nowa);
                    }catch (InvalidIdException e){
                        System.out.println("Nie ma kontaktu o takim ID!");
                    }catch(InvalidImieException e){
                        System.out.println("Nie prawidłowy format imienia!");
                    }catch (InvalidNazwiskoException e){
                        System.out.println("Nie prawidłowy format nazwiska!");
                    }catch (InvalidTelefonException e){
                        System.out.println("Nie prawidłowy format telfonu!");
                    }catch (InvalidNrDomuException e){
                        System.out.println("Nie prawidłowy format numeru domu!");
                    }catch (InvalidNrMieszkaniaException e){
                        System.out.println("Nie prawidłowy format numeru mieszkania!");
                    }catch (InvalidKodPocztowyException e){
                        System.out.println("Nie prawidłowy format kodu pocztowego!");
                    }catch (InvalidMiastoException e){
                        System.out.println("Nie prawidłowy format miasta!");
                    }catch (InvalidUrzadPocztowyException e){
                        System.out.println("Nie prawidłowy format urzędu pocztowego!");
                    }
                    break;
                case 6:
                    System.out.print("Podaj nazwę pliku: ");
                    String plik = new Scanner(System.in).nextLine();
                    ksiazkaAdresow.wczytajksiazke(plik);
                    break;
                case 7:
                    System.out.print("Podaj nazwę pliku: ");
                    plik = new Scanner(System.in).nextLine();
                    ksiazkaAdresow.zapiszKsiazke(plik);
                    break;

                default:
                    System.out.println("Błędna wartość");
            }
        }

    }
}
