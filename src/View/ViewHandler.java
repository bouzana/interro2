package View;

import Controller.Controller;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class ViewHandler extends Application {
    private Stage primaryStage;
    private ViewInscription mp;
    private ViewConnexion mo;
    private ViewAffichage va;

    private Menu model;
    private Controller controller;
    private Group root;


    /**
     * Permet le lancement de l'application : méthode obligatoire pour JavaFX
     *
     * @param primaryStage ()
     * @throws Exception ()
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;


        root = new Group();
        Scene scene = new Scene(root);

        model = new Menu();
        va = new ViewAffichage(model, root);
        mo = new ViewConnexion(model, root);
        mp = new ViewInscription(model, root);



        controller = new Controller(this, model);

        primaryStage.setTitle("FORMULAIRE");
        primaryStage.setFullScreenExitHint("");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setFullScreen(true);
        primaryStage.show();

    }

    public void setEventHandlerMenu(Controller cm) {
        mp.setEvents(cm);
        mo.setEvents(cm);
        va.setEvents(cm);
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public ViewInscription getMp() {
        return mp;
    }

    public ViewConnexion getMo(){
        return mo;
    }

    public ViewAffichage getVa(){
        return va;
    }

    public void setVueCompleteConnexion() {
        mo.setVueCompleteConnexion();
    }

    public void setVueCompleteInscription(){
        mp.setVueCompleteInscription();
    }
    public void setVueCompleteAffichage(){
        va.setVueCompleteAffichage();
    }




}