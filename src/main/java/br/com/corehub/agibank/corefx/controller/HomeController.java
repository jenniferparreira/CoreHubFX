package br.com.corehub.agibank.corefx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomeController {

    private String userName;

    @FXML
    private Label labelNomeUsuario;

    @FXML
    public void initialize() {
    }

//    @FXML
//    private VBox containerContas; // O container do ScrollPane
//
//    @FXML
//    public void initialize() {
//
//    }
//
//    private void carregarContas(ArrayList<Conta> contas) throws IOException {
//        for (int i = 0; i < contas.toArray().length; i++) {
//            // Carrega o .fxml da conta
//            Pane contaView = FXMLLoader.load(getClass().getResource("/br/com/corehub/agibank/corefx/view/" + fxml));
//            containerContas.getChildren().add(contaView); // Adiciona ao VBox
//        }
//    }
}