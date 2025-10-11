package com.slsf.crud_usuarios.controller;

import com.slsf.crud_usuarios.model.Usuario;
import com.slsf.crud_usuarios.service.UsuarioService;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

import java.awt.*;
import java.lang.classfile.Label;

public class UserFormController {

    @FXML
    private Label titleLabel;
    @FXML
    private TextField nomeField;
    @FXML
    private TextField sobrenomeField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField loginField;
    @FXML
    private TextField telefoneField;
    @FXML
    private DatePicker dataNascimentoPicker;
    @FXML
    private ChoiceBox<String> sexoChoiceBox;
    @FXML
    private TextField enderecoField;

    private Stage stage;
    private Usuario usuario;
    private UsuarioService usuarioService;

    public void initialize(){

    }
    public void setStage(){

    }
    public void setUsuario(){

    }
    @FXML
    public void handleSalvar(){

    }

}
