package com.uai.app.ui;

import com.uai.app.dominio.Libro;
import com.uai.app.logic.DataManager;
import com.uai.app.ui.utils.UAIJFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.HashSet;

public class MostrarResultados extends JFrame {
    private JPanel mainPanel;
    private JLabel encabezado;
    private JPanel mainTableConatiner;

    public MostrarResultados(String[][] resultado) {

        this.mainPanel= mainPanel;
        this.setContentPane(mainPanel);

        String[] titles = {"titulo", "autor", "anio", "estante_numero", "estante_seccion", "piso", "edificio", "sede"};
        String[][] dataTabla = resultado;


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
