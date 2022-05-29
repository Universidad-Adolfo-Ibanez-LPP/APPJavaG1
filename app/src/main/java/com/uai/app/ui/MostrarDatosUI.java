package com.uai.app.ui;

import com.uai.app.dominio.Libro;
import com.uai.app.logic.DataManager;
import com.uai.app.ui.utils.UAIJFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.HashSet;
/*
Creacion de la clase Mostrar datos
Esta clase tiene como objetivo mostrar los datos de la biblioteca.
*/
public class MostrarDatosUI extends UAIJFrame  {
    /*
    Creacion de los distintos elementos que posee el JFrame
    de Mostrar datos.
    */
    private JPanel mainPanel;
    private JPanel mainTableConatiner;
    private JTextArea textArea1;

    //Constructor de la clase Mostrar datos.
    public MostrarDatosUI(String title) {
        super(title);
        this.setMainPanel(mainPanel);

        //Se define el titles para las columnas que mostraran los datos
        String[] titles = {"titulo", "autor", "anio", "estante_numero", "estante_seccion", "piso", "edificio", "sede"};
        //obtengo los libros en una matriz
        HashSet<Libro> data = DataManager.getInstance().getData();
        //Se crea un array para ingresar los datos de la data.
        String[][] dataTabla = new String[data.size()][8];
        /*
        A continuacion procedemos a definir un contador para ir posicionando los datos
        obtenidos del csv en el array creada.
         */
        int cont = 0;
        for(Libro p : data) {
            dataTabla[cont] = p.getDataToCsv();
            cont++;
        }

        /*
        Aqui se toma el array con los datos y los titulos definidos
        y genero la tabla con esos valores
        */
        TableModel tableModel = new DefaultTableModel(dataTabla, titles);
        //se inserta en una tabla visual
        JTable table = new JTable(tableModel);
        //la agrego al contenedor de la tabla
        mainTableConatiner.setLayout(new BorderLayout());
        mainTableConatiner.add(new JScrollPane(table), BorderLayout.CENTER);

        mainTableConatiner.add(table.getTableHeader(), BorderLayout.NORTH);

        mainTableConatiner.setVisible(true);
        mainTableConatiner.setSize(400,400);
    }

}
