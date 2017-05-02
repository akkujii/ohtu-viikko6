/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author akkuJii
 */
public class Summa implements Komento {
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private Sovelluslogiikka sovellus;
    
    public Summa(Sovelluslogiikka sovellus, JTextField syotekentta, JTextField tuloskentta) {
        this.sovellus = sovellus;
        this.syotekentta = syotekentta;
        this.tuloskentta = tuloskentta;
    }
    
    @Override
    public void suorita() {
        int arvo = 0;
        try {
            arvo = Integer.parseInt(tuloskentta.getText());
        } catch (Exception e) {
        }
        sovellus.plus(arvo);
        
    }
}
