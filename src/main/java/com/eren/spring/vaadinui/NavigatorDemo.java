package com.eren.spring.vaadinui;


import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI(path = "/navigatordemo")
@Title("*NavigatorDemo*** Demo")
@Theme("valo")
public class NavigatorDemo extends UI {

	@Override
	protected void init(VaadinRequest request) {

		VerticalLayout hLayout = new VerticalLayout();
		Button firstViewButton = new Button("Navigate to first view");
		Button secondViewButton = new Button("Navigate to second view");
		
		Panel viewContainer = new Panel();
		Navigator navigator = new Navigator(this,viewContainer);
		
		navigator.addView(FirstView.NAME, new FirstView());
		navigator.addView(SecondView.NAME, new SecondView());
		
		hLayout.addComponent(new HorizontalLayout(firstViewButton,secondViewButton ));
		hLayout.addComponent(viewContainer);
		
		navigator.navigateTo(FirstView.NAME);
		
		firstViewButton.addClickListener(event -> navigator.navigateTo(FirstView.NAME));
		secondViewButton.addClickListener(event -> navigator.navigateTo(SecondView.NAME));
		
		
		setContent(hLayout);

	}

}