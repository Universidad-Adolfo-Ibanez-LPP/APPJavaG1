package com.uai.app.ui;

import com.uai.app.dominio.Libro;
import com.uai.app.dominio.enums.Tittles;
import com.uai.app.logic.DataManager;
import com.uai.app.logic.SearchManager;
import com.uai.app.ui.utils.UAIJFrame;
import com.uai.app.ui.utils.UIBuilder;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
/*
Creacion de la clase Buscar Datos

Esta clase tiene como objetivo buscar uno o varios libros en el inventario
que se tiene.
*/
public class BuscarDatosUI extends UAIJFrame {
    /*
    Creacion de los distintos elementos que posee el JFrame
    de Buscar Datos.
    */
    private JPanel mainPanel;
    private JTextArea textArea1;
    private JLabel titulo;
    private JTextField lib;
    private JPanel mainTableConatiner;
    private JButton enviar;
    private JComboBox comboBox1;
    private JButton limpiar;

    //Constructor de la clase Buscar Datos.
    public BuscarDatosUI(String title) {
        super(title);
        this.setMainPanel(mainPanel);

        /*
        Creacion del listener a partir del JButton de nombre
        enviar, el cual tiene como objetivo una vez presionado
        mostrar el o los libros que cumplen con el criterio de
        busqueda ingresado por el usuario.
        */
        enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String libr = lib.getText();//Se obtiene el texto por teclado ingresado por el usuario y que servira para la busqueda.
                int option = comboBox1.getSelectedIndex();/*Se obtiene el campo que escogio el usuario
                y a partir del cual se realizara la busqueda del o los libros*/

                //obtengo los libros en una matriz
                HashSet<Libro> data = DataManager.getInstance().getData();/*Se crea e instancia el objeto data con
                la informacion que se tiene hasta ese momento de ejecucion de la app*/
                String[][] dataTabla = new String[data.size()][7];/*Se crea una matriz de String que almacenara los
                libros que resultaron de la busqueda*/


                /*Ahora se evalua que opcion marco el usuario en el comboBox, la cual va del 1 al 8,
                representando cada numero un campo especifico a partir del cual se realizara la busqueda, si marca la opcion 1 es el titulo,
                si es la opcion 2 el autor, 3 el año, 4 el numero de estante, 5 la seccion del libro, 6 el numero de piso,
                7 el nombre del edificio y 8 el nombre de la sede*/

                int cont = 0;//Contador que registra el numero de libros que se van agregando.

                /*Este if corresponde al de la opcion de busqueda a partir del titulo*/
                if(option==1){
                    /*Se crea e instancia el objeto de nombre milibro, que es un HashSet construido a partir del la clase Libro
                    , este objeto lo que hace es almacenar todos aquellos que resultan de la busqueda mediante el uso del
                    metodo findPersonByAttribute, el cual a su vez usa lo que se conoce como distancia de Levenshtein. Para
                     este caso la distancia de Levenshtein es usada para el titulo.*/
                    HashSet<Libro> milibro= SearchManager.getInstance().findPersonByAttribute(Tittles.TITULO,libr);
                    //Ciclo for para llenar la matriz de Strings dataTabla a partir de milibro.
                    for (Libro q: milibro){
                        dataTabla[cont] = q.getDataToCsv();
                        cont++;
                    }
                }

                /*Este if corresponde al de la opcion de busqueda a partir del autor*/
                if(option==2){
                    /*Se crea e instancia el objeto de nombre milibro, que es un HashSet construido a partir del la clase Libro
                    , este objeto lo que hace es almacenar todos aquellos que resultan de la busqueda mediante el uso del
                    metodo findPersonByAttribute, el cual a su vez usa lo que se conoce como distancia de Levenshtein. Para
                     este caso la distancia de Levenshtein es usada para el nombre del autor.*/
                    HashSet<Libro> milibro= SearchManager.getInstance().findPersonByAttribute(Tittles.AUTOR,libr);
                    //Ciclo for para llenar la matriz de Strings dataTabla a partir de milibro.
                    for (Libro q: milibro){
                        dataTabla[cont] = q.getDataToCsv();
                        cont++;
                    }
                }

                /*Este if corresponde al de la opcion de busqueda a partir del año*/
                if(option==3){
                    /*Se crea e instancia el objeto de nombre milibro, que es un HashSet construido a partir del la clase Libro
                    , este objeto lo que hace es almacenar todos aquellos que resultan de la busqueda mediante el uso del
                    metodo findPersonByAttribute, el cual a su vez usa lo que se conoce como distancia de Levenshtein. */
                    HashSet<Libro> milibro= SearchManager.getInstance().findPersonByAttribute(Tittles.ANIO,libr);
                    //Ciclo for para llenar la matriz de Strings dataTabla a partir de milibro.
                    for (Libro q: milibro){
                        dataTabla[cont] = q.getDataToCsv();
                        cont++;
                    }
                }

                /*Este if corresponde al de la opcion de busqueda a partir del numero de estante*/
                if(option==4){
                    /*Se crea e instancia el objeto de nombre milibro, que es un HashSet construido a partir del la clase Libro
                    , este objeto lo que hace es almacenar todos aquellos que resultan de la busqueda mediante el uso del
                    metodo findPersonByAttribute, el cual a su vez usa lo que se conoce como distancia de Levenshtein */
                    HashSet<Libro> milibro= SearchManager.getInstance().findPersonByAttribute(Tittles.ESTANTE_NUMERO,libr);
                    //Ciclo for para llenar la matriz de Strings dataTabla a partir de milibro.
                    for (Libro q: milibro){
                        dataTabla[cont] = q.getDataToCsv();
                        cont++;
                    }
                }

                /*Este if corresponde al de la opcion de busqueda a partir de la seccion del estante*/
                if(option==5){
                    /*Se crea e instancia el objeto de nombre milibro, que es un HashSet construido a partir del la clase Libro
                    , este objeto lo que hace es almacenar todos aquellos que resultan de la busqueda mediante el uso del
                    metodo findPersonByAttribute, el cual a su vez usa lo que se conoce como distancia de Levenshtein. Para
                     este caso la distancia de Levenshtein es usada para el nombre de la seccion. */
                    HashSet<Libro> milibro= SearchManager.getInstance().findPersonByAttribute(Tittles.ESTANTE_SECCION,libr);
                    //Ciclo for para llenar la matriz de Strings dataTabla a partir de milibro.
                    for (Libro q: milibro){
                        dataTabla[cont] = q.getDataToCsv();
                        cont++;
                    }
                }

                /*Este if corresponde al de la opcion de busqueda a partir del numero del piso*/
                if(option==6){
                   /*Se crea e instancia el objeto de nombre milibro, que es un HashSet construido a partir del la clase Libro
                    , este objeto lo que hace es almacenar todos aquellos que resultan de la busqueda mediante el uso del
                    metodo findPersonByAttribute, el cual a su vez usa lo que se conoce como distancia de Levenshtein */
                    HashSet<Libro> milibro= SearchManager.getInstance().findPersonByAttribute(Tittles.PISO,libr);
                    //Ciclo for para llenar la matriz de Strings dataTabla a partir de milibro.
                    for (Libro q: milibro){
                        dataTabla[cont] = q.getDataToCsv();
                        cont++;
                    }
                }

                /*Este if corresponde al de la opcion de busqueda a partir del nombre del edificio*/
                if(option==7){
                    /*Se crea e instancia el objeto de nombre milibro, que es un HashSet construido a partir del la clase Libro
                    , este objeto lo que hace es almacenar todos aquellos que resultan de la busqueda mediante el uso del
                    metodo findPersonByAttribute, el cual a su vez usa lo que se conoce como distancia de Levenshtein. Para
                     este caso la distancia de Levenshtein es usada para el noombre del edificio. */
                    HashSet<Libro> milibro= SearchManager.getInstance().findPersonByAttribute(Tittles.EDIFICIO,libr);
                    //Ciclo for para llenar la matriz de Strings dataTabla a partir de milibro.
                    for (Libro q: milibro){
                        dataTabla[cont] = q.getDataToCsv();
                        cont++;
                    }
                }

                /*Este if corresponde al de la opcion de busqueda a partir del nombre de la sede*/
                if(option==8){
                   /*Se crea e instancia el objeto de nombre milibro, que es un HashSet construido a partir del la clase Libro
                    , este objeto lo que hace es almacenar todos aquellos que resultan de la busqueda mediante el uso del
                    metodo findPersonByAttribute, el cual a su vez usa lo que se conoce como distancia de Levenshtein. Para
                     este caso la distancia de Levenshtein es usada para el nombre de la sede. */
                    HashSet<Libro> milibro= SearchManager.getInstance().findPersonByAttribute(Tittles.SEDE,libr);
                    //Ciclo for para llenar la matriz de Strings dataTabla a partir de milibro.
                    for (Libro q: milibro){
                        dataTabla[cont] = q.getDataToCsv();
                        cont++;
                    }
                }

                dispose();//Cierre de la ventana actual.
                JFrame frame =new MostrarResultados(dataTabla);/*Creaccion de una nueva ventana a partir de la clase
                MostrarResultados, pasando como parametros al constructor dataTabla, que es una matriz de Strings que
                contiene los libro que resultaron de la busqueda.*/
                frame.setLocationRelativeTo(null);//Se fija la ventana en el centro de la pantalla.
                frame.setVisible(true);//Comando para poder hacer visible la ventana.

            }

        });


}
}
