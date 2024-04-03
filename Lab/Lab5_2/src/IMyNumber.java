/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public interface IMyNumber {
    //Data fields
    //public static double value=0;     //?????????????
    public abstract IMyNumber add(IMyNumber other);
    public IMyNumber sub(IMyNumber other);
    public IMyNumber mul(IMyNumber other);
    public IMyNumber div(IMyNumber other);
}
