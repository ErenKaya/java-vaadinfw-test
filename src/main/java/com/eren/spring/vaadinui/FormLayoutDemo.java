package com.eren.spring.vaadinui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;

@SpringUI(path = "/formlayout")
@Title("FormLayout Demo")
@Theme("valo")
public class FormLayoutDemo extends UI {

	@Override
	protected void init(VaadinRequest request) {

		FormLayout fLayout = new FormLayout();
		TextField name = new TextField("İsim");
		name.setIcon(FontAwesome.USER);
		TextField address = new TextField("Adres");
		address.setIcon(FontAwesome.ROAD);

		fLayout.addComponent(name);
		fLayout.addComponent(address);
		setContent(fLayout);

	}

}