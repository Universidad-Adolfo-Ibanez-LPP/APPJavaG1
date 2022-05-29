package com.uai.app.ui;
import com.uai.app.logic.*;

import com.uai.app.dominio.Libro;
import com.uai.app.logic.builders.LibroBuilder;
import com.uai.app.ui.utils.UAIJFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
/*
Creacion de la clase Agregar Datos

Esta clase tiene como objetivo agregar un nuevo libro al inventario
que se tiene.
*/
public class AgregarDatosUI extends UAIJFrame {
    /*
    Creacion de los distintos elementos que posee el JFrame
    de Agregar Datos.
    */
    private JLabel encabezado;
    private JTextField titulo;
    private JTextField autor;
    private JTextField estante_numero;
    private JTextField estante_seccion;
    private JTextField piso;
    private JTextField edificio;
    private JTextField sede;
    private JButton agregarButton;
    private JPanel mainPanel;
    private JTextField anio;
    private JLabel anioo;

    //Constructor de la clase Agregar Datos.
    public AgregarDatosUI(String title) {
        super(title);
        this.setMainPanel(mainPanel);

        /*
        Creacion del listener a partir del JButton de nombre
        agregarButton, el cual tiene como objetivo una vez presionado
        agregar el nuevo libro al invenario.
        */
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tit=titulo.getText(); //Se obtiene el nombre del Libro.
                String aut=autor.getText(); //Se obtiene el nombre del autor.
                String est=estante_seccion.getText(); //Se obtiene el nombre de la seccion.
                String edi=edificio.getText(); //Se obtiene el numero del edificio.
                String sed=sede.getText(); //Se obtiene el nombre de la sede.
                int enu=Integer.parseInt(estante_numero.getText()); //Se obtiene el numero del estante
                int an=Integer.parseInt(anio.getText()); //Se obtiene el año de publicacion.
                int pis=Integer.parseInt(piso.getText());//Se obtiene el numero del piso.
                HashSet<Libro> data = DataManager.getInstance().getData();//
                LibroBuilder bo = new LibroBuilder();/*Se crea el objeto bo el cual el cual esta basado en la clase LibroBuilder
                lo que permite que una vez instanciado el objeto se pueda posteriormente llamar al metodo build, que nos devuelve
                un objeto de tipo libro.*/

                //Creacion de un Jframe con el objetivo de mostrar una ventana emejergente que muestre que el libro fue agregado.
                JFrame jFrame= new JFrame();
                JOptionPane.showMessageDialog(jFrame,"¡Libro Agregado!");//Mensaje desplegado por la ventana emergente.
                data.add(bo.build(aut,enu,est,tit,pis,edi,sed,an));/* Creacion del libro mediante el metodo build, el cual recibe
                todos los datos introducidos por el usuario mediante el formulario que se creo.
                */
                dispose();//Cierre de la ventana.




            }
        });
    }
}
