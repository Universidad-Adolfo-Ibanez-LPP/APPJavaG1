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

public class EliminarDatosUI extends UAIJFrame{
    private JLabel Borrar;
    private JPanel mainPanel;
    private JTextField book;
    private JComboBox comboBox1;
    private JButton borrar;

    public EliminarDatosUI(String title) {
        super(title);
        this.setMainPanel(mainPanel);
            borrar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String libr = book.getText();
                    int option = comboBox1.getSelectedIndex();


                    HashSet<Libro> data = DataManager.getInstance().getData();
                    int cont=0;
                    if (option==1){
                        for (Libro p: data){
                            if (p.getTitulo().equals(libr)){
                                cont++;
                            }
                        }
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

                        JFrame jFrame= new JFrame();
                        JOptionPane.showMessageDialog(jFrame,"¡Eliminado!");
                        dispose();
                    }

                    if (option==2){
                        for (Libro p: data){
                            if (p.getAutor().equals(libr)){
                                cont++;
                            }
                        }
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

                        JFrame jFrame= new JFrame();
                        JOptionPane.showMessageDialog(jFrame,"¡Eliminado!");
                        dispose();
                    }

                    if (option==3){
                        for (Libro p: data){
                            if (p.getAnio()==Integer.parseInt(libr)){
                                cont++;
                            }
                        }
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

                        JFrame jFrame= new JFrame();
                        JOptionPane.showMessageDialog(jFrame,"¡Eliminado!");
                        dispose();
                    }

                    if (option==4){
                        for (Libro p: data){
                            if (p.getEstante_numero()==Integer.parseInt(libr)){
                                cont++;
                            }
                        }
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

                        JFrame jFrame= new JFrame();
                        JOptionPane.showMessageDialog(jFrame,"¡Eliminado!");
                        dispose();
                    }

                    if (option==5){
                        for (Libro p: data){
                            if (p.getEstante_seccion().equals(libr)){
                                cont++;
                            }
                        }
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

                        JFrame jFrame= new JFrame();
                        JOptionPane.showMessageDialog(jFrame,"¡Eliminado!");
                        dispose();
                    }

                    if (option==6){
                        for (Libro p: data){
                            if (p.getPiso()==Integer.parseInt(libr)){
                                cont++;
                            }
                        }
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

                        JFrame jFrame= new JFrame();
                        JOptionPane.showMessageDialog(jFrame,"¡Eliminado!");
                        dispose();
                    }

                    if (option==7){
                        for (Libro p: data){
                            if (p.getEdificio().equals(libr)){
                                cont++;
                            }
                        }
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

                        JFrame jFrame= new JFrame();
                        JOptionPane.showMessageDialog(jFrame,"¡Eliminado!");
                        dispose();
                    }

                    if (option==8){
                        for (Libro p: data){
                            if (p.getSede().equals(libr)){
                                cont++;
                            }
                        }
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

                        JFrame jFrame= new JFrame();
                        JOptionPane.showMessageDialog(jFrame,"¡Eliminado!");
                        dispose();
                    }

                }

            });

        }
}
