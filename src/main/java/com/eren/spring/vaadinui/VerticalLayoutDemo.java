package com.eren.spring.vaadinui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI(path = "/verticallayout")
@Title("VerticalLayout Demo")
@Theme("valo")
public class VerticalLayoutDemo extends UI {

	@Override
	protected void init(VaadinRequest request) {
		VerticalLayout vLayout = new VerticalLayout();
		Label vLabelFirst = new Label("This is first line");
		Label vLabelSecond = new Label("This is second line");
		Label vLabelThird = new Label("This is third line");
		Label vLabelForth = new Label("This is forth line");
		
		vLabelFirst.setWidthUndefined();
		vLabelSecond.setWidthUndefined();
		vLabelThird.setWidthUndefined();
		vLabelForth.setWidthUndefined();
		
		
		vLayout.addComponent(vLabelFirst);
		vLayout.addComponent(vLabelSecond);
		vLayout.addComponent(vLabelThird);
		vLayout.addComponent(vLabelForth);
		
		vLayout.setComponentAlignment(vLabelFirst, Alignment.TOP_CENTER);
		vLayout.setComponentAlignment(vLabelSecond, Alignment.MIDDLE_RIGHT);
		vLayout.setComponentAlignment(vLabelThird, Alignment.MIDDLE_LEFT);
		vLayout.setComponentAlignment(vLabelForth, Alignment.BOTTOM_CENTER);
		
		setContent(vLayout);
	}

}
