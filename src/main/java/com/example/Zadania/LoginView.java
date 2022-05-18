package com.example.Zadania;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("login")
public class LoginView extends Composite {

    VerticalLayout layout = new VerticalLayout();

    @Override
    protected Component initContent(){
        TextField username = new TextField("Username");
        PasswordField passwordField = new PasswordField("Password");

        layout.add(
                new H2("Login"),
                username,
                passwordField,
                new Button("Login")
        );

        layout.setAlignItems(FlexComponent.Alignment.CENTER);
        layout.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        return layout;
    }
}
