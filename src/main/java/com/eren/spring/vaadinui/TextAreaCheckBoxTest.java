package com.eren.spring.vaadinui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CheckBox;

@SpringUI(path = "/textarea")
@Title("TextArea Test")
@Theme("valo")
public class TextAreaCheckBoxTest extends UI {

	@Override
	protected void init(VaadinRequest request) {
		VerticalLayout vLayout = new VerticalLayout();
		vLayout.setSizeFull();
		HorizontalLayout hLayout = new HorizontalLayout();
		hLayout.setHeight("25");
		HorizontalLayout hLayout_2 = new HorizontalLayout();
		hLayout_2.setHeight("75");
		Label showResult = new Label("for Glory");
		TextArea tArea = new TextArea();
		tArea.setWordwrap(true);
		Button sendButton = new Button("SEND IT");
		CheckBox cBox = new CheckBox();
		sendButton.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				if (cBox.getValue() == true) {
					if(tArea.getValue()==""){
						showResult.setValue("True");
					}
					showResult.setValue(tArea.getValue());
				} else {
					showResult.setValue("False");
				}
			}
		});
		hLayout.addComponent(tArea);
		hLayout.addComponent(cBox);
		hLayout.addComponent(sendButton);
		vLayout.addComponent(hLayout);
		hLayout_2.addComponent(showResult);
		vLayout.addComponent(hLayout_2);
		setContent(vLayout);
	}

}
