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

public class BuscarDatosUI extends UAIJFrame {
    private JPanel mainPanel;
    private JTextArea textArea1;
    private JLabel titulo;
    private JTextField lib;
    private JPanel mainTableConatiner;
    private JButton enviar;
    private JComboBox comboBox1;
    private JButton limpiar;


    public BuscarDatosUI(String title) {
        super(title);
        this.setMainPanel(mainPanel);
        enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String libr = lib.getText();
                int option = comboBox1.getSelectedIndex();

                //obtengo los libros en una matriz

                HashSet<Libro> data = DataManager.getInstance().getData();
                String[][] dataTabla = new String[data.size()][7];

                int cont = 0;
                if(option==1){
                    HashSet<Libro> milibro= SearchManager.getInstance().findPersonByAttribute(Tittles.TITULO,libr);
                    for (Libro q: milibro){
                        dataTabla[cont] = q.getDataToCsv();
                        cont++;
                    }
                }

                if(option==2){
                    HashSet<Libro> milibro= SearchManager.getInstance().findPersonByAttribute(Tittles.AUTOR,libr);
                    for (Libro q: milibro){
                        dataTabla[cont] = q.getDataToCsv();
                        cont++;
                    }
                }

                if(option==3){
                    HashSet<Libro> milibro= SearchManager.getInstance().findPersonByAttribute(Tittles.ANIO,libr);
                    for (Libro q: milibro){
                        dataTabla[cont] = q.getDataToCsv();
                        cont++;
                    }
                }

                if(option==4){
                    HashSet<Libro> milibro= SearchManager.getInstance().findPersonByAttribute(Tittles.ESTANTE_NUMERO,libr);
                    for (Libro q: milibro){
                        dataTabla[cont] = q.getDataToCsv();
                        cont++;
                    }
                }

                if(option==5){
                    HashSet<Libro> milibro= SearchManager.getInstance().findPersonByAttribute(Tittles.ESTANTE_SECCION,libr);
                    for (Libro q: milibro){
                        dataTabla[cont] = q.getDataToCsv();
                        cont++;
                    }
                }

                if(option==6){
                    HashSet<Libro> milibro= SearchManager.getInstance().findPersonByAttribute(Tittles.PISO,libr);
                    for (Libro q: milibro){
                        dataTabla[cont] = q.getDataToCsv();
                        cont++;
                    }
                }

                if(option==7){
                    HashSet<Libro> milibro= SearchManager.getInstance().findPersonByAttribute(Tittles.EDIFICIO,libr);
                    for (Libro q: milibro){
                        dataTabla[cont] = q.getDataToCsv();
                        cont++;
                    }
                }

                if(option==8){
                    HashSet<Libro> milibro= SearchManager.getInstance().findPersonByAttribute(Tittles.SEDE,libr);
                    for (Libro q: milibro){
                        dataTabla[cont] = q.getDataToCsv();
                        cont++;
                    }
                }

                dispose();
                JFrame frame =new MostrarResultados(dataTabla);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            }

        });


}
}
