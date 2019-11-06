package View;
import Controller.Controller;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


public class ViewConnexion {

    private Text titre;
    private Menu model;
    private Group root;
    private Button btnConnexion;
    private Text Login;
    private Text MDP;
    private TextField loginTex;
    private PasswordField MDPTex;
    /**
     * Constructeur du menu principal
     *
     * @param model (Modèle correspondant au menu)
     * @param root  (Groupe principal de la vue)
     */
    ViewConnexion(Menu model, Group root) {
        this.root = root;
        this.model = model;
        initTitre();
        Login = initText(120, 200, "Login");
        loginTex = initChamp(210, 185);
        MDP = initText(120, 250, "Mot De Passe");
        MDPTex = initChampMdp(210, 235);
        btnConnexion = initButton(110, 400, "CONNEXION");
        setVueCompleteConnexion();
    }

    private void initTitre() {
        titre = new Text(150, 180, "CONNEXION");
        titre.setLayoutX(60);
        titre.setLayoutY(-20);
        titre.setFill(Color.BLACK);
    }



    public Button initButton(int longeur, int largeur, String texteB) {

        // Création d'un bouton
        Button b = new Button();
        b.setLayoutX(longeur);
        b.setLayoutY(largeur);
        b.setText(texteB);

        return b;
    }
    public Text initText(int longeur, int largeur, String tex){
        Text text1 = new Text();
        text1.setLayoutX(longeur);
        text1.setLayoutY(largeur);
        text1.setText(tex);
        return text1;
    }

    public TextField initChamp(int longeur, int largeur){


        TextField textField1 = new TextField();
        textField1.setLayoutX(longeur);
        textField1.setLayoutY(largeur);

        return textField1;
    }

    public PasswordField initChampMdp(int longeur, int largeur){


        PasswordField textField2 = new PasswordField();
        textField2.setLayoutX(longeur);
        textField2.setLayoutY(largeur);

        return textField2;
    }


    void setVueCompleteConnexion() {
        root.getChildren().clear();
        root.getChildren().add(titre);
        root.getChildren().add(btnConnexion);
        root.getChildren().add(Login);
        root.getChildren().add(MDP);
        root.getChildren().add(loginTex);
        root.getChildren().add(MDPTex);

    }

    void setEvents(Controller mc) {
        btnConnexion.setOnMouseClicked(mc);
    }

    public Object getConnexion() {
        return btnConnexion;
    }




}