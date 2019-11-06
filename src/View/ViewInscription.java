package View;

import Controller.Controller;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;




public class ViewInscription {

    private Text titre;
    private Menu model;
    private Group root;
    private Button btnQuitter;
    private Button btnJouer;
    private Text Login;
    private Text MDP;
    private Text Nom;
    private Text Prenom;
    private Text Adresse;
    private Text CodePostal;
    private Text Ville;
    private Text AdresseEmail;
    private TextField loginTex;
    private PasswordField MDPTex;
    private TextField NomTex;
    private TextField PrenomTex;
    private TextField AdresseTex;
    private TextField CodePTex;
    private TextField VilleTex;
    private TextField AdresseEmailTex;



    /**
     * Constructeur du menu principal
     *
     * @param model (Modèle correspondant au menu)
     * @param root  (Groupe principal de la vue)
     */
    ViewInscription(Menu model, Group root) {
        this.root = root;
        this.model = model;
        initTitre();
        Login = initText(120, 200, "Login");
        loginTex = initChamp(210, 185);
        MDP = initText(120, 250, "Mot De Passe");
        MDPTex = initChampMdp(210, 235);
        Nom = initText(120, 300, "Nom");
        NomTex = initChamp(210, 285);
        Prenom = initText(120, 350, "Prenom");
        PrenomTex = initChamp(210, 335);
        Adresse = initText(120, 400, "Adresse");
        AdresseTex = initChamp(210, 385);
        CodePostal = initText(120, 450, "Code Postal");
        CodePTex = initChamp(210, 430);
        Ville = initText(120, 500, "Ville");
        VilleTex = initChamp(210, 485);
        AdresseEmail = initText(120, 550, "Adresse Email");
        AdresseEmailTex = initChamp(210, 535);
        btnJouer = initButton(110, 600, "VALIDER");
        //btnOptions = initButton(110, 650, "Options");
        btnQuitter = initButton(210, 600, "QUITTER");
        //initBackground();
        setVueCompleteInscription();
    }

    private void initTitre() {
        titre = new Text(150, 180, "INSCRIPTION");
        titre.setLayoutX(60);
        titre.setLayoutY(-20);
        titre.setFill(Color.BLACK);
    }

    public Button initButton(int longeur, int largeur, String texteB) {

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



    void setVueCompleteInscription() {
        root.getChildren().clear();
        root.getChildren().add(titre);
        root.getChildren().add(btnJouer);
        //root.getChildren().add(btnOptions);
        root.getChildren().add(btnQuitter);
        root.getChildren().add(Login);
        root.getChildren().add(MDP);
        root.getChildren().add(Nom);
        root.getChildren().add(Prenom);
        root.getChildren().add(Adresse);
        root.getChildren().add(CodePostal);
        root.getChildren().add(Ville);
        root.getChildren().add(AdresseEmail);
        root.getChildren().add(loginTex);
        root.getChildren().add(MDPTex);
        root.getChildren().add(NomTex);
        root.getChildren().add(PrenomTex);
        root.getChildren().add(AdresseTex);
        root.getChildren().add(CodePTex);
        root.getChildren().add(VilleTex);
        root.getChildren().add(AdresseEmailTex);
    }


    void setEvents(Controller mc) {
       btnJouer.setOnMouseClicked(mc);
        btnQuitter.setOnMouseClicked(mc);
        MDPTex.copy();
        loginTex.copy();
    }

    public Button getQuitter(){
        return btnQuitter;
    }

    public Button getBtnJouer() {
       return btnJouer;
   }

    public PasswordField getMDPTex() {
        return MDPTex;
    }
    public TextField getloginTex() {
        return loginTex;
    }




}