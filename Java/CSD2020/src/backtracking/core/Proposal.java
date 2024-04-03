/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtracking.core;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Proposal extends ArrayList<Integer> implements Comparable<Proposal> {

    double totalCost; // cost of the proposal

    public Proposal() {
        super();
    }

    public int compareTo(Proposal o) {  // for sorting if needed
        return totalCost < o.totalCost ? -1 : totalCost > o.totalCost ? 1 : 0;
    }

    public ArrayList getRealObjects(VarSet varSet) {
        ArrayList realProposal = new ArrayList();
        for (int i = 0; i < varSet.size(); i++) {
            Variable v = varSet.get(i);
            int realIndex = this.get(i); // in realdomain
            IndexDomain indexDomain = v.getIndexDomain();
            realProposal.add(indexDomain.getRealValue(realIndex));
        }
        return realProposal;
    }

    //getter, setters
    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
