package org.mavenproject1.javafx_crestview_bank.Models;

import org.mavenproject1.javafx_crestview_bank.Views.ViewsFactory;

public class Model {

    private static Model model;
    private  final ViewsFactory viewsFactory;

    private Model(ViewsFactory viewsFactory) {
        this.viewsFactory = viewsFactory;
    }
    public static synchronized Model getInstance() {
        if (model == null) {
            model = new Model(new ViewsFactory());
        }
        return model;
    }
    public ViewsFactory getViewsFactory() {
        return viewsFactory;
    }
}
