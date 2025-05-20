/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

/**
 *
 * @author salin
 */
public class ValidarContra {
    // Método para validar la longitud de la contraseña (exactamente 8 caracteres)
    public boolean validarLongitud(String contrasena) {
        return contrasena.length() >= 8;
    }

    // Método para validar que la contraseña contenga al menos un carácter especial
    public boolean validarCaracterEspecial(String contrasena) {
        String regex = ".*[!@#$%^&*(),.?\":{}|<>].*";
        return contrasena.matches(regex);
    }

    // Método para validar que la contraseña contenga al menos un número
    public boolean validarNumero(String contrasena) {
        String regex = ".*\\d.*";
        return contrasena.matches(regex);
    }

    // Método para validar que la contraseña contenga al menos una letra mayúscula
    public boolean validarMayuscula(String contrasena) {
        String regex = ".*[A-Z].*";
        return contrasena.matches(regex);
    }

    // Método que combina todas las validaciones anteriores
    public boolean validarContrasena(String contrasena) {
        return validarLongitud(contrasena) && 
               validarCaracterEspecial(contrasena) && 
               validarNumero(contrasena) && 
               validarMayuscula(contrasena);
    }

   
}
