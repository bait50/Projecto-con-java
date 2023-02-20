
package clases;

import Ventanas.FrameAgregar;
import Ventanas.FrameMain;
import java.util.ArrayList;

/**
 *
 * @author BIBPRESTAMOS# 21
 */
public class Main {
    Usuario persona = new Usuario();
    public static   FrameMain menu = new FrameMain();
//    public static FrameAgregar agregar = new FrameAgregar();
//    public static  FrameInventarioEquipo desktop = new FrameInventarioEquipo();
    //public static FrameRegistroUsuario adduser = new FrameRegistroUsuario();
    public static ArrayList<Equipo> equipos; 
    public static ArrayList<Usuario> usuarios;
    
    public static void main(String[] args) {
        equipos = new ArrayList<Equipo>();
        usuarios = new ArrayList<Usuario>();
        
                
        
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        
        /* int fila = jtabla.getSelectedRow();
        if(fila>=0){
            modelo.removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(null, "SELECIONE UNA FILA");
        }*/
        
    }
    
}
