/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handson;

import java.util.Random;

/**
 *
 * @author zacksanchez
 */
public class Individual
{
    public static final int SIZE = 10;
    private int[] genes = new int[SIZE];
    private int fitnessValue;

    public Individual() 
    {}

    public int getFitnessValue() 
    {
        return fitnessValue;
    }

    public void setFitnessValue(int fitnessValue) 
    {
        this.fitnessValue = fitnessValue;
    }

    public int getGene(int index) 
    {
        return genes[index];
    }

    public void setGene(int index, int gene) 
    {
        this.genes[index] = gene;
    }
    
    public int evaluate() 
    {
        int fitness = 0;
        
        for(int i=0; i<SIZE; ++i) { 
            fitness += this.getGene(i);
        }
        
        this.setFitnessValue(fitness);

        return fitness;
    }

    public void mutate() 
    {
        Random rand = new Random();
        
        int index = rand.nextInt(SIZE);
        
        this.setGene(index, 1-this.getGene(index));
    }
    
    public void randGenes() 
    {
        Random rand = new Random();
        
        for(int i=0; i<SIZE; ++i) {
            this.setGene(i, rand.nextInt(2));
        }
    }
}