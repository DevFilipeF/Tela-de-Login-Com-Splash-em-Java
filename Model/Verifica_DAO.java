
package Model;

import View.Menu_GUI;
import javax.swing.JOptionPane;


public class Verifica_DAO {
    
    public static void login(){
        
        // Para Verificar o Login
        String log = View.Login_GUI.login_txt.getText();
        log = log.toLowerCase();
        
        // Para Verificar a Senha
        String sen = View.Login_GUI.senha_txt.getText();
        sen = sen.toLowerCase();
        
        if(log.equals("filipe") && sen.equals("123")){
            
        JOptionPane.showMessageDialog(null, "Seja Bem vindo(a) " + log + " !!");
        new Menu_GUI().setVisible(true);
    }else{
            JOptionPane.showMessageDialog(null, "Senha ou Login Invalidos  \n  Tente Novamente");
            
        }
    
    }
}
