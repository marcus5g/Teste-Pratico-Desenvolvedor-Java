package com.teste.pratico.model;

import org.primefaces.model.badge.BadgeModel;
import org.primefaces.model.badge.DefaultBadgeModel;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class MenuBadgeView {

    private BadgeModel badgeModel;

    @PostConstruct
    public void init() {
        badgeModel = DefaultBadgeModel.builder()
                .severity("danger")
                .build();
    }

    public BadgeModel getBadgeModel() {
        return badgeModel;
    }
}