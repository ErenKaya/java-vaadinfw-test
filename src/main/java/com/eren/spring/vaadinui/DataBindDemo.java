package com.eren.spring.vaadinui;

import com.eren.spring.data.lecture74.Student;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup.CommitException;
import com.vaadin.data.fieldgroup.PropertyId;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

@SpringUI(path = "/databind")
@Title("DataBind Demo")
@Theme("valo")
public class DataBindDemo extends UI {
	@PropertyId("name")
	private TextField nameField;
	@PropertyId("age")
	private TextField ageField;

	@Override
	protected void init(VaadinRequest request) {

		VerticalLayout vLayout = new VerticalLayout();
		vLayout.setMargin(true);
		vLayout.setHeight("100%");
		
		nameField = new TextField("Name");
		ageField = new TextField("Age");
		
		Student student = new Student();
		BeanFieldGroup<Student> fieldGroup = new BeanFieldGroup<>(Student.class);
		fieldGroup.bind(nameField, "name");
		fieldGroup.bind(ageField,"age");
		fieldGroup.setItemDataSource(student);
		
		Button button = new Button("SHOW");
		button.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				try {
					fieldGroup.commit();
					System.out.println(student);
				} catch (CommitException e) {
					e.printStackTrace();
				}
			}
		});
		vLayout.addComponent(nameField);
		vLayout.addComponent(ageField);
		vLayout.addComponent(button);
		setContent(vLayout);
		

	}

}