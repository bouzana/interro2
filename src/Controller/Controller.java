package Controller;

import View.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.input.MouseEvent;

public class Controller implements EventHandler<MouseEvent> {

    /**
     * Attributs du controleur du menu
     */
    private ViewHandler launcher;
    private Menu model;


    /**
     * Constructeur du controleur relatif au menu principal
     *
     * @param launcher (Gestionnaire de vue)
     * @param model    (Modèle correcpondant au menu principal)
     */
    public Controller(ViewHandler launcher, Menu model) {
        this.model = model;
        this.launcher = launcher;
        this.launcher.setEventHandlerMenu(this);
    }


    @Override
    public void handle(MouseEvent mouseEvent) {
        if (mouseEvent.getSource().equals(launcher.getVa().getOptions())) {
            launcher.setVueCompleteInscription();
        }
        if (mouseEvent.getSource().equals(launcher.getMo().getConnexion())) {
            launcher.setVueCompleteAffichage();

        }if (mouseEvent.getSource().equals(launcher.getMp().getQuitter())) {
            launcher.getPrimaryStage().close();

     }
     if (mouseEvent.getSource().equals(launcher.getMp().getBtnJouer())) {
          launcher.setVueCompleteConnexion();

     }
     if (mouseEvent.getSource().equals(launcher.getMp().getMDPTex())) {
            launcher.setVueCompleteConnexion();
     }
        if (mouseEvent.getSource().equals(launcher.getMp().getloginTex())) {
            launcher.setVueCompleteConnexion();
        }

       }
    }


