/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package super_puissance4;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author guilh
 */
public class CelluleGraphique extends JButton {

    CelluledeGrille celluleAssocier;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/Images/celluleVide.png"));
    ImageIcon img_desint = new javax.swing.ImageIcon(getClass().getResource("/Images/desintegrateur.png"));
    ImageIcon img_jetonJaune = new javax.swing.ImageIcon(getClass().getResource("/Images/jetonJaune.png"));
    ImageIcon img_jetonRouge = new javax.swing.ImageIcon(getClass().getResource("/Images/jetonRouge.png"));
    ImageIcon img_trouNoir = new javax.swing.ImageIcon(getClass().getResource("/Images/trouNoir.png"));

    public CelluleGraphique(CelluledeGrille uneCellule) {
        celluleAssocier = uneCellule;
    }

    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        if (celluleAssocier.presenceTrouNoir()==true) {
            setIcon(img_trouNoir);
        } else if (celluleAssocier.presenceDesintegrateur()==true) {
            setIcon(img_desint);
        } else {
            String couleur_jeton = celluleAssocier.lireCouleurDuJeton();
            switch (couleur_jeton) {
                case "vide":
                    setIcon(img_vide);
                    break;
                case "rouge":
                    setIcon(img_jetonRouge);
                    break;
                case "jaune":
                    setIcon(img_jetonJaune);
                    break;
            }
        }
    }
}
