/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

/**
 *
 * @author salin
 */
public class ValidacionCorreo {
    
    public boolean validarCorreo(String c) {
        boolean es = false;
        String regular = "^[^@\\s]+@(?:gmail\\.com|hotmail\\.com|outlook\\.com|itoaxaca\\.edu\\.mx)$";

        if (c.matches(regular)) {
            es = true;
        }
        
        return es;
    }
    public boolean validarArroba(String c){
        return c.contains("@");
    }
    public boolean validarExtension(String c){
        boolean es = false;
       if(c.contains("gmail")&&c.contains(".com")){es = true;}
       else if(c.contains("itoaxaca")&&c.contains(".edu")&&c.contains(".mx")){es = true;}
       else if(c.contains("hotmail")&&c.contains(".com")){es = true;}
       else if(c.contains("outlook")&&c.contains(".com")){es = true;}
        return es;
    }

}
