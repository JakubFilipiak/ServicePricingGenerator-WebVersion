package com.jakubfilipiak.ServicePricingGeneratorSpring.domain;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by Jakub Filipiak on 06.04.2019.
 */
public class Pricing {

    private String name;
    private String number;
    private LocalDate preparationDate;
    private LocalDate validityDate;

    private Author author;
    private Company company;
    private Client client;

    private List<Service> services;

    private double netCost;
    private double taxCost;
    private double totalCost;
    private int totalAmountOfHours;

    private String summary;
    private String comment;
}
