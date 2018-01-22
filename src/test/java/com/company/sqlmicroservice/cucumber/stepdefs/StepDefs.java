package com.company.sqlmicroservice.cucumber.stepdefs;

import com.company.sqlmicroservice.SqlMicroServiceUsingUaaApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SqlMicroServiceUsingUaaApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
