package com.uai.app.ui;

import com.opencsv.CSVWriter;
import com.uai.app.App;
import com.uai.app.dominio.Libro;
import com.uai.app.dominio.enums.Tittles;
import com.uai.app.exceptions.CSVNotFoundException;
import com.uai.app.files.FileManager;
import com.uai.app.logic.DataManager;
import com.uai.app.ui.utils.UAIJFrame;
import com.uai.app.ui.utils.UIBuilder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;

public class MainMenuUI extends UAIJFrame {

    private JPanel mainPanel;
    private JButton mostrarDatosButton;
    private JButton buscarButton;
    private JButton eliminarButton;
    private JButton agregarButton;
    private JButton editarButton;


    public MainMenuUI(String title) {
        super(title);

        this.setMainPanel(mainPanel);

        mostrarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UIBuilder.buildUI(MostrarDatosUI.class);
            }
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {UIBuilder.buildUI(BuscarDatosUI.class);
            }
        });
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {UIBuilder.buildUI(EliminarDatosUI.class);
            }
        });
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {UIBuilder.buildUI(AgregarDatosUI.class);

            }
        });

        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {UIBuilder.buildUI(EditarDatosUI.class);

            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                App.saveData();
            }
        });

    }
}
