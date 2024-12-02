package model;

import tools.Tool;

public class Connection {

    private Neuron fromNeuron;
    private Neuron toNeuron;
    private double weight;

    public Connection(Neuron fromNeuron, Neuron toNeuron) {
        this.fromNeuron = fromNeuron;
        this.toNeuron = toNeuron;
        this.weight = Tool.rndDouble(-1.0, 1.0);
    }

    public Neuron getFromNeuron() {
        return fromNeuron;
    }

    public void setFromNeuron(Neuron fromNeuron) {
        this.fromNeuron = fromNeuron;
    }

    public Neuron getToNeuron() {
        return toNeuron;
    }


    public void setToNeuron(Neuron toNeuron) {
        this.toNeuron = toNeuron;
    }


    public double getWeight() {
        return weight;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }
}