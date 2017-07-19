package com.eren.spring.vaadinui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.combobox.FilteringMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;

@SpringUI(path = "/combobox")
@Title("ComboBox Demo")
@Theme("valo")
public class ComboBoxDemo extends UI {

	@Override
	protected void init(VaadinRequest request) {
		HorizontalLayout hRoot = new HorizontalLayout();
		ComboBox comboBox = new ComboBox("Selection");
		comboBox.setFilteringMode(FilteringMode.CONTAINS);
		comboBox.addItem("Ömer Hayyam");
		comboBox.addItem("Mevlana R.A");
		comboBox.addItem("Hz. Ebubekir");
		comboBox.addItem("Hz. Ömer");
		comboBox.addItem("Hz. Osman");
		comboBox.addItem("Hz. Ali");
		hRoot.addComponent(comboBox);
		setContent(hRoot);
	}

}
