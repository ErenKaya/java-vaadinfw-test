package com.eren.spring.vaadinui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Tree;
import com.vaadin.ui.UI;

@SpringUI(path = "/treedemo")
@Title("Tree Demo")
@Theme("valo")
public class TreeDemo extends UI {

	@Override
	protected void init(VaadinRequest request) {
		HorizontalLayout hRoot = new HorizontalLayout();
		Tree menu = new Tree();
		menu.addItem("Turkey");
		menu.addItem("Russia");
		menu.expandItem("Russia");
		menu.expandItem("Turkey");
		menu.addItem("Istanbul");
		menu.addItem("Bursa");
		menu.setChildrenAllowed("Istanbul", false);
		menu.setChildrenAllowed("Bursa", false);
		menu.setParent("Bursa","Turkey");
		menu.setParent("Istanbul","Turkey");
		menu.addItem("Moskov");
		menu.setChildrenAllowed("Moskov", false);
		menu.setParent("Moskov","Russia");
		menu.addValueChangeListener(new ValueChangeListener() {
			
			@Override
			public void valueChange(ValueChangeEvent event) {
				String location = (String)event.getProperty().getValue();
				System.out.println(location);
				
			}
		});
		
		hRoot.addComponent(menu);
		setContent(hRoot);
	}

}
