package com.uai.app.ui;

import com.uai.app.dominio.Libro;
import com.uai.app.logic.DataManager;
import com.uai.app.ui.utils.UAIJFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
/*
Creacion de la clase Eliminar Datos.

Esta clase tiene como objetivo eliminar un libro por alguna de sus diferentes categorias en el inventario
que se tiene.
*/
public class EliminarDatosUI extends UAIJFrame{
    private JLabel Borrar;
    private JPanel mainPanel;
    private JTextField book;
    private JComboBox comboBox1;
    private JButton borrar;
//Generamos el contructor de la clase Eliminar Datos.
    public EliminarDatosUI(String title) {
        super(title);
        this.setMainPanel(mainPanel);
            /*
            Creacion del listener a partir del JButton de nombre
            borrar, el cual tiene como objetivo borrar lo que el
            usuario ha seleccionado.
            */
            borrar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String libr = book.getText(); //Se obtiene el nombre del libro a borrar.
                    int option = comboBox1.getSelectedIndex(); //Se obtiene el campo que escogio el usuario a borrar.


                    HashSet<Libro> data = DataManager.getInstance().getData();/*Se crea e instancia el objeto data con
                    la informacion que se tiene hasta ese momento de ejecucion de la app.*/
                    
                     /* Una encontrado el libro a modificar, se evalua que la opcion que marco el usuario
                        en el comboBox, la cual va del 1 al 8, representando cada numero un campo especifico a eliminar,
                        si marca la opcion 1 es el titulo, si es la opcion 2 el autor, 3 el año, 4 el numero de estante,
                        5 la seccion del libro, 6 el numero de piso, 7 el nombre del edificio y 8 el nombre de la sede.*/

                    int cont=0; // El contador es para ver cuantos libros coinciden lo que ingreso el usuario.
                    //Se verifica si lo que ingreso el usuario es igual a esta opcion.
                    if (option==1){
                        for (Libro p: data){
                            if (p.getTitulo().equals(libr)){
                                cont++;
                            }
                        }
                        /*Mientras la cantidad de libros eliminados sea menor a la cantidad de libros que se debe eliminar
                         se repetira el ciclo while, cada vez que se encuentre el libro que coincide con lo que el usuario
                         ingreso este sera eliminado y luego se hace un brake dado que al eliminar un libro el rango del
                         while cambia y asi evitamos que se genere un error.*/
                        int iteracion=0;
                        while (iteracion!=cont){
                            for (Libro p:data){
                                if (p.getTitulo().equals(libr)){
                                    data.remove(p);
                                    break;
                                }
                            }
                            iteracion++;
                        }
                         /*Creamos una ventana nueva que le avise al usuario que se ha
                         eliminado lo que el usuario quizo eliminar. */
                        JFrame jFrame= new JFrame();
                        JOptionPane.showMessageDialog(jFrame,"¡Eliminado!");
                        dispose();
                    }
                    //Se verifica si lo que ingreso el usuario es igual a esta opcion.
                    if (option==2){
                        for (Libro p: data){
                            if (p.getAutor().equals(libr)){
                                cont++;
                            }
                        }
                        /*Mientras la cantidad de libros eliminados sea menor a la cantidad de libros que se debe eliminar
                         se repetira el ciclo while, cada vez que se encuentre el libro que coincide con lo que el usuario
                         ingreso este sera eliminado y luego se hace un brake dado que al eliminar un libro el rango del
                         while cambia y asi evitamos que se genere un error.*/
                        int iteracion=0;
                        while (iteracion!=cont){
                            for (Libro p:data){
                                if (p.getAutor().equals(libr)){
                                    data.remove(p);
                                    break;
                                }
                            }
                            iteracion++;
                        }
                         /*Creamos una ventana nueva que le avise al usuario que se ha
                         eliminado lo que el usuario quizo eliminar. */
                        JFrame jFrame= new JFrame();
                        JOptionPane.showMessageDialog(jFrame,"¡Eliminado!");
                        dispose();
                    }
                    //Se verifica si lo que ingreso el usuario es igual a esta opcion.
                    if (option==3){
                        for (Libro p: data){
                            if (p.getAnio()==Integer.parseInt(libr)){
                                cont++;
                            }
                        }
                        /*Mientras la cantidad de libros eliminados sea menor a la cantidad de libros que se debe eliminar
                         se repetira el ciclo while, cada vez que se encuentre el libro que coincide con lo que el usuario
                         ingreso este sera eliminado y luego se hace un brake dado que al eliminar un libro el rango del
                         while cambia y asi evitamos que se genere un error.*/
                        int iteracion=0;
                        while (iteracion!=cont){
                            for (Libro p:data){
                                if (p.getAnio()==Integer.parseInt(libr)){
                                    data.remove(p);
                                    break;
                                }
                            }
                            iteracion++;
                        }
                         /*Creamos una ventana nueva que le avise al usuario que se ha
                         eliminado lo que el usuario quizo eliminar. */
                        JFrame jFrame= new JFrame();
                        JOptionPane.showMessageDialog(jFrame,"¡Eliminado!");
                        dispose();
                    }
                    //Se verifica si lo que ingreso el usuario es igual a esta opcion.
                    if (option==4){
                        for (Libro p: data){
                            if (p.getEstante_numero()==Integer.parseInt(libr)){
                                cont++;
                            }
                        }
                        /*Mientras la cantidad de libros eliminados sea menor a la cantidad de libros que se debe eliminar
                         se repetira el ciclo while, cada vez que se encuentre el libro que coincide con lo que el usuario
                         ingreso este sera eliminado y luego se hace un brake dado que al eliminar un libro el rango del
                         while cambia y asi evitamos que se genere un error.*/
                        int iteracion=0;
                        while (iteracion!=cont){
                            for (Libro p:data){
                                if (p.getEstante_numero()==Integer.parseInt(libr)){
                                    data.remove(p);
                                    break;
                                }
                            }
                            iteracion++;
                        }
                         /*Creamos una ventana nueva que le avise al usuario que se ha
                         eliminado lo que el usuario quizo eliminar. */
                        JFrame jFrame= new JFrame();
                        JOptionPane.showMessageDialog(jFrame,"¡Eliminado!");
                        dispose();
                    }
                    //Se verifica si lo que ingreso el usuario es igual a esta opcion.
                    if (option==5){
                        for (Libro p: data){
                            if (p.getEstante_seccion().equals(libr)){
                                cont++;
                            }
                        }
                        /*Mientras la cantidad de libros eliminados sea menor a la cantidad de libros que se debe eliminar
                         se repetira el ciclo while, cada vez que se encuentre el libro que coincide con lo que el usuario
                         ingreso este sera eliminado y luego se hace un brake dado que al eliminar un libro el rango del
                         while cambia y asi evitamos que se genere un error.*/
                        int iteracion=0;
                        while (iteracion!=cont){
                            for (Libro p:data){
                                if (p.getEstante_seccion().equals(libr)){
                                    data.remove(p);
                                    break;
                                }
                            }
                            iteracion++;
                        }
                         /*Creamos una ventana nueva que le avise al usuario que se ha
                         eliminado lo que el usuario quizo eliminar. */
                        JFrame jFrame= new JFrame();
                        JOptionPane.showMessageDialog(jFrame,"¡Eliminado!");
                        dispose();
                    }
                    //Se verifica si lo que ingreso el usuario es igual a esta opcion.
                    if (option==6){
                        for (Libro p: data){
                            if (p.getPiso()==Integer.parseInt(libr)){
                                cont++;
                            }
                        }
                        /*Mientras la cantidad de libros eliminados sea menor a la cantidad de libros que se debe eliminar
                         se repetira el ciclo while, cada vez que se encuentre el libro que coincide con lo que el usuario
                         ingreso este sera eliminado y luego se hace un brake dado que al eliminar un libro el rango del
                         while cambia y asi evitamos que se genere un error.*/
                        int iteracion=0;
                        while (iteracion!=cont){
                            for (Libro p:data){
                                if (p.getPiso()==Integer.parseInt(libr)){
                                    data.remove(p);
                                    break;
                                }
                            }
                            iteracion++;
                        }
                         /*Creamos una ventana nueva que le avise al usuario que se ha
                         eliminado lo que el usuario quizo eliminar. */
                        JFrame jFrame= new JFrame();
                        JOptionPane.showMessageDialog(jFrame,"¡Eliminado!");
                        dispose();
                    }
                    //Se verifica si lo que ingreso el usuario es igual a esta opcion.
                    if (option==7){
                        for (Libro p: data){
                            if (p.getEdificio().equals(libr)){
                                cont++;
                            }
                        }
                        /*Mientras la cantidad de libros eliminados sea menor a la cantidad de libros que se debe eliminar
                         se repetira el ciclo while, cada vez que se encuentre el libro que coincide con lo que el usuario
                         ingreso este sera eliminado y luego se hace un brake dado que al eliminar un libro el rango del
                         while cambia y asi evitamos que se genere un error.*/
                        int iteracion=0;
                        while (iteracion!=cont){
                            for (Libro p:data){
                                if (p.getEdificio().equals(libr)){
                                    data.remove(p);
                                    break;
                                }
                            }
                            iteracion++;
                        }
                         /*Creamos una ventana nueva que le avise al usuario que se ha
                         eliminado lo que el usuario quizo eliminar. */
                        JFrame jFrame= new JFrame();
                        JOptionPane.showMessageDialog(jFrame,"¡Eliminado!");
                        dispose();
                    }
                    //Se verifica si lo que ingreso el usuario es igual a esta opcion.
                    if (option==8){
                        for (Libro p: data){
                            if (p.getSede().equals(libr)){
                                cont++;
                            }
                        }
                        /*Mientras la cantidad de libros eliminados sea menor a la cantidad de libros que se debe eliminar
                         se repetira el ciclo while, cada vez que se encuentre el libro que coincide con lo que el usuario
                         ingreso este sera eliminado y luego se hace un brake dado que al eliminar un libro el rango del
                         while cambia y asi evitamos que se genere un error.*/
                        int iteracion=0;
                        while (iteracion!=cont){
                            for (Libro p:data){
                                if (p.getSede().equals(libr)){
                                    data.remove(p);
                                    break;
                                }
                            }
                            iteracion++;
                        }
                         /*Creamos una ventana nueva que le avise al usuario que se ha
                         eliminado lo que el usuario quizo eliminar. */
                        JFrame jFrame= new JFrame();
                        JOptionPane.showMessageDialog(jFrame,"¡Eliminado!");
                        dispose();
                    }

                }

            });

        }
}
