package com.eren.spring.vaadinui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@SpringUI(path = "/paneldemo")
@Title("Panel Demo")
@Theme("valo")
public class PanelDemo extends UI {

	@Override
	protected void init(VaadinRequest request) {

		VerticalLayout root = new VerticalLayout();
		root.setMargin(true);
		root.setHeight("100%");
		Panel panel = new Panel("Login");
		panel.setSizeUndefined();
		root.addComponent(panel);
		root.setComponentAlignment(panel, Alignment.MIDDLE_CENTER);
		FormLayout loginLayout = new FormLayout();
		TextField username = new TextField("Username");
		username.setIcon(FontAwesome.USER);
		loginLayout.addComponent(username);
		PasswordField passwordField = new PasswordField("Password");
		passwordField.setIcon(FontAwesome.CHAIN);
		loginLayout.addComponent(passwordField);
		Button loginButton = new Button("Login");
		loginButton.setStyleName(ValoTheme.BUTTON_FRIENDLY);
		loginButton.setWidth("100%");
		Button signUpButton = new Button("Sign Up");
		signUpButton.setWidth("100%");
		signUpButton.setStyleName(ValoTheme.BUTTON_PRIMARY);
		HorizontalLayout hLayout = new HorizontalLayout(loginButton, signUpButton);
		hLayout.setExpandRatio(loginButton, 1);
		hLayout.setExpandRatio(signUpButton, 1);
		loginLayout.addComponent(hLayout);
		loginLayout.setSizeUndefined();
		loginLayout.setMargin(true);
		panel.setContent(loginLayout);
		setContent(root);

	}

}