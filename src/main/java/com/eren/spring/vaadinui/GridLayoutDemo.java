package com.eren.spring.vaadinui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;

@SpringUI(path = "/gridlayout")
@Title("GridLayout Demo")
@Theme("valo")
public class GridLayoutDemo extends UI {

	@Override
	protected void init(VaadinRequest request) {

		GridLayout gLayout = new GridLayout(3,3);
		Button button = new Button("This is the new row button");
		button.setWidth("100%");
		gLayout.addComponent(new TextField(), 0, 0);
		gLayout.addComponent(new Button("Save"), 1, 0);
		gLayout.addComponent(new Button("Remove"), 2, 0);
		gLayout.addComponent(button, 0, 1, 2, 1);
		setContent(gLayout);

	}

}