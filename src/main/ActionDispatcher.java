package main;

import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ActionDispatcher {

    private String nomeUtente;
    private String password;

    public void showResults (String [] data) {

    }


    public void showForm (Object [] options) {
        System.out.println("-----LOGIN----");
        System.out.println("Nome utente:");
        nomeUtente = getInput();
        System.out.println("Password:");
        password = getInput();
    }

    public void submit() {

    }


    protected String getInput () {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }


}
