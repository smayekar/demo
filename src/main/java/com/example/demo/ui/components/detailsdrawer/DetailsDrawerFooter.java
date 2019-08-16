package com.example.demo.ui.components.detailsdrawer;

import com.example.demo.ui.components.FlexBoxLayout;
import com.example.demo.ui.layout.size.Horizontal;
import com.example.demo.ui.layout.size.Right;
import com.example.demo.ui.layout.size.Vertical;
import com.example.demo.util.UIUtils;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.shared.Registration;

public class DetailsDrawerFooter extends Composite<FlexBoxLayout> {

    private final Button save;
    private final Button cancel;

    public DetailsDrawerFooter() {
        getContent().setPadding(Horizontal.RESPONSIVE_L, Vertical.S);
        getContent().setSpacing(Right.L);
        getContent().setWidth("100%");

        save = UIUtils.createPrimaryButton("Save");
        cancel = UIUtils.createTertiaryButton("Cancel");
        getContent().add(save, cancel);
    }

    public Registration addSaveListener(
            ComponentEventListener<ClickEvent<Button>> listener) {
        return save.addClickListener(listener);
    }

    public Registration addCancelListener(
            ComponentEventListener<ClickEvent<Button>> listener) {
        return cancel.addClickListener(listener);
    }

}
