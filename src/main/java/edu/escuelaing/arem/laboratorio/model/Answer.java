/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.laboratorio.model;

/**
 *
 * @author Nicolás
 */
public class Answer {
    private String operation;
    private Double input;
    private Double output;
    
    public Answer(){
        
    }

    public Answer(String operation, Double input, Double output) {
        this.operation = operation;
        this.input = input;
        this.output = output;
    }
    
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Double getInput() {
        return input;
    }

    public void setInput(Double input) {
        this.input = input;
    }

    public Double getOutput() {
        return output;
    }

    public void setOutput(Double output) {
        this.output = output;
    }
    
    
}
