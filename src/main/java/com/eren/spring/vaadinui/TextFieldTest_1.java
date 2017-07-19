package com.eren.spring.vaadinui;


import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.data.util.ObjectProperty;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;

@SpringUI(path = "/textfield1")
@Title("This is the title")
@Theme("valo")
public class TextFieldTest_1 extends UI {

	@Override
	protected void init(VaadinRequest request) {
		HorizontalLayout horizantalLayout = new HorizontalLayout();
		String nameValue = "";
		ObjectProperty<String> property = new ObjectProperty<>(nameValue);
		TextField textField = new TextField("Name :", property);
		textField.setImmediate(true);
		Label label = new Label(property);
		label.setCaption("Result :");
		horizantalLayout.addComponent(textField);
		horizantalLayout.addComponent(label);
		setContent(horizantalLayout);

	}

}
