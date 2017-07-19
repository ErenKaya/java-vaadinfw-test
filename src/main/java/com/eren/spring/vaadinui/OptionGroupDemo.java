package com.eren.spring.vaadinui;

import java.util.Set;

import com.eren.spring.data.lecture74.Student;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.UI;

@SpringUI(path = "/optiongroup")
@Theme("valo")
@Title("Option Grop Demo")
public class OptionGroupDemo extends UI {

	@Override
	protected void init(VaadinRequest request) {
		HorizontalLayout root = new HorizontalLayout();
		Student s1 = new Student("Narj", 25);
		Student s2 = new Student("Marildo", 14);
		Student s3 = new Student("Mahmut", 18);
		OptionGroup optionGroup = new OptionGroup("Universities");
		optionGroup.setMultiSelect(true);
		optionGroup.addItem(s1);
		optionGroup.addItem(s2);
		optionGroup.addItem(s3);
		optionGroup.addValueChangeListener(new ValueChangeListener() {
			@Override
			public void valueChange(ValueChangeEvent event) {
				Set<Student> students = (Set<Student>) event.getProperty().getValue();
				for (Student s : students) {
					System.out.println(s.getAge());
				}
			}
		});

		root.addComponent(optionGroup);
		setContent(root);
	}
}
