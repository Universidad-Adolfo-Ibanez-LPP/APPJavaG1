package com.uai.app.ui;

import javax.swing.*;

import com.uai.app.dominio.Libro;
import com.uai.app.logic.DataManager;
import com.uai.app.logic.builders.LibroBuilder;
import com.uai.app.ui.utils.UAIJFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
/*
Creacion de la clase Editar Datos

Esta clase tiene como objetivo editar un libro en el inventario
que se tiene.
*/
public class EditarDatosUI extends UAIJFrame{
    /*
    Creacion de los distintos elementos que posee el JFrame
    de Editar Datos.
    */
    private JLabel Encabezado;
    private JPanel panelito;
    private JComboBox comboBox1;
    private JTextField Cambio;
    private JButton Botoncito;
    private JTextField Titulo;
    private JLabel Enunciado;
    private JLabel Enunciado2;

    //Constructor de la clase Editar Datos.
    public EditarDatosUI(String title) {
        super(title);
        this.setMainPanel(panelito);

        /*
        Creacion del listener a partir del JButton de nombre
        Botoncito, el cual tiene como objetivo una vez presionado
        remplazar el viejo dato por el nuevo que ha introducido el usuario.
        */
        Botoncito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cambio = Cambio.getText();//Se obtiene el nuevo dato
                String libr = Titulo.getText();//Se obtiene el nombre del libro a editar
                int option = comboBox1.getSelectedIndex();/*Se obtiene el campo que escogio el usuario
                a modificar del libro*/

                HashSet<Libro> data = DataManager.getInstance().getData();/*Se crea e instancia el objeto data con
                la informacion que se tiene hasta ese momento de ejecucion de la app*/

                /*Creacion de un ciclo for con el objetivo de recorrer todos los elemtos dispuestos en data hasta dar con el
                libro indicado por el usuario*/
                for(Libro p : data) {
                    if (p.getTitulo().equals(libr)){

                        /* Una vez dentro del for y encontrado el libro a modificar, se evalua que opcion marco el usuario
                        en el comboBox, la cual va del 1 al 8, representando cada numero un campo especifico a editar,
                        si marca la opcion 1 es el titulo, si es la opcion 2 el autor, 3 el año, 4 el numero de estante,
                        5 la seccion del libro, 6 el numero de piso, 7 el nombre del edificio y 8 el nombre de la sede*/

                        if (option==1){
                            p.setTitulo(cambio);
                        }

                        if (option==2){
                            p.setAutor(cambio);
                        }

                        if (option==3){
                            p.setAnio(Integer.parseInt(cambio));
                        }

                        if (option==4){
                            p.setEstante_numero(Integer.parseInt(cambio));
                        }

                        if (option==5){
                            p.setEstante_seccion(cambio);
                        }

                        if (option==6){
                            p.setPiso(Integer.parseInt(cambio));
                        }

                        if (option==7){
                            p.setEdificio(cambio);
                        }

                        if (option==8){
                            p.setSede(cambio);
                        }
                    }
                }

                JFrame jFrame= new JFrame();
                //Creacion de un Jframe con el objetivo de mostrar una ventana emejergente que muestre que el libro fue editado.
                JOptionPane.showMessageDialog(jFrame,"¡Libro Editado!");//Mensaje desplegado por la ventana emergente.
                dispose();//Cierre de la ventana.
            }
        });
    }
}
