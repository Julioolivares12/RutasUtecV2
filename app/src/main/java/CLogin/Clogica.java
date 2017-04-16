package CLogin;

import java.util.ArrayList;

/**
 * Created by julio on 04-12-17.
 */

public class Clogica
{
    private ArrayList usuarios = new ArrayList();
    private ArrayList password = new ArrayList();
    private ArrayList tipo = new ArrayList();

    public Clogica(){
        usuarios.add("julio");
        password.add("123");
        tipo.add("A");

        usuarios.add("Roberto");
        password.add("1234");
        tipo.add("B");
    }

    public int Login(String usu,String pass){
        int encontrados = -1;
        if(usuarios.indexOf(usu)>=0 && password.indexOf(pass)>=0 && usuarios.indexOf(usu)==password.indexOf(pass)){
            encontrados= usuarios.indexOf(usu);
        }
        return encontrados;
    }
}
