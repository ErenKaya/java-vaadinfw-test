package com.eren.spring.vaadinui;

import java.util.ArrayList;
import java.util.List;

import com.eren.spring.data.lecture74.Student;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.grid.HeightMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Grid.MultiSelectionModel;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.Grid.SingleSelectionModel;

@SpringUI(path = "/griddemo")
@Title("Grid Demo")
@Theme("valo")
public class GridDemo extends UI {

	@Override
	protected void init(VaadinRequest request) {
		HorizontalLayout hRoot = new HorizontalLayout();
		List<Student> students = new ArrayList<>();
		students.add(new Student("Ahmet Yenice", 25));
		students.add(new Student("Yahya Murtaza", 56));
		students.add(new Student("Veli Sirtaki", 21));

		BeanItemContainer<Student> studentContainer = new BeanItemContainer<>(Student.class, students);
		Grid grid = new Grid(studentContainer);
		grid.setSelectionMode(SelectionMode.MULTI);
		grid.setColumnOrder("name", "age");
		grid.setHeightMode(HeightMode.ROW);
		grid.setHeightByRows(students.size());
		Button bRemove = new Button("Remove", new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				// SINGLE MODE
				// SingleSelectionModel singleSelectionModel =
				// (SingleSelectionModel)grid.getSelectionModel();
				// Student selectedStudent =
				// (Student)singleSelectionModel.getSelectedRow();
				//
				// grid.getContainerDataSource().removeItem(selectedStudent);
				// grid.getSelectionModel().reset();
				// Multiple Mode
				MultiSelectionModel multiSelectionModel = (MultiSelectionModel) grid.getSelectionModel();
				for (Object selectedItem : multiSelectionModel.getSelectedRows()) {
					grid.getContainerDataSource().removeItem(selectedItem);
				}
				grid.getSelectionModel().reset();
			}
		});
		hRoot.addComponent(grid);
		hRoot.addComponent(bRemove);
		setContent(hRoot);
	}

}
