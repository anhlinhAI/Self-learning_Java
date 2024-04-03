/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtracking.bk.use;

import backtracking.core.BacktrackSolver;
import backtracking.core.Evaluator;
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
public class DogsAndChickens {
    int numOfLeg =0;

    public class DogsAndChickensEval implements Evaluator {
        private int countLegs (Proposal p){
            return p.get(0)*2 + p.get(1) *4;
        }
        public boolean isSatisfied (Proposal p){
            return countLegs(p)== numOfLeg;
        }
    }
    DogsAndChickensEval evaluator;
    public DogsAndChickens (int numOfLegs){
        this.numOfLeg= numOfLegs;
        evaluator = new DogsAndChickensEval();
    }
    public static void main(String[] args) {
        int numOfLegs =100;
        DogsAndChickens problem = new DogsAndChickens(numOfLegs);
        int minVal =1;
        int maxVal ;
        
        RealDomain chickDomain = new RealDomain ();
        int val;
        maxVal = (numOfLegs -4) /2 ;
        for(val = minVal; val<= maxVal; val ++) chickDomain.add(val);
        
        RealDomain dogDomain = new RealDomain();
        maxVal = (numOfLegs-2)/4;
        for (val=minVal; val<= maxVal; val++) dogDomain.add(val);
        VarSet varSet = new VarSet();
        IndexDomain D= new IndexDomain (chickDomain);
        varSet.add(new Variable (D));
        D = new IndexDomain (dogDomain);
        varSet.add(new Variable (D));
        Evaluator evaluator = problem.evaluator;
        BacktrackSolver solver = new BacktrackSolver(varSet, evaluator);
        ArrayList<Proposal> solutions;
        solutions = solver.getAllSolution();
        
        int n = solutions.size();
        if(solutions.size()>0){
            System.out.println(n+" solutions were detected:");
            System.out.println("      [chicken, dogs]");
            for(int i=0; i<n; i++)
                System.out.println("A solution: " + solutions.get(i));
        }
        else System.out.println("No solution can be detected!");
    }
}
