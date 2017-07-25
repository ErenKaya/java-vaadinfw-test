package com.eren.spring.vaadinui;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class SecondView extends VerticalLayout implements View{
	public static final String NAME = "SecondView";
	@Override
	public void enter(ViewChangeEvent event) {
	 	Label label = new Label("the Second View ");
	 	addComponent(label);
	}

}
