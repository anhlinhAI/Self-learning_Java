/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtracking.bk.use;

import backtracking.core.BacktrackSolver;
import backtracking.core.DefaultEvaluator;
import backtracking.core.IndexDomain;
import backtracking.core.Proposal;
import backtracking.core.RealDomain;
import backtracking.core.VarSet;
import backtracking.core.Variable;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class BitStrGenerator {
    public static void main(String[] args) {
        int numOfVars =4;
        System.out.println("BIT STRING GENERATOR");
        int i;
        RealDomain booleanSet = new RealDomain();
        booleanSet.add(0);
        booleanSet.add(1);
        VarSet varSet= new VarSet(); // create a set of variable
        for(i=0; i<numOfVars;i++){
            IndexDomain D=new IndexDomain (booleanSet);
            varSet.add(new Variable (D));
        }
        // create a proposal evaluator
        DefaultEvaluator evaluator = new DefaultEvaluator();
        // create solver
        BacktrackSolver solver = new BacktrackSolver (varSet, evaluator);
        ArrayList<Proposal> solutions;
        // get one solution
        System.out.println("Get ONE solution: ");
        Proposal sol=solver.getOneSolution();
        // output one solution
        if(sol!=null)
            System.out.println("A solution:" + sol + "\n");
        else System.out.println("No solution!\n");
        solutions =solver.getAllSolution();
        int n = solutions.size();
        if(n>0){
            System.out.println(n+"solutions were detected:");
            for(i=0;i<n;i++)
                System.out.println("A solution:" + solutions.get(i));
        }
        else System.out.println("No solution can be detected!");
    }
    
}
