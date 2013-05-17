package org.wickedsource;

import org.apache.wicket.bean.validation.PropertyValidator;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);
		
		add(new FeedbackPanel("feedback"));

		Person person = new Person();
		IModel<Person> personModel = Model.of(person);

		Form<Person> personForm = new Form<Person>("personForm") {
			@Override
			protected void onSubmit() {
				System.out.println("Person successfully submitted!");
			}
		};
		add(personForm);

		TextField<String> nameField = new TextField<String>("name",
				new PropertyModel<String>(person, "name"));
		nameField.add(new PropertyValidator<String>());
		personForm.add(nameField);

		TextField<Integer> ageField = new TextField<Integer>("age",
				new PropertyModel<Integer>(person, "age"));
		ageField.add(new PropertyValidator<Integer>());
		personForm.add(ageField);

		TextField<String> phoneField = new TextField<String>("phone",
				new PropertyModel<String>(person, "phone"));
		phoneField.add(new PropertyValidator<String>());
		personForm.add(phoneField);
		
		
	}
}
