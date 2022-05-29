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
Creacion de la clase Mostrar Resultados, la cual es usada en
la clase Buscar Datos

Esta clase tiene como objetivo mostrar unica y exclusivamente los libros
que resultaron de la busqueda.
*/

public class MostrarResultados extends JFrame {
    /*
    Creacion de los distintos elementos que posee el JFrame
    de Mostrar Resultados.
    */
    private JPanel mainPanel;
    private JLabel encabezado;
    private JPanel mainTableConatiner;

    //Constructor de la clase Mostrar Resultados, y que recibe como parametro una matriz de Strings.
    public MostrarResultados(String[][] resultado) {

        this.mainPanel= mainPanel;
        this.setContentPane(mainPanel);


        String[] titles = {"titulo", "autor", "anio", "estante_numero", "estante_seccion", "piso", "edificio", "sede"};
        String[][] dataTabla = resultado;/*inicializacion de la variable dataTabla, a partir de resultado, la cual
        es una matriz de Strings que contiene los resultados de la busqueda que se obtuvieron en la clase BuscarDatosUI*/


        TableModel tableModel = new DefaultTableModel(dataTabla, titles);
        JTable table = new JTable(tableModel);

        mainTableConatiner.setLayout(new BorderLayout());
        mainTableConatiner.add(new JScrollPane(table), BorderLayout.CENTER);

        mainTableConatiner.add(table.getTableHeader(), BorderLayout.NORTH);
        mainTableConatiner.setSize(400,400);
        mainTableConatiner.setVisible(true);
        this.setSize(500,500);
    }

}
