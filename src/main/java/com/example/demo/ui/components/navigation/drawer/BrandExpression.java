package com.example.demo.ui.components.navigation.drawer;

import com.example.demo.util.UIUtils;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

public class BrandExpression extends Composite<Div> {

    private String CLASS_NAME = "brand-expression";

    private Image logo;
    private Label title;

    public BrandExpression(String text) {
        getContent().setClassName(CLASS_NAME);

        logo = new Image(UIUtils.IMG_PATH + "cl_logo.png", "");
        logo.addClassName(CLASS_NAME + "__logo");
        logo.setAlt(text + " logo");

        title = UIUtils.createH3Label(text);
        title.addClassName(CLASS_NAME + "__title");

        getContent().add(logo, title);
    }

}
