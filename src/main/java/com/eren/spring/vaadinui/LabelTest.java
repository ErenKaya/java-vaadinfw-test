package com.eren.spring.vaadinui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI(path = "/labeltest")
@Title("This is the title")
@Theme("valo")
public class LabelTest extends UI {

	@Override
	protected void init(VaadinRequest request) {
		final VerticalLayout verticalLayout = new VerticalLayout();
		Label label = new Label("<b><i>Welcome to spring framework with vaadin</b></i>", ContentMode.HTML);
		verticalLayout.addComponent(label);
		setContent(verticalLayout);
	}
}
