package com.eren.spring.vaadinui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.event.FieldEvents.TextChangeEvent;
import com.vaadin.event.FieldEvents.TextChangeListener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.AbstractTextField.TextChangeEventMode;

@SpringUI(path = "/textfieldevents")
@Title("Text Field Event Test")
@Theme("valo")
public class TextFieldTest_2_Events extends UI {

	@Override
	protected void init(VaadinRequest request) {
		HorizontalLayout horizantalLayout = new HorizontalLayout();
		final Label counterLabel = new Label();
		counterLabel.setImmediate(true);
		TextField tField = new TextField("Character Counter");
		tField.addTextChangeListener(new TextChangeListener() {

			@Override
			public void textChange(TextChangeEvent event) {
				int length = event.getText().length();
				counterLabel.setValue("String length of count :"+length);
			}
		});
		tField.setTextChangeEventMode(TextChangeEventMode.EAGER);
		horizantalLayout.addComponent(tField);
		horizantalLayout.addComponent(counterLabel);
		setContent(horizantalLayout);
	}

}
