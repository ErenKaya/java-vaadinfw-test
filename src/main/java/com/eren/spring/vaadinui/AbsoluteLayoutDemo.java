package com.eren.spring.vaadinui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

@SpringUI(path = "/absolute")
@Title("AbsoluteLayout Demo")
@Theme("valo")
public class AbsoluteLayoutDemo extends UI {

	@Override
	protected void init(VaadinRequest request) {
		AbsoluteLayout aLayout = new AbsoluteLayout();
		aLayout.setWidth("500px");
		aLayout.setHeight("300px");
		Button button = new Button("This is a Button");
		aLayout.addComponent(button, "right: 50px; bottom: 100px;");
		
		setContent(aLayout);
		
	}

}
