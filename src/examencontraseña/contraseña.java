package examencontraseña;

/* @author LMC */

import java.util.*;

public class contraseña {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca una contraseña: ");
        String contraseña = scanner.nextLine();
        
        while (!isValid(contraseña)) {
            System.out.println("Contraseña incorrecta.");
            System.out.print("Introduzca una contraseña: ");
            contraseña = scanner.nextLine();
        }
        System.out.println("Contraseña correcta");
    }

    public static boolean isValid(String contraseña) {
        String letras = "abcdefghijklmnopqrstuvwxyz";
        String cespecial = "#%+-*_\\$";
        int cunico = 0;
        int minusculas = 0;
        boolean mayusculas = false;
        boolean especial = false;
        
        List<String> errores = new ArrayList<>();

        // Check if password starts with a letter
        if (!Character.isLetter(contraseña.charAt(0))) {
            errores.add("La contraseña debe empezar por letra.");
        }

        // Check if password is at least 8 characters long
        if (contraseña.length() < 8) {
            errores.add("La contraseña debe tener al menos 8 caracteres");
        }

        // Check if password has at least 1 capital letter
        for (int i = 0; i < contraseña.length(); i++) {
            if (Character.isUpperCase(contraseña.charAt(i))) {
                mayusculas = true;
                break;
            }
        }
        if (!mayusculas) {
            errores.add("La contraseña debe contener al menos 1 mayúscula.");
        }

        // Check if password has at least 3 tiny letters
        for (int i = 0; i < contraseña.length(); i++) {
            if (Character.isLowerCase(contraseña.charAt(i))) {
                minusculas++;
            }
        }
        if (minusculas < 3) {
            errores.add("La contraseña debe contener al menos 3 minúsculas.");
        }

        // Check if password has at least 1 special character
        for (int i = 0; i < contraseña.length(); i++) {
            if (cespecial.indexOf(contraseña.charAt(i)) != -1) {
                especial = true;
                break;
            }
        }
        if (!especial) {
            errores.add("La contraseña debe contener al menos 1 de los caracteres permitidos.");
        }

        // Check if password has at least 2 unique characters
        Set<Character> caracterUnico = new HashSet<>();
        for (int i = 0; i < contraseña.length(); i++) {
            caracterUnico.add(contraseña.charAt(i));
        }
        if (caracterUnico.size() < 2) {
            errores.add("La contraseña debe conteneer al menos 2 caracteres únicos.");
        }

        if (errores.size() > 0) {
            System.out.println("Errores:");
            for (String error : errores) {
                System.out.println("- " + errores);
            }
            return false;
        }

        return true;
    }
}
