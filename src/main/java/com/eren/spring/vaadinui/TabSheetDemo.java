package com.eren.spring.vaadinui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.UI;

@SpringUI(path = "/tabsheet")
@Title("TabSheet Demo")
@Theme("valo")
public class TabSheetDemo extends UI {

	@Override
	protected void init(VaadinRequest request) {
		HorizontalLayout hRoot = new HorizontalLayout();
		hRoot.setWidth("100%");
		TabSheet tabs = new TabSheet();
		tabs.setWidth("50%");
		HorizontalLayout tLayoutPage1 = new HorizontalLayout();
		tLayoutPage1.addComponent(new Label("This is just Layout 1"));
		HorizontalLayout tLayoutPage2 = new HorizontalLayout();
		tLayoutPage2.addComponent(new Label("This is just Layout 2"));

		tabs.addTab(tLayoutPage1, "PAGE 1");
		tabs.addTab(tLayoutPage2, "PAGE 2");
		
		hRoot.addComponent(tabs);
		hRoot.setComponentAlignment(tabs, Alignment.TOP_CENTER);
		setContent(hRoot);
	}

}
